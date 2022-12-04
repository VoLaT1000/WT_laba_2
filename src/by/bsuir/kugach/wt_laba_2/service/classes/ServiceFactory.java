package by.bsuir.kugach.wt_laba_2.service.classes;

import by.bsuir.kugach.wt_laba_2.entity.Appliance;
import by.bsuir.kugach.wt_laba_2.service.interfaces.IApplianceService;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final IApplianceService applianceService = new ApplianceService();
    private ServiceFactory(){
    }
    public IApplianceService getApplianceService(){
        return applianceService;
    }
    public static ServiceFactory getInstance(){
        return instance;
    }
}
