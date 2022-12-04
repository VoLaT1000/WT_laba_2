package by.bsuir.kugach.wt_laba_2.dao.interfaces;

import by.bsuir.kugach.wt_laba_2.dao.classes.DAOException;
import by.bsuir.kugach.wt_laba_2.entity.Appliance;
import by.bsuir.kugach.wt_laba_2.entity.Criteria;

import java.util.ArrayList;

public interface IDAOAppliance {
    ArrayList<Appliance> find(Criteria criteria) throws DAOException;
}
