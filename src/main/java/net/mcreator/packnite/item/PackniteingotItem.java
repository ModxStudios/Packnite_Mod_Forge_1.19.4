
package net.mcreator.packnite.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PackniteingotItem extends Item {
	public PackniteingotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
