package by.bsuir.kugach.wt_laba_2.entity;

import java.util.ArrayList;

public class ApplianceFactory {
    public Appliance createInstance(String name, ArrayList<String> params){
        return switch (name.toLowerCase()){
            case "fridge" -> Fridge.createInstance(params);
            case "teakettle" -> Teakettle.createInstance(params);
            case "laptop" -> Laptop.createInstance(params);
            default -> null;
        };
    }
}
