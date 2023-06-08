
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.packnite.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PackniteModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(PackniteModItems.PACKNITE_SWORD.get());
			tabData.accept(PackniteModItems.PACKNITE_ARMOR_HELMET.get());
			tabData.accept(PackniteModItems.PACKNITE_ARMOR_CHESTPLATE.get());
			tabData.accept(PackniteModItems.PACKNITE_ARMOR_LEGGINGS.get());
			tabData.accept(PackniteModItems.PACKNITE_ARMOR_BOOTS.get());
		}

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(PackniteModBlocks.PACKNITE_ORE.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(PackniteModItems.PACKNITE_AXE.get());
			tabData.accept(PackniteModItems.PACKNITE_PICKAXE.get());
			tabData.accept(PackniteModItems.PACKNITE_SHOVEL.get());
			tabData.accept(PackniteModItems.PACKNITE_HOE.get());
		}
	}
}
