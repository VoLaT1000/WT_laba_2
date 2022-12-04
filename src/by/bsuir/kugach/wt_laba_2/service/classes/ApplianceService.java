package by.bsuir.kugach.wt_laba_2.service.classes;

import by.bsuir.kugach.wt_laba_2.dao.classes.DAOException;
import by.bsuir.kugach.wt_laba_2.dao.classes.DAOFactory;
import by.bsuir.kugach.wt_laba_2.dao.interfaces.IDAOAppliance;
import by.bsuir.kugach.wt_laba_2.entity.Appliance;
import by.bsuir.kugach.wt_laba_2.entity.Criteria;
import by.bsuir.kugach.wt_laba_2.entity.SearchCriteria;
import by.bsuir.kugach.wt_laba_2.service.interfaces.IApplianceService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public class ApplianceService implements IApplianceService {
    public ArrayList<Appliance> find(Criteria criteria) throws ServiceException{
        if (!Validator.criteriaValidator(criteria)){
            return null;
        }
        DAOFactory factory = DAOFactory.getInstance();
        IDAOAppliance appliance = factory.getAppliance();
        ArrayList<Appliance> appliances = new ArrayList<>(){
        };
        try{
            ArrayList<Appliance> appliancesInfos = appliance.find(criteria);
            for(Appliance _appliance : appliancesInfos){
                if(isMeetsCriteria(_appliance, criteria)){
                    appliances.add(_appliance);
                }
            }
        }
        catch (DAOException e){
            throw new ServiceException(e);
        }
        finally {
            return appliances;
        }
    }
    private boolean isMeetsCriteria(Appliance appliance, Criteria criteria){
        for(Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()){
            if(!appliance.getFieldByName(entry.getKey()).equals(entry.getValue())){
                return false;
            }
        }
        return true;
    }
    public Appliance findLowestCostAppliance(){
        ArrayList<Appliance> appliances = new ArrayList<Appliance>();
        try{
            appliances.addAll(find(new Criteria(SearchCriteria.Fridge.class.getSimpleName())));
            appliances.addAll(find(new Criteria(SearchCriteria.Teakettle.class.getSimpleName())));
            appliances.addAll(find(new Criteria(SearchCriteria.Laptop.class.getSimpleName())));
            Collections.sort(appliances);
        }
        catch (ServiceException e){
        }
        finally {
            return appliances.get(0);
        }
    }
}
