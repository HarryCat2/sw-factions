package harry.cat.sw_factions.block;
import harry.cat.sw_factions.item.ModItems;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class DataTerminalBlock extends Block {


    public DataTerminalBlock(Properties properties) {
        super(properties);
    }

    public static class StuffTimer implements ServerTickEvents.EndTick {
        public static final StuffTimer INSTANCE = new StuffTimer();
        private long ticksUntilSomething;
        public void setTimer(long ticksUntilSomething) {
            this.ticksUntilSomething = ticksUntilSomething;
        }
        @Override
        public void onEndTick(MinecraftServer server) {
            if (--this.ticksUntilSomething == 0L) {

                // If you want to repeat this, reset ticksUntilSomething here.


            }
        }
        public static void register() {
            ServerTickEvents.END_SERVER_TICK.register(INSTANCE);
        }
    }

    @Override
    // InteractionHand hand,
    //if (player.getItemInHand(hand).is(ModItems.DATA_SPIKE)) {
    //
    //            }
    public InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        if (!world.isClientSide()) {
            return InteractionResult.PASS;
        } else {

            return InteractionResult.SUCCESS;
        }
    }
}
