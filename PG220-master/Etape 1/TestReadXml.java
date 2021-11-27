import java.io.FileInputStream;
import java.io.IOException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamException;

public class TestReadXml extends Reader {

    public static void main(String[] argvs)
    {   int type;
        String date;
        int number;
        Double price;
        int id;
        int idplanche;
        int length;
        int width;
        FileInputStream file = null;
        try {
            String fichier="clients.xml";
            file = new FileInputStream(fichier);
            if (fichier.equals("clients.xml")){
                type=0;
            }
            if (fichier.equals("fournisseurs.xml")){
                type=1;
            }
            XMLInputFactory xmlInFact = XMLInputFactory.newInstance();
            XMLStreamReader reader = xmlInFact.createXMLStreamReader(file);
            while(reader.hasNext()) {
                //System.out.println("l18");
                if(reader.next() == XMLStreamConstants.START_ELEMENT )
                {
                    if(reader.getName().toString() == "client")
                    {
                        id = Integer.parseInt(reader.getAttributeValue(0));
                        String commande = "id client : " +id;
                        System.out.println(commande);


                       // List listPlanche = new ArrayList<>();
                        while(reader.hasNext())
                        {
                            if(reader.next() == XMLStreamConstants.START_ELEMENT)
                                {   System.out.println("ok");
                                    if(reader.getName().toString() == "planche")
                                    {   System.out.println("ok");
                                        //Planche p = readPlanche(reader);
                                        String affichage = "Commande n°" + id + " de " + reader.getAttributeValue(1) + " planches à livrer pour le " + reader.getAttributeValue(2) + " au prix maximal de " +reader.getAttributeValue(3);
                                        System.out.println(affichage);

                                        while(reader.hasNext())
                                        {
                                            if(reader.next() == XMLStreamConstants.START_ELEMENT)
                                            {

                                                if(reader.getName().toString() == "dim")
                                                {

                                                    System.out.println("ok");


                                                }


                                            }
                                        }
                                    }   
                                    else
                                        {
                                            System.out.println("JE SORS");
                                            break;
                                    }
                                    

                                         


                                    //listPlanche.add(p);
                                }
                                else
                                    {
                                        break;
                                    }
                                /*if(reader.next() == XMLStreamConstants.END_ELEMENT )
                                {
                                    System.out.println("fin client");
                                    System.out.println(reader.getName().toString());
                                    if(reader.getName().toString() == "client")
                                    {
                                    
                                        break;
                                    }
                                }*/
                            }
                    }

                }
            }


                        //reader.nextTag(); //On regarde le premier client
                        //reader.nextTag(); //On regarde la première commande de planche demandée

                        //String commande = "Commande n°" + reader.getAttributeValue(0) + " de " + reader.getAttributeValue(1) + " planches à livrer pour le " + reader.getAttributeValue(2) + " au prix maximal de " +reader.getAttributeValue(3);
                        /*System.out.println(commande);
                        reader.nextTag(); //On regarde les dimensions de la commande
                        String dimension ="La dimension est de longueur "+reader.getAttributeValue(0)+"  et de largeur " + reader.getAttributeValue(1);
                        System.out.println(dimension);*/
                 //   }
                    
             //   } 
                //else
                  //  break;
            
        }
        catch(IOException exc) {

            System.out.print("Erreur IO: " + exc.toString());
        }
        catch(XMLStreamException exc) {
            System.out.print("Erreur XML: " + exc.toString());

        }

    
    }

     /*   static Planche readPlanche(XMLStreamReader reader) throws XMLStreamException
    {
        return null;
    }
*/

}

// 