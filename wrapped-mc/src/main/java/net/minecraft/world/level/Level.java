package net.minecraft.world.level;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.entity.FuelValues;

public abstract class Level implements LevelReader {

    public ResourceKey<Level> dimension() {
        throw new RuntimeException();
    }

    public abstract FuelValues fuelValues();
}
