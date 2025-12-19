package harry.cat.sw_factions.item;

import harry.cat.sw_factions.Sw_factions;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

import static net.fabricmc.fabric.api.command.v2.EntitySelectorOptionRegistry.register;

public class ModItems {

    public static final Item DATA_SPIKE = registerItem(
            "data_spike",
            DataSpikeItem::new,
            new Item.Properties()
    );




    private static Item registerItem(String name, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        Identifier id = Identifier.fromNamespaceAndPath(Sw_factions.MOD_ID, name);
        Item item = itemFactory.apply(settings); // DO NOT try to set an ID on properties
        return Registry.register(BuiltInRegistries.ITEM, id, item); // ID is assigned here
    }

    public static void registerItems() {

    }
}
