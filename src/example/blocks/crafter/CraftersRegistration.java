package example.blocks.crafter;

import example.items.ItemsRegistration;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;

public class CraftersRegistration {
    public static Block ironPress;

    public static void Load(){
        ironPress = new GenericCrafter("iron-press"){{
            requirements(Category.crafting, ItemStack.with(
                Items.copper, 150,
                ItemsRegistration.iron, 150,
                Items.lead, 100
            ));
            size = 2;
            craftEffect = Fx.pulverize;
            outputItem = new ItemStack(ItemsRegistration.ironAlloy, 1);
            consumeItems(new ItemStack(ItemsRegistration.iron, 5));
            craftTime = 100f;
        }};
    }
}
