
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.packnite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.packnite.item.PackniteingotItem;
import net.mcreator.packnite.item.PackniteSwordItem;
import net.mcreator.packnite.item.PackniteShovelItem;
import net.mcreator.packnite.item.PacknitePickaxeItem;
import net.mcreator.packnite.item.PackniteItem;
import net.mcreator.packnite.item.PackniteHoeItem;
import net.mcreator.packnite.item.PackniteAxeItem;
import net.mcreator.packnite.item.PackniteArmorItem;
import net.mcreator.packnite.PackniteMod;

public class PackniteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PackniteMod.MODID);
	public static final RegistryObject<Item> PACKNITE_BLOCK = block(PackniteModBlocks.PACKNITE_BLOCK);
	public static final RegistryObject<Item> PACKNITE_ORE = block(PackniteModBlocks.PACKNITE_ORE);
	public static final RegistryObject<Item> PACKNITE_AXE = REGISTRY.register("packnite_axe", () -> new PackniteAxeItem());
	public static final RegistryObject<Item> PACKNITE_PICKAXE = REGISTRY.register("packnite_pickaxe", () -> new PacknitePickaxeItem());
	public static final RegistryObject<Item> PACKNITE_SWORD = REGISTRY.register("packnite_sword", () -> new PackniteSwordItem());
	public static final RegistryObject<Item> PACKNITE_SHOVEL = REGISTRY.register("packnite_shovel", () -> new PackniteShovelItem());
	public static final RegistryObject<Item> PACKNITE_HOE = REGISTRY.register("packnite_hoe", () -> new PackniteHoeItem());
	public static final RegistryObject<Item> PACKNITE = REGISTRY.register("packnite", () -> new PackniteItem());
	public static final RegistryObject<Item> PACKNITE_ARMOR_HELMET = REGISTRY.register("packnite_armor_helmet", () -> new PackniteArmorItem.Helmet());
	public static final RegistryObject<Item> PACKNITE_ARMOR_CHESTPLATE = REGISTRY.register("packnite_armor_chestplate", () -> new PackniteArmorItem.Chestplate());
	public static final RegistryObject<Item> PACKNITE_ARMOR_LEGGINGS = REGISTRY.register("packnite_armor_leggings", () -> new PackniteArmorItem.Leggings());
	public static final RegistryObject<Item> PACKNITE_ARMOR_BOOTS = REGISTRY.register("packnite_armor_boots", () -> new PackniteArmorItem.Boots());
	public static final RegistryObject<Item> PACKNITEINGOT = REGISTRY.register("packniteingot", () -> new PackniteingotItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
