package com.cmdpro.databank.mixin.client;

import com.mojang.blaze3d.audio.Channel;
import net.minecraft.client.sounds.ChannelAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ChannelAccess.ChannelHandle.class)
public interface ChannelHandleMixin {
    @Accessor("channel")
    public Channel getChannel();
}
