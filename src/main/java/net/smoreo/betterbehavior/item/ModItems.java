package net.smoreo.betterbehavior.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.smoreo.betterbehavior.BetterBehavior;

public class ModItems {

    public static final Item HUGE_COCK = registerItem("huge_cock",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item COOKED_COCK = registerItem("cooked_cock",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(BetterBehavior.MOD_ID, name), item);
    }
    public static void registerModItems(){
        BetterBehavior.LOGGER.debug("Registering Mod Items for " + BetterBehavior.MOD_ID);
    }
}
