package net.averageanime.RuneEssence;

import net.averageanime.RuneEssence.block.ModBlocks;
import net.averageanime.RuneEssence.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.averageanime.RuneEssence.block.ModBlocks.registerBlock;
import static net.averageanime.RuneEssence.item.ModItems.registerItem;

public class RuneEssence implements ModInitializer {
	public static final String MOD_ID = "rune_essence";
	public static final RegistryKey<ItemGroup> GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "group"));
	public static final Logger LOGGER = LoggerFactory.getLogger("rune_essence");
	public static final RegistryKey<PlacedFeature> ESSENCE_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("rune_essence","ore_essence_placed"));
	@Override
	public void onInitialize() {

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ESSENCE_ORE_PLACED_KEY);

		Registry.register(Registries.ITEM_GROUP, GROUP, FabricItemGroup.builder()
				.displayName(Text.translatable("itemgroup.rune_essence"))
				.icon(() -> new ItemStack(ModItems.ICON))
				.entries(((displayContext, entries) -> {
				}))
				.build());

		ModBlocks.registerModBlocks();
		registerBlock();
		ModItems.registerModItems();
		registerItem();

	}
}

