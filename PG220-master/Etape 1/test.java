import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamException;

import org.jdom.*;
import org.jdom.output.*;
import javax.xml.stream.XMLStreamWriter;


public class test {
  public static void main(String argv[]) {
    
    FileOutputStream file = null;

        try {
           String fichier= "decoupes.xml";
           file = new FileOutputStream(fichier);
           XMLOutputFactory xmlOutFact = XMLOutputFactory.newInstance();
           XMLStreamWriter writer = xmlOutFact.createXMLStreamWriter(file);
           
           // début balise decoupes : 
           writer.writeStartDocument("1.0");
           writer.writeCharacters(System.getProperty("line.separator"));
           writer.writeStartElement("decoupes");
           writer.writeCharacters(System.getProperty("line.separator"));
           writer.writeStartElement("decoupe");
           // insertion des elements importants :
           writer.writeCharacters(System.getProperty("line.separator"));
           writer.writeStartElement("client");
           writer.writeAttribute("id","1");
           writer.writeAttribute("planche","2");
           writer.writeEndElement();

           writer.writeCharacters(System.getProperty("line.separator"));
           writer.writeStartElement("fournisseur");
           writer.writeAttribute("id","0");
           writer.writeAttribute("panneau","1");
           writer.writeEndElement();

           writer.writeCharacters(System.getProperty("line.separator"));
           writer.writeStartElement("position");
           writer.writeAttribute("x","12");
           writer.writeAttribute("y","40");
           writer.writeEndElement();

           // fin balise : 
           writer.writeCharacters(System.getProperty("line.separator"));
           writer.writeEndElement();
           writer.writeCharacters(System.getProperty("line.separator"));
           writer.writeEndElement();

          // writer.newInstance("balise", ClassLoader classLoader)
          // OutputStream outputStream = new FileOutputStream(new File("decoupes.xml"));


       }

        catch(IOException exc) {

            System.out.print("Erreur IO: " + exc.toString());
        }
        catch(XMLStreamException exc)
        {
            System.out.print("Erreur XML: " + exc.toString());

        }
       

   
  
  }
}