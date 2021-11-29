import java.io.FileInputStream;
import java.io.IOException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamException;

import javax.xml.stream.XMLStreamWriter;


public class test {
  public static void main(String argv[]) {
       
    FileInputStream file = null;
    String file = "decoupes.xml";
    XMLInputFactory xmlInFact = XMLOutputFactory.newInstance();
    XMLStreamWriter writer = xmlInFact.createXMLStreamReader(file);

       
       

   
   /*  try {
       String file = "decoupes.xml";
       DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
       DocumentBuilder db = dbf.newDocumentBuilder();
       Document doc = db.parse(file);
       // Récupérer l'élément racine
       Node entreprise = doc.getFirstChild();
       // Récupérer l'élément employee
       Node decoupe = doc.getElementsByTagName("decoupe").item(0);
       // Ajouter un nouveau nœud
       Element balise = doc.createElement("client");
       decoupe.appendChild(balise);
       // écrire le contenu dans un fichier xml
       TransformerFactory tf = TransformerFactory.newInstance();
       Transformer transformer = tf.newTransformer();
       DOMSource src = new DOMSource(doc);
       StreamResult res = new StreamResult(new File(file));
       transformer.transform(src, res);
     } catch (Exception e) {
      e.printStackTrace();
     }*/
  }
}