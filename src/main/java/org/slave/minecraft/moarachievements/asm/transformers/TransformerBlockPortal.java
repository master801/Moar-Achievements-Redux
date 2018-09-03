package org.slave.minecraft.moarachievements.asm.transformers;

import net.minecraft.block.BlockPortal;
import net.minecraft.launchwrapper.IClassTransformer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.slave.minecraft.moarachievements.asm.MA_ASM;
import org.slave.minecraft.moarachievements.events.EventPortalCreate;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Master on 9/3/2018 at 11:06 AM.
 *
 * @author Master
 */
public final class TransformerBlockPortal implements IClassTransformer {

    @Override
    public byte[] transform(final String name, final String transformedName, final byte[] basicClass) {
        if (basicClass == null) return new byte[0];

        if (transformedName.equals("net.minecraft.block.BlockPortal")) {
            ClassReader classReader = new ClassReader(basicClass);
            ClassNode classNode = new ClassNode();

            classReader.accept(new ClassVisitorBlockPortal(Opcodes.ASM5, classNode), 0);

            ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
            classNode.accept(classWriter);
            byte[] classData = classWriter.toByteArray();

            if (MA_ASM.DEBUG) {
                File file = new File("asm", transformedName + ".class");
                file.getParentFile().mkdirs();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(classData);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }

            return classData;
        }

        return basicClass;
    }

    private static final class ClassVisitorBlockPortal extends ClassVisitor {

        public ClassVisitorBlockPortal(final int api, final ClassVisitor cv) {
            super(api, cv);
        }

        @Override
        public MethodVisitor visitMethod(final int access, final String name, final String desc, final String signature, final String[] exceptions) {
            MethodVisitor mv = super.visitMethod(access, name, desc, signature, exceptions);
            if (access == Opcodes.ACC_PUBLIC && (name.equals("e") || name.equals("func_150000_e")) && desc.equals("(Lnet/minecraft/world/World;III)Z")) {
                return new MethodVisitor(super.api, mv) {

                    @Override
                    public void visitMethodInsn(final int opcode, final String owner, final String name, final String desc, final boolean itf) {
                        super.visitMethodInsn(opcode, owner, name, desc, itf);

                        if (opcode == Opcodes.INVOKEVIRTUAL && owner.equals("net/minecraft/block/BlockPortal$Size") && name.equals("func_150859_c") && desc.equals("()V")) {
                            super.visitLabel(new Label());
                            super.visitFieldInsn(Opcodes.GETSTATIC, "net/minecraftforge/common/MinecraftForge", "EVENT_BUS", "Lcpw/mods/fml/common/eventhandler/EventBus;");
                            super.visitTypeInsn(Opcodes.NEW, "org/slave/minecraft/moarachievements/events/EventPortalCreate");
                            super.visitInsn(Opcodes.DUP);
                            super.visitVarInsn(Opcodes.ALOAD, 1);
                            super.visitVarInsn(Opcodes.ILOAD, 2);
                            super.visitVarInsn(Opcodes.ILOAD, 3);
                            super.visitVarInsn(Opcodes.ILOAD, 4);
                            super.visitMethodInsn(Opcodes.INVOKESPECIAL, "org/slave/minecraft/moarachievements/events/EventPortalCreate", "<init>", "(Lnet/minecraft/world/World;III)V", false);
                            super.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "cpw/mods/fml/common/eventhandler/EventBus", "post", "(Lcpw/mods/fml/common/eventhandler/Event;)Z", false);
                            super.visitInsn(Opcodes.POP);
                        }
                    }

                };
            }
            return mv;
        }

        private static final class x {

            private int field_150864_e = 0;

            public boolean func_150000_e(World p_150000_1_, int p_150000_2_, int p_150000_3_, int p_150000_4_)
            {
                BlockPortal.Size size = new BlockPortal.Size(p_150000_1_, p_150000_2_, p_150000_3_, p_150000_4_, 1);
                BlockPortal.Size size1 = new BlockPortal.Size(p_150000_1_, p_150000_2_, p_150000_3_, p_150000_4_, 2);

                if (size.func_150860_b() && /*size.*/field_150864_e == 0)
                {
                    size.func_150859_c();
                    MinecraftForge.EVENT_BUS.post(new EventPortalCreate(p_150000_1_, p_150000_2_, p_150000_3_, p_150000_4_));
                    return true;
                }
                else if (size1.func_150860_b() && /*size1.*/field_150864_e == 0)
                {
                    size1.func_150859_c();
                    MinecraftForge.EVENT_BUS.post(new EventPortalCreate(p_150000_1_, p_150000_2_, p_150000_3_, p_150000_4_));
                    return true;
                }
                else
                {
                    return false;
                }
            }

        }

    }

}
