package by.bsuir.kugach.wt_laba_2.service.classes;

import by.bsuir.kugach.wt_laba_2.entity.Criteria;
import by.bsuir.kugach.wt_laba_2.entity.SearchCriteria;

public class Validator {
    public static boolean criteriaValidator(Criteria criteria){
        try{
            for (String criteriaName : criteria.getCriteria().keySet()){
                switch (criteria.getGroupSearchName()){
                    case "fridge":
                        SearchCriteria.Fridge.valueOf(criteriaName);
                        break;
                    case "teakettle":
                        SearchCriteria.Teakettle.valueOf(criteriaName);
                        break;
                    case "laptop":
                        SearchCriteria.Laptop.valueOf(criteriaName);
                        break;
                    default:
                        return false;
                }
            }
        }
        catch (IllegalArgumentException e){
            return false;
        }
        return true;
    }
}
