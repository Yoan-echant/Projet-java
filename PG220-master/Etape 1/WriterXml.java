import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

import java.io.IOException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.stream.XMLStreamException;
import java.util.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;


public class WriterXml{

    public WriterXml(){
        
    }

    public WriterXml initWriterXml(){
        return new WriterXml();
    }

public void writer_xml(int [] client_id, int []planche, int [] id_fournisseur,int []panneau, int []x, int [] y){
    try{
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
        writer.writeAttribute("id",Integer.toString(client_id[k]));
        writer.writeAttribute("planche",Integer.toString(planche[k]));
        writer.writeEndElement();

        writer.writeCharacters(System.getProperty("line.separator"));
        writer.writeStartElement("fournisseur");
        writer.writeAttribute("id",Integer.toString(id_fournisseur[k]));
        writer.writeAttribute("panneau",Integer.toString(panneau[k]));
        writer.writeEndElement();

        writer.writeCharacters(System.getProperty("line.separator"));
        writer.writeStartElement("position");
        writer.writeAttribute("x",Integer.toString(x[k]));
        writer.writeAttribute("y",Integer.toString(y[k]));
        writer.writeEndElement();
    }
            // fin balise : 
    writer.writeCharacters(System.getProperty("line.separator"));
    writer.writeEndElement();
    writer.writeCharacters(System.getProperty("line.separator"));
    writer.writeEndElement();
    }

     catch(IOException exc) {

            System.out.print("Erreur IO: " + exc.toString());
        }
        catch(XMLStreamException exc)
        {
            System.out.print("Erreur XML: " + exc.toString());

        }
       

    

}

    public void writesvg(int [] weigth, int [] height) { 
        try{
            FileOutputStream file = null;
            String fichier= "decoupes.svg";
            file = new FileOutputStream(fichier);
            XMLOutputFactory xmlOutFact = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = xmlOutFact.createXMLStreamWriter(file);

        
            writer.writeStartElement("svg");
            writer.writeAttribute("width",Integer.toString(1000));
            writer.writeAttribute("height",Integer.toString(1000));
            writer.writeCharacters(System.getProperty("line.separator"));
            // ecriture fichier avec position, taille

            // test random element : 
            
            int position_initialex=100;
            int position_initialey=100; 
            int nbx=weigth.length;
            int nby=height.length;
            int x=0;
            int y=0;
            int ligne=1;
            x=100;
            for (int p=0;p<nbx; p++){
                System.out.println(p);
                
                writer.writeStartElement("rect");
                writer.writeAttribute("x",Integer.toString(x));
                writer.writeAttribute("y",Integer.toString(ligne*200));
                writer.writeAttribute("width",Integer.toString(weigth[p]));
                writer.writeAttribute("height",Integer.toString(height[p]));
                x=x+50+weigth[p]; // le 50 est là pour rajouter de la marge
                if (x>1000){
                    x=100;
                    ligne++;
                }
                writer.writeEndElement();
                writer.writeCharacters(System.getProperty("line.separator"));
               
            

            }
             writer.writeEndElement();
                

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