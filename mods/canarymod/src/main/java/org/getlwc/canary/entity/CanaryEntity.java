package org.getlwc.canary.entity;

import org.getlwc.Location;
import org.getlwc.canary.LWC;
import org.getlwc.entity.Entity;

import java.util.UUID;

public class CanaryEntity implements Entity {

    /**
     * The LWC plugin object
     */
    private LWC plugin;

    /**
     * The entity's handle
     */
    private net.canarymod.api.entity.Entity handle;

    public CanaryEntity(LWC plugin, net.canarymod.api.entity.Entity handle) {
        this.plugin = plugin;
        this.handle = handle;
    }

    /**
     * {@inheritDoc}
     */
    public UUID getUUID() {
        return handle.getUUID();
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return plugin.getName();
    }

    /**
     * {@inheritDoc}
     */
    public Location getLocation() {
        return new Location(plugin.getWorld(handle.getWorld().getName()), handle.getX(), handle.getY(), handle.getZ());
    }

}