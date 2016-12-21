package org.slave.minecraft.moarachievements.proxy;

import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import org.slave.minecraft.moarachievements.common.ClientTickHandlerMA;

public final class ClientProxyMA extends CommonProxyMA {

    public static final ClientTickHandlerMA tickHandler = new ClientTickHandlerMA();

    @Override
    public void registerTickers() {
        TickRegistry.registerTickHandler(
                tickHandler,
                Side.CLIENT
        );
    }

}
