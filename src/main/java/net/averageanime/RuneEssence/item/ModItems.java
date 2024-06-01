package net.averageanime.RuneEssence.item;

import net.averageanime.RuneEssence.RuneEssence;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ICON = registerItem("icon", new Item(new FabricItemSettings()));
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RuneEssence.MOD_ID, name), item);
    }
    public static void registerModItems() {
        RuneEssence.LOGGER.info("Registering Items for " + RuneEssence.MOD_ID);
    }
    public static void registerItem() {

// Essence

        final Item RUNE_ESSENCE = registerItem("rune_essence", new Item(new FabricItemSettings().maxCount(16)));
        ItemGroupEvents.modifyEntriesEvent(RuneEssence.GROUP).register(entries -> entries.add(RUNE_ESSENCE));

        final Item PURE_ESSENCE = registerItem("pure_essence", new Item(new FabricItemSettings().maxCount(16)));
        ItemGroupEvents.modifyEntriesEvent(RuneEssence.GROUP).register(entries -> entries.add(PURE_ESSENCE));

// Talisman

        final Item TALISMAN = registerItem("talisman", new Item(new FabricItemSettings().maxCount(1)));
        ItemGroupEvents.modifyEntriesEvent(RuneEssence.GROUP).register(entries -> entries.add(TALISMAN));

        if (FabricLoader.getInstance().isModLoaded("more_rpg_classes")) {
            final Item AIR_TALISMAN = registerItem("air_talisman", new Item(new FabricItemSettings().maxCount(1)));
            ItemGroupEvents.modifyEntriesEvent(RuneEssence.GROUP).register(entries -> entries.add(AIR_TALISMAN));
        }

        final Item ARCANE_TALISMAN = registerItem("arcane_talisman", new Item(new FabricItemSettings().maxCount(1)));
        ItemGroupEvents.modifyEntriesEvent(RuneEssence.GROUP).register(entries -> entries.add(ARCANE_TALISMAN));

        if (FabricLoader.getInstance().isModLoaded("more_rpg_classes")) {
            final Item EARTH_TALISMAN = registerItem("earth_talisman", new Item(new FabricItemSettings().maxCount(1)));
            ItemGroupEvents.modifyEntriesEvent(RuneEssence.GROUP).register(entries -> entries.add(EARTH_TALISMAN));
        }

        final Item FIRE_TALISMAN = registerItem("fire_talisman", new Item(new FabricItemSettings().maxCount(1)));
        ItemGroupEvents.modifyEntriesEvent(RuneEssence.GROUP).register(entries -> entries.add(FIRE_TALISMAN));

        final Item FROST_TALISMAN = registerItem("frost_talisman", new Item(new FabricItemSettings().maxCount(1)));
        ItemGroupEvents.modifyEntriesEvent(RuneEssence.GROUP).register(entries -> entries.add(FROST_TALISMAN));

        final Item HEALING_TALISMAN = registerItem("healing_talisman", new Item(new FabricItemSettings().maxCount(1)));
        ItemGroupEvents.modifyEntriesEvent(RuneEssence.GROUP).register(entries -> entries.add(HEALING_TALISMAN));

        final Item LIGHTNING_TALISMAN = registerItem("lightning_talisman", new Item(new FabricItemSettings().maxCount(1)));
        ItemGroupEvents.modifyEntriesEvent(RuneEssence.GROUP).register(entries -> entries.add(LIGHTNING_TALISMAN));

        final Item SOUL_TALISMAN = registerItem("soul_talisman", new Item(new FabricItemSettings().maxCount(1)));
        ItemGroupEvents.modifyEntriesEvent(RuneEssence.GROUP).register(entries -> entries.add(SOUL_TALISMAN));

        if (FabricLoader.getInstance().isModLoaded("more_rpg_classes")) {
            final Item WATER_TALISMAN = registerItem("water_talisman", new Item(new FabricItemSettings().maxCount(1)));
            ItemGroupEvents.modifyEntriesEvent(RuneEssence.GROUP).register(entries -> entries.add(WATER_TALISMAN));
        }

    }
}
