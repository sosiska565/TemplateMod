package example.blocks.turret;

import arc.struct.ObjectMap;
import example.blocks.bullet.BulletsRegistration;
import example.items.ItemsRegistration;
import mindustry.content.Items;
import mindustry.type.AmmoType;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.*;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.defense.turrets.Turret;
import mindustry.content.Liquids;
import mindustry.entities.bullet.BulletType;
import mindustry.content.Bullets;
import mindustry.content.Fx;

public class TurretsRegistration {
    public static Block ironTurret;
    public static void Load(){
        ironTurret = new ItemTurret("iron-turret"){{
            requirements(Category.turret, ItemStack.with(
                Items.copper, 100,
                Items.lead, 50,
                ItemsRegistration.iron, 50
            ));
            
            size = 1;

            ammo(ItemsRegistration.iron, BulletsRegistration.ironBullet);
            targetInterval = 20f;
            maxAmmo = 5;
            ammoPerShot = 1;
            inaccuracy = 0f;
            range = 120f;
        }};
    }
}