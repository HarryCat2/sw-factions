package harry.cat.sw_factions;

import harry.cat.sw_factions.block.ModBlocks;
import harry.cat.sw_factions.item.ModItemGroups;
import harry.cat.sw_factions.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class Sw_factions implements ModInitializer {
    public static final String MOD_ID = "sw_factions";

    @Override
    public void onInitialize() {
        ModBlocks.initialize();
        ModItems.registerItems();
        ModItemGroups.RegisterItemGroup();

    }
}
