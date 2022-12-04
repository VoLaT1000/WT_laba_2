package by.bsuir.kugach.wt_laba_2.dao.classes;

import by.bsuir.kugach.wt_laba_2.dao.interfaces.IDAOAppliance;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();
    private final IDAOAppliance appliance = new FileDAOAppliance();
    private DAOFactory(){
    }
    public IDAOAppliance getAppliance(){
        return appliance;
    }
    public static DAOFactory getInstance(){
        return instance;
    }
}
