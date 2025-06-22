package me.bedtwL.addon.ffa;

import me.bedtwL.ffa.api.EffectAddon;

import java.util.UUID;

public class FlameArrowMain implements EffectAddon {
    @Override
    public String getName() {
        return "FlameArrow";
    }

    @Override
    public String getAuthor() {
        return "bedtwL";
    }
    @Override
    public UUID authorUUID() {
        return UUID.fromString("f6edfcd8-f6b8-4e57-9367-8648953eaae2");
    }

    @Override
    public void onEnable() {
        new ArrowFlameShoot().registerArrowShootEffect();
        new ArrowFlameHit().registerArrowHitEffect();
    }

    @Override
    public void onDisable() {
        new ArrowFlameHit().unregisterArrowHitEffect();
        new ArrowFlameShoot().unregisterArrowShootEffect();
    }
}
