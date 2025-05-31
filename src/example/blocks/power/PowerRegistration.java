package example.blocks.power;

import example.items.ItemsRegistration;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.gen.Building;
import mindustry.gen.Sounds;
import mindustry.world.blocks.power.NuclearReactor;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.draw.DrawBlock;
import mindustry.graphics.Drawf;
import mindustry.graphics.Pal;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.TextureRegion;

public class PowerRegistration {
    public static NuclearReactor steamTurbine;

    public static void Load() {
        steamTurbine = new NuclearReactor("steam-turbine") {{
            // Требования для строительства
            requirements(Category.power, ItemStack.with(
                Items.lead, 300,
                Items.silicon, 200,
                Items.graphite, 150,
                ItemsRegistration.iron, 150,
                Items.metaglass, 50,
                ItemsRegistration.ironAlloy, 100
            ));

            // Базовые параметры реактора
            ambientSound = Sounds.hum;
            ambientSoundVolume = 0.24f;
            size = 3;
            health = 700;
            itemDuration = 360f; // Уменьшено до 6 секунд, как у ториевого реактора
            powerProduction = 60f; // Увеличено до 60, как у ториевого реактора
            heating = 0.02f; // Уменьшено до 0.02, как у ториевого реактора

            // Потребление ресурсов
            consumeItem(Items.coal, 1); // Потребляет 1 уголь за цикл (можно заменить на Items.thorium)
            consumeLiquid(Liquids.cryofluid, 0.2f) // Увеличено до 0.2 единицы криофлюида за тик
                .update(true);

            // Отладочный drawer для проверки состояния
            drawer = new DrawBlock() {
                @Override
                public void draw(Building build) {
                    Draw.rect(build.block.region, build.x, build.y);
                    // Визуализация эффективности (если работает, будет свет)
                    if (build.warmup() > 0) {
                        Drawf.light(build.x, build.y, 50f * build.warmup(), Pal.reactorPurple, 0.7f);
                    }
                }
            };
        }};
    }
}