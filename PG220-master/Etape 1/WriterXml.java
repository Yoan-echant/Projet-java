import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

public class WriterXml{

public void ecriture(int client_id, int planche, int id_fournisseur, int panneau, int x, int y){
    FileOutputStream file = null;
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
    int taille=planche.length;
    int k;
    for (k=0;k<taille;k++){
        writer.writeCharacters(System.getProperty("line.separator"));
        writer.writeStartElement("client");
        writer.writeAttribute("id",id_client[k]);
        writer.writeAttribute("planche",planche[k]);
        writer.writeEndElement();

        writer.writeCharacters(System.getProperty("line.separator"));
        writer.writeStartElement("fournisseur");
        writer.writeAttribute("id",id_fournisseur[k]);
        writer.writeAttribute("panneau",panneau[k]);
        writer.writeEndElement();

        writer.writeCharacters(System.getProperty("line.separator"));
        writer.writeStartElement("position");
        writer.writeAttribute("x",x[k]);
        writer.writeAttribute("y",y[k]);
        writer.writeEndElement();
    }
            // fin balise : 
    writer.writeCharacters(System.getProperty("line.separator"));
    writer.writeEndElement();
    writer.writeCharacters(System.getProperty("line.separator"));
    writer.writeEndElement();

    

}

}