package by.bsuir.kugach.wt_laba_2.main;

import by.bsuir.kugach.wt_laba_2.entity.Appliance;

import java.util.List;

public class ApplianceInfoPrinter {
    public static void print (List<Appliance> appliances){
        if(appliances.size() > 0){
            for (Appliance appliance : appliances){
                System.out.println(appliance.toString());
            }
        }
        else{
            System.out.println("There are no required appliances");
        }
    }
}
