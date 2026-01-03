package harry.cat.sw_factions.container;

import harry.cat.sw_factions.SwFactions;
import harry.cat.sw_factions.block.BaseCoreBlock;
import harry.cat.sw_factions.block.DataTerminalBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;





import java.util.function.Function;

public class ModBlocks {

    // BASE CORE BLOCK
    public static final Block BASE_CORE_BLOCK = register(
		    "base_core",
		    BaseCoreBlock::new,
		    BlockBehaviour.Properties.of().sound(SoundType.GRASS),
		    true
    );

    // BASE BLOCKS


    public static final Block DATA_TERMINAL_BLOCK = register(
		    "data_terminal",
		    DataTerminalBlock::new,
		    BlockBehaviour.Properties.of().sound(SoundType.COPPER_GOLEM_STATUE),
		    true
    );


    // TURRET BLOCKS
    public static final Block TURRET_BASE_BLOCK = register(
            "turret_base",
            Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.IRON),
            true
    );

    public static final Block TURRET_HEIGHT_BLOCK = register(
            "turret_height_block",
            Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.COPPER_BULB),
            true
    );

    public static final Block TURRET_HEAD = register(
            "turret_head",
            Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.COPPER_BULB),
            true
    );

    public static final Block TURRET_BARREL = register(
            "turret_barrel",
            Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.COPPER_GRATE),
            true
    );

    private static <T extends Block>Block register(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, boolean shouldRegisterItem) {
        ResourceKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.setId(blockKey));

        if (shouldRegisterItem) {
            ResourceKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        }
        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    private static ResourceKey<Block> keyOfBlock(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(SwFactions.MOD_ID, name));
    }

    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(SwFactions.MOD_ID, name));
    }

    public static void initialize() {

    }

}
