package harry.cat.sw_factions;

import harry.cat.sw_factions.container.ModBlocks;
import harry.cat.sw_factions.container.ModItemGroups;
import harry.cat.sw_factions.container.ModItems;
import net.fabricmc.api.ModInitializer;

public class SwFactions implements ModInitializer {
    public static final String MOD_ID = "sw_factions";

    @Override
    public void onInitialize() {
        ModBlocks.initialize();
        ModItems.registerItems();
        ModItemGroups.RegisterItemGroup();



    }
}
