package example.blocks.production;

import example.items.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.production.Drill;
import mindustry.world.Block;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.content.Items;

public class ProductionRegistration {
    public static Block ironDrill;

    public static void Load(){
        ironDrill = new Drill("iron-drill"){{
            requirements(Category.production, ItemStack.with(
                Items.copper, 100,
                Items.lead, 100,
                ItemsRegistration.iron, 100
            ));

            tier = 2;
            size = 2;
        }};
    }
}
