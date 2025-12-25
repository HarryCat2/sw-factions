package harry.cat.sw_factions.item;

import harry.cat.sw_factions.Sw_factions;
import harry.cat.sw_factions.block.ModBlocks;
import harry.cat.sw_factions.block.entity.ModBlockEntities;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
    public static final ResourceKey<CreativeModeTab> CUSTOM_ITEM_GROUP_KEY = ResourceKey
            .create(BuiltInRegistries.CREATIVE_MODE_TAB.key(),
                    Identifier.fromNamespaceAndPath(Sw_factions.MOD_ID, "item_group"
                    ));

    public static final CreativeModeTab CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.BASE_CORE_BLOCK))
            .title(Component.translatable("itemGroup.sw-mod"))
            .build();

    public static void RegisterItemGroup() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {

            // BASE BLOCKS
            itemGroup.accept(ModBlocks.BASE_CORE_BLOCK);

            // TURRET BLOCKS
            itemGroup.accept(ModBlocks.TURRET_BASE_BLOCK);
            itemGroup.accept(ModBlocks.TURRET_HEIGHT_BLOCK);
            itemGroup.accept(ModBlocks.TURRET_HEAD);
            itemGroup.accept(ModBlocks.TURRET_BARREL);
            itemGroup.accept(ModItems.DATA_SPIKE);

        });

    }

}
