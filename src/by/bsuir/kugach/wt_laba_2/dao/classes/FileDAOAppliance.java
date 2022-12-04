package by.bsuir.kugach.wt_laba_2.dao.classes;

import by.bsuir.kugach.wt_laba_2.dao.interfaces.IDAOAppliance;
import by.bsuir.kugach.wt_laba_2.entity.Appliance;
import by.bsuir.kugach.wt_laba_2.entity.ApplianceFactory;
import by.bsuir.kugach.wt_laba_2.entity.Criteria;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.IOException;
import java.util.ArrayList;

public class FileDAOAppliance implements IDAOAppliance {
    private static final String FILE_PATH = "./src/by/bsuir/kugach/wt_laba_2/resources/appliances_db.xml";
    private Document doc;
    public ArrayList<Appliance> find(Criteria criteria) throws DAOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        ApplianceFactory applianceFactory = new ApplianceFactory();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            doc = builder.parse(FILE_PATH);

            ArrayList<Appliance> foundAppliances = new ArrayList<>();
            NodeList elementList = doc.getElementsByTagName(criteria.getGroupSearchName().toLowerCase());
            for (int i = 0; i < elementList.getLength(); i++) {
                Node p = elementList.item(i);
                if (p.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) p;
                    NodeList nameList = element.getChildNodes();
                    ArrayList<String> applianceInfo = new ArrayList<>();
                    for (int j = 0; j < nameList.getLength(); j++) {
                        Node n = nameList.item(j);
                        if (n.getNodeType() == Node.ELEMENT_NODE) {
                            Element name = (Element) n;
                            applianceInfo.add(name.getTextContent());
                        }
                    }
                    foundAppliances.add(applianceFactory.createInstance(criteria.getGroupSearchName(), applianceInfo));
                }
            }

            return foundAppliances;
        }
        catch (ParserConfigurationException | SAXException | IOException e) {
            throw new DAOException(e);
        }
    }

}
