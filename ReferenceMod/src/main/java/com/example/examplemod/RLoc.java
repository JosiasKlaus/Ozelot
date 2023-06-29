package com.example.examplemod;

import net.minecraft.resources.ResourceLocation;

/**
 * Creation of the ResourceLocations for this mod.
 * @author Joh0210
 */
public class RLoc
{
    public static ResourceLocation create(final String path) {
        return new ResourceLocation(ExampleMod.MOD_ID, path);
    }
}
