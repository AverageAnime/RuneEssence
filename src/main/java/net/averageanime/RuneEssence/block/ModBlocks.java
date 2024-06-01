package net.averageanime.RuneEssence.block;

import net.averageanime.RuneEssence.RuneEssence;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.IRON_BLOCK;
import static net.minecraft.block.Blocks.IRON_ORE;

public class ModBlocks {
    public static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RuneEssence.MOD_ID, name), block);
    }
    private static void registerBlockItem (String name, Block block){
        Registry.register(Registries.ITEM, new Identifier(RuneEssence.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks () {
        RuneEssence.LOGGER.info("Registering Blocks for " + RuneEssence.MOD_ID);
    }
    public static Block RUNE_ESSENCE_ORE,DEEPSLATE_RUNE_ESSENCE_ORE,RUNE_ESSENCE_BLOCK,PURE_ESSENCE_BLOCK;
    public static void registerBlock() {

        RUNE_ESSENCE_ORE = registerBlock("rune_essence_ore", new Block(FabricBlockSettings.copyOf(IRON_ORE).nonOpaque()));
        ItemGroupEvents.modifyEntriesEvent(RuneEssence.GROUP).register(entries -> entries.add(RUNE_ESSENCE_ORE));

        DEEPSLATE_RUNE_ESSENCE_ORE = registerBlock("deepslate_rune_essence_ore", new Block(FabricBlockSettings.copyOf(IRON_ORE).nonOpaque()));
        ItemGroupEvents.modifyEntriesEvent(RuneEssence.GROUP).register(entries -> entries.add(DEEPSLATE_RUNE_ESSENCE_ORE));

        RUNE_ESSENCE_BLOCK = registerBlock("rune_essence_block", new Block(FabricBlockSettings.copyOf(IRON_BLOCK).nonOpaque()));
        ItemGroupEvents.modifyEntriesEvent(RuneEssence.GROUP).register(entries -> entries.add(RUNE_ESSENCE_BLOCK));

        PURE_ESSENCE_BLOCK = registerBlock("pure_essence_block", new Block(FabricBlockSettings.copyOf(IRON_BLOCK).nonOpaque()));
        ItemGroupEvents.modifyEntriesEvent(RuneEssence.GROUP).register(entries -> entries.add(PURE_ESSENCE_BLOCK));

    }
}
