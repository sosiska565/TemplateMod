package example.blocks.bullet;

import mindustry.entities.bullet.BulletType;
import mindustry.content.Bullets;
import mindustry.content.Fx;

public class BulletsRegistration{
    public static BulletType ironBullet;
    
    public static void Load(){
        ironBullet = new BulletType(){{
            damage = 15f;
            speed = 7f;
            lifetime = 60f;
            hitEffect = Fx.hitBulletSmall;
            despawnEffect = Fx.hitBulletSmall;
        }};
    }
}