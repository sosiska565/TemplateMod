package example.items;

import arc.graphics.Color;
import mindustry.type.Item;

public class ItemsRegistration {
    public static Item iron, ironAlloy;
    public static void Load(){
        iron = new Item("iron", Color.darkGray){{
            hardness = 2;
            cost = 1f;
            flammability = 1f;
            explosiveness = 1f;
            radioactivity = 0f;
            charge = 0f;
            alwaysUnlocked = true;
        }};
        ironAlloy = new Item("iron-alloy", Color.gray){{
            
        }};
    }
}