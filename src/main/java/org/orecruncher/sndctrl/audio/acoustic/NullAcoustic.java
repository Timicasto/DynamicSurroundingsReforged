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

import javax.annotation.Nonnull;

/**
 * Simple acoustic that has no sound.
 */
@OnlyIn(Dist.CLIENT)
public final class NullAcoustic implements IAcoustic {

    public static final IAcoustic INSTANCE = new NullAcoustic();

    private NullAcoustic() {

    }

    @Override
    public String getName() {
        return "No Acoustic";
    }

    @Override
    public void playAt(@Nonnull BlockPos pos, @Nonnull AcousticEvent event) {

    }

    @Override
    public void playAt(@Nonnull Vec3d pos, @Nonnull AcousticEvent event) {

    }

    @Override
    public void playNear(@Nonnull Entity entity, @Nonnull AcousticEvent event) {

    }

    @Override
    public void playBackground(@Nonnull AcousticEvent event) {

    }
}
