package me.bedtwL.addon.ffa;

import me.bedtwL.ffa.api.EffectAddon;

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
