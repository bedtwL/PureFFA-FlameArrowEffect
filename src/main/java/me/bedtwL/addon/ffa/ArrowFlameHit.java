package me.bedtwL.addon.ffa;

import me.bedtwL.ffa.api.effect.PureArrowHitEffect;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ArrowFlameHit extends PureArrowHitEffect {
    @Override
    public void arrowHitEffect(Location location, Player player) {
        location.getWorld().playEffect(location, Effect.MOBSPAWNER_FLAMES, 0);
        location.getWorld().playEffect(location,Effect.EXPLOSION,0);
    }

    @Override
    public String getName() {
        return "FlameExplosion";
    }

    @Override
    public String getItemNameKey() {
        return "flame-explode-hit";
    }

    @Override
    public ItemStack getItemBase() {
        return new ItemStack(Material.FIREBALL);
    }
}
