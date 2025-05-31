package example;

import example.*;
import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.mod.*;
import example.items.ItemsRegistration;
import example.blocks.*;
import example.blocks.bullet.BulletsRegistration;
import example.blocks.crafter.CraftersRegistration;
import example.blocks.distribution.DistribudutionsRegistration;
import example.blocks.liquid.LiquidsRegistration;
import example.blocks.ore.OresRegistration;
import example.blocks.power.PowerRegistration;
import example.blocks.production.ProductionRegistration;
import example.blocks.turret.TurretsRegistration;

public class ExampleJavaMod extends Mod{
    @Override
    public void loadContent(){
        ItemsRegistration.Load();
        OresRegistration.Load();
        BulletsRegistration.Load();
        TurretsRegistration.Load();
        ProductionRegistration.Load();
        DistribudutionsRegistration.Load();
        LiquidsRegistration.Load();
        CraftersRegistration.Load();
        PowerRegistration.Load();
    }
}