package example.blocks.distribution;

import example.items.ItemsRegistration;
import mindustry.world.Block;
import mindustry.world.blocks.distribution.Conveyor;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;

public class DistribudutionsRegistration {
    public static Block ironConveyor;

    public static void Load() {
        ironConveyor = new Conveyor("iron-conveyor"){{
            requirements(Category.distribution, ItemStack.with(
                Items.copper, 10,
                ItemsRegistration.iron, 10
            ));
            health = 100;
            speed = 0.06f;
            displayedSpeed = 8f;
        }};
    }
}
