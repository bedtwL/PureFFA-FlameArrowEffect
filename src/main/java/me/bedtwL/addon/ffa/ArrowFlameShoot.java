package me.bedtwL.addon.ffa;

import me.bedtwL.ffa.api.PlayerArrowShootEffect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ArrowFlameShoot implements PlayerArrowShootEffect {
    @Override
    public void ArrowShootEffect(Location location, Player player) {
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
