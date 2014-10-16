package com.darkona.adventurebackpack.misc;

import com.darkona.adventurebackpack.reference.ModInfo;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

/**
 * Created on 16/10/2014
 *
 * @author Darkona
 */
public class NyanMovingSound extends MovingSound {

    private final EntityPlayer player;
    private float aFloat = 0.0F;


    public NyanMovingSound(EntityPlayer player) {
        super(new ResourceLocation(ModInfo.MOD_ID, "nyan"));
        this.volume = 1.0f;
        this.player = player;
    }

    /**
     * Updates the JList with a new model.
     */
    @Override
    public void update() {
        if (this.player.isDead) {
            this.donePlaying = true;
        } else {
            this.xPosF = (float) this.player.posX;
            this.yPosF = (float) this.player.posY;
            this.zPosF = (float) this.player.posZ;
            //float f = MathHelper.sqrt_double(this.player.motionX * this.player.motionX + this.player.motionZ * this.player.motionZ);
        }
    }

    @Override
    public ResourceLocation getPositionedSoundLocation() {
        return super.getPositionedSoundLocation();
    }

    @Override
    public boolean canRepeat() {
        return false;
    }

    @Override
    public int getRepeatDelay() {
        return super.getRepeatDelay();
    }

    @Override
    public float getVolume() {
        return super.getVolume();
    }

    @Override
    public float getPitch() {
        return super.getPitch();
    }

    @Override
    public float getXPosF() {
        return super.getXPosF();
    }

    @Override
    public float getYPosF() {
        return super.getYPosF();
    }

    @Override
    public float getZPosF() {
        return super.getZPosF();
    }

    @Override
    public AttenuationType getAttenuationType() {
        return AttenuationType.LINEAR;
    }
}