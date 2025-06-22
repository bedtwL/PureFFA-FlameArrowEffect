package me.bedtwL.addon.ffa;

import me.bedtwL.ffa.api.PlayerArrowShootEffect;
import me.bedtwL.ffa.api.effect.PureArrowShootEffect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ArrowFlameShoot extends PureArrowShootEffect {
    @Override
    public void arrowShootEffect(Location location, Player player) {
        location.getWorld().playEffect(location, org.bukkit.Effect.MOBSPAWNER_FLAMES, 0);
    }

    @Override
    public String getName() {
        return "FlameTrail";
    }

    @Override
    public String getItemNameKey() {
        return "flame-arrow-shoot";
    }

    @Override
    public ItemStack getItemBase() {
        return new ItemStack(Material.BLAZE_POWDER);
    }
}
