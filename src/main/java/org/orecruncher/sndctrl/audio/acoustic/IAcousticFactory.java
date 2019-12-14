/*
 * Dynamic Surroundings: Sound Control
 * Copyright (C) 2019  OreCruncher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>
 */

package org.orecruncher.sndctrl.audio.acoustic;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.orecruncher.sndctrl.audio.ISoundInstance;

import javax.annotation.Nonnull;

@OnlyIn(Dist.CLIENT)
public interface IAcousticFactory {
    /**
     * Creates a sound instance centered in the block at the specified position.
     */
    @Nonnull
    ISoundInstance createSoundAt(@Nonnull final BlockPos pos);

    /**
     * Creates a sound instance centered at the specified location.
     */
    @Nonnull
    ISoundInstance createSoundAt(@Nonnull final Vec3d pos);

    /**
     * Creates a sound instance within a random range centered on the specified entity.
     */
    @Nonnull
    ISoundInstance createSoundNear(@Nonnull final Entity entity);

    /**
     * Attaches a sound instance to the specified entity, and will move as the entity moves.
     */
    @Nonnull
    ISoundInstance attachSound(@Nonnull final Entity entity);

    /**
     * Creates a sound instance with no attenuation and is not affected by range or other sound effects.
     */
    @Nonnull
    ISoundInstance createBackgroundSound();

}
