
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.packnite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.packnite.world.features.ores.PackniteOreFeature;
import net.mcreator.packnite.PackniteMod;

@Mod.EventBusSubscriber
public class PackniteModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PackniteMod.MODID);
	public static final RegistryObject<Feature<?>> PACKNITE_ORE = REGISTRY.register("packnite_ore", PackniteOreFeature::new);
}
