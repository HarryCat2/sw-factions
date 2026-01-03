package harry.cat.sw_factions.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.ContainerUser;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

import javax.swing.*;

public class DataTerminalBlockEntity extends BlockEntity {
    public DataTerminalBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.DATA_TERMINAL_BLOCK_ENTITY, pos, state);
    }

    private int progress = 0;
    private int maxProgress = 72;

    public void tick(Level level, BlockPos pos, BlockState state) {
//        if() {
//
//        } else {
//            resetProgress();
//        }
    }
    private void resetProgress() {
        this.progress = 0;
        this.maxProgress = 3;

         
    }

}
