import java.io.FileInputStream;
import java.io.IOException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamException;

public class TestReadXml {

    public static void main(String[] argvs)
    {
        FileInputStream file = null;
        try {
            file = new FileInputStream("clients.xml");
            XMLInputFactory xmlInFact = XMLInputFactory.newInstance();
            XMLStreamReader reader = xmlInFact.createXMLStreamReader(file);
            while(reader.hasNext()) {

                if(reader.next()==1 ){
                    reader.nextTag(); //On regarde le premier client
                    reader.nextTag(); //On regarde la première commande de planche demandée

                    String commande = "Commande n°" + reader.getAttributeValue(0) + " de " + reader.getAttributeValue(1) + " planches à livrer pour le " + reader.getAttributeValue(2) + " au prix maximal de " +reader.getAttributeValue(3);
                    System.out.println(commande);
                    reader.nextTag(); //On regarde les dimensions de la commande
                    String dimension ="La dimension est de longueur "+reader.getAttributeValue(0)+"  et de largeur " + reader.getAttributeValue(1);
                    System.out.println(dimension);
                } 
                else
                    break;
            }
        }
        catch(IOException exc) {

            System.out.print("Erreur IO: " + exc.toString());
        }
        catch(XMLStreamException exc) {
            System.out.print("Erreur XML: " + exc.toString());

        }
    }


}
