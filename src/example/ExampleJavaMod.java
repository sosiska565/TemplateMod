package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.mod.*;
import example.items.ItemsRegistration;
import example.blocks.*;
import example.blocks.bullet.BulletsRegistration;
import example.blocks.ore.OresRegistration;
import example.blocks.turret.TurretsRegistration;

public class ExampleJavaMod extends Mod{
    @Override
    public void loadContent(){
        ItemsRegistration.Load();
        OresRegistration.Load();
        BulletsRegistration.Load();
        TurretsRegistration.Load();
    }
}