import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Cut_algo extends Reader{
    
    public static void main(String[] args){
        Reader reader = initReader();
        ClientOrder[] tabOrder=reader.read("clients.xml");
        List<ClientOrder> cut = new ArrayList<ClientOrder>();
        int nbOrder= tabOrder.length;
        int pannel_num[]=new int[nbOrder];
        ClientOrder[] tabSupp = reader.read("fournisseurs.xml");
        int nbSupp= tabSupp.length;
        List<ClientOrder> tabSuppList = new ArrayList<>(Arrays.asList(tabSupp));
        for (int i=0; i< nbOrder; i++){
            //Convertit le tab en liste pour pouvoir add
            pannel_num[i]=0;
            System.out.println(i);
            for (int j=0; j<nbSupp; j++){
                ClientOrder clientorder = new ClientOrder();

                System.out.println("tab order" + i + "tabSupp " +j +" : " + clientorder.compare_size(tabOrder[i],tabSupp[j]));
                System.out.println("tab order" + i + "tabSupp " +j +" : " + clientorder.compare_number(tabOrder[i],tabSupp[j]));
                if (clientorder.compare_size(tabOrder[i],tabSupp[j]) <= 0 && clientorder.compare_number(tabOrder[i],tabSupp[j]) <= 0 && (clientorder.compare_price(tabOrder[i],tabSupp[j])>=0) && (clientorder.comparedate(tabOrder[i],tabSupp[j])==1)){
                    pannel_num[i]=1;
                    
                    ClientOrder tab=clientorder.cutplank(tabOrder[i],tabSupp[pannel_num[i]]);
                    System.out.println("On a satisfait la commande de la planche " + reader.get_plank_id(tabOrder[i])+" du client "+reader.get_client_id(tabOrder[i]));
                    cut.add(tab);
                    
                    dec_number(tabSupp[j],reader.get_clientorder().get_number(tabOrder[i]));
                    /*for (int k=1; k<tab.length;k++){
                        tabSuppList.add(tab[k]);
                    }*/
                    break;
                }
            }
        }
        for (int k=0; k< nbOrder; k++){
                
                if (pannel_num[k]==0){
                    System.out.println(" Il n'y a pas de panneau assez grand pour satisfaire la commande de la planche "+ reader.get_plank_id(tabOrder[k])+" du client "+reader.get_client_id(tabOrder[k]));
                }
        }
        int taille=cut.size();
        int tab_clientfd[];
        int plank[];
        int x[];
        int y[];
        int id_fournisseur[];
        int pannel[];
        int number[];

        tab_clientfd=new int[taille];
        plank=new int[taille];
        x=new int[taille];
        y=new int[taille];
       
       id_fournisseur=new int[taille];
       pannel=new int[taille];
       number=new int[taille];

    // il faut regarder le type pour savoir si on doit remplir id_fournisseur ou tab_client..

        
        for (int p=0;p<cut.size();p++){


            tab_clientfd[p]=reader.get_client_id(cut.get(p));
            plank[p]=reader.get_plank_id(cut.get(p));
            id_fournisseur[p]=reader.get_client_id(tabSupp[p]);
            pannel[p]=reader.get_plank_id(tabSupp[p]);
            x[p]= reader.getx(cut.get(p));
            y[p]=reader.gety(cut.get(p));
            number[p]=reader.get_number(cut.get(p));

        }
        // On écrit la découpe des planches dans découpes.xml
        reader.write(tab_clientfd, plank,id_fournisseur,pannel,y,x);
        // Svg
        reader.write_svg(x,y,number);

    }

    private static int dec_number(ClientOrder clientorder, int entier){
        Reader reader = new Reader();
        return reader.get_number(clientorder)-entier;
    }

    private ClientOrder cutplank(ClientOrder order, ClientOrder supplier){
        return get_clientorder().cutplank(order,supplier);
    }

    private static Reader initReader(){
        return new Reader();
    }

}