package org.slave.minecraft.moarachievements.events;

import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.world.World;

/**
 * Created by Master on 9/3/2018 at 11:03 AM.
 *
 * @author Master
 */
public final class EventPortalCreate extends Event {

    public final World world;

    private final int x;
    private final int y;
    private final int z;

    public EventPortalCreate(final World world, final int x, final int y, final int z) {
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
    }

}
