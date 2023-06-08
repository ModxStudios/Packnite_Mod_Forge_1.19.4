
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.packnite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.packnite.block.PackniteOreBlock;
import net.mcreator.packnite.block.PackniteBlockBlock;
import net.mcreator.packnite.PackniteMod;

public class PackniteModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PackniteMod.MODID);
	public static final RegistryObject<Block> PACKNITE_BLOCK = REGISTRY.register("packnite_block", () -> new PackniteBlockBlock());
	public static final RegistryObject<Block> PACKNITE_ORE = REGISTRY.register("packnite_ore", () -> new PackniteOreBlock());
}
