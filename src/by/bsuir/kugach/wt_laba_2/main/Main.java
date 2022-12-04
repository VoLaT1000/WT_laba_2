package by.bsuir.kugach.wt_laba_2.main;

import by.bsuir.kugach.wt_laba_2.entity.Appliance;
import by.bsuir.kugach.wt_laba_2.entity.Criteria;
import by.bsuir.kugach.wt_laba_2.entity.Teakettle;
import by.bsuir.kugach.wt_laba_2.service.classes.ServiceException;
import by.bsuir.kugach.wt_laba_2.service.classes.ServiceFactory;
import by.bsuir.kugach.wt_laba_2.service.interfaces.IApplianceService;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws ServiceException{
        ArrayList<Appliance> appliances;
        ServiceFactory factory = ServiceFactory.getInstance();
        IApplianceService service = factory.getApplianceService();
        Criteria criteriaTeakettle = new Criteria(Teakettle.class.getSimpleName());
        appliances = service.find(criteriaTeakettle);
        System.out.println("Teakettles");
        ApplianceInfoPrinter.print(appliances);
        appliances = new ArrayList<>(Collections.singletonList(service.findLowestCostAppliance()));
        System.out.println("The lowest price: ");
        ApplianceInfoPrinter.print(appliances);
    }
}
