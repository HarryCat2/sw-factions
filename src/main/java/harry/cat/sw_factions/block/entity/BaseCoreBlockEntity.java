package harry.cat.sw_factions.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class BaseCoreBlockEntity extends BlockEntity {
    public BaseCoreBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BASE_CORE_BLOCK_ENTITY, pos, state);
    }
}
