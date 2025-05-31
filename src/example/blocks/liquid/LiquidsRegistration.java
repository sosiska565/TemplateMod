package example.blocks.liquid;

import example.items.ItemsRegistration;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.liquid.Conduit;

public class LiquidsRegistration {
    public static Block ironConduit;

    public static void Load(){
        ironConduit = new Conduit("iron-conduit"){{
            requirements(Category.liquid, ItemStack.with(
                Items.copper, 2,
                ItemsRegistration.iron, 2
            ));
        }};
    }
}
