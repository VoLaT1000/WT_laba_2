package by.bsuir.kugach.wt_laba_2.service.interfaces;

import by.bsuir.kugach.wt_laba_2.entity.Appliance;
import by.bsuir.kugach.wt_laba_2.entity.Criteria;
import by.bsuir.kugach.wt_laba_2.service.classes.ServiceException;

import java.util.ArrayList;

public interface IApplianceService {
    ArrayList<Appliance> find (Criteria criteria) throws ServiceException;
    Appliance findLowestCostAppliance() throws ServiceException;
}
