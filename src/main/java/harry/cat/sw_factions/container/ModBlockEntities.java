package harry.cat.sw_factions.container;

import harry.cat.sw_factions.Sw_factions;
import harry.cat.sw_factions.block.entity.BaseCoreBlockEntity;
import harry.cat.sw_factions.block.entity.DataTerminalBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import static net.fabricmc.fabric.api.registry.StrippableBlockRegistry.register;

public class ModBlockEntities {

    public static final BlockEntityType<BaseCoreBlockEntity> BASE_CORE_BLOCK_ENTITY =
            register("core", BaseCoreBlockEntity::new,
                    ModBlocks.BASE_CORE_BLOCK);

    public static final BlockEntityType<DataTerminalBlockEntity> DATA_TERMINAL_BLOCK_ENTITY =
            register("data_terminal", DataTerminalBlockEntity::new,
                    ModBlocks.DATA_TERMINAL_BLOCK);


    public static <T extends BlockEntity> BlockEntityType<T> register(
            String name,
            FabricBlockEntityTypeBuilder.Factory<? extends T> entityFactory,
            Block... blocks
    ) {
        Identifier id = Identifier.fromNamespaceAndPath(Sw_factions.MOD_ID, name);
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, id, FabricBlockEntityTypeBuilder.<T>create(entityFactory, blocks).build());
    }
}



