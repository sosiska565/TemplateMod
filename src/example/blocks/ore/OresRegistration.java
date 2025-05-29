package example.blocks.ore;

import example.items.ItemsRegistration;
import mindustry.world.Block;
import mindustry.world.blocks.environment.OreBlock;

public class OresRegistration {
    public static Block ironOre; 
    public static void Load(){
        ironOre = new OreBlock("iron-ore", ItemsRegistration.iron) {{
            // Базовые параметры (влияют на спавн и внешний вид)
            oreDefault = true;  // Включить спавн на картах по умолчанию
            oreThreshold = 0.85f; // Порог генерации (чем выше, тем реже)
            oreScale = 24f;     // Размер залежей (обычно 20-40)
    
            // Визуальные параметры
            variants = 3;       // Количество вариантов спрайтов (обычно 3)
            mapColor.set(ItemsRegistration.iron.color); // Цвет на карте
    
            // Параметры добычи
            itemDrop = ItemsRegistration.iron; // Что выпадает при добыче
            playerUnmineable = false; // Можно ли добывать киркой
    
            // Настройки прочности
            health = 140;       // Прочность блока
            armor = 3;          // Защита от урона
            buildCostMultiplier = 15f; // Множитель стоимости (для баланса)
        }};
    }
}
