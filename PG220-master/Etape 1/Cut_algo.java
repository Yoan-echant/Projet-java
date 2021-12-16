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
                if (clientorder.compare_size(tabOrder[i],tabSupp[j]) <= 0 && clientorder.compare_number(tabOrder[i],tabSupp[j]) <= 0){
                    pannel_num[i]=1;
                    
                    ClientOrder tab=clientorder.cutplank(tabOrder[i],tabSupp[pannel_num[i]]);
                    System.out.println("On a satisfait la commande de la planche " + reader.get_plank_id(tabOrder[i])+" du client "+reader.get_client_id(tabOrder[i]));
                    cut.add(tab);
                    
                    dec_number(tabSupp[j],reader.get_clientorder().get_number(tabSupp[j]));
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
        int planche[];
        int x[];
        int y[];
        // int id_fournisseur[];
        // int panneau[]

        tab_clientfd=new int[taille];
        planche=new int[taille];
        x=new int[taille];
        y=new int[taille];
       
      // id_fournisseur=new int[taille];
      // planche=new int[taille];

    // il faut regarder le type pour savoir si on doit remplir id_fournisseur ou tab_client..

        
        for (int p=0;p<cut.size();p++){

            //probleme de static;
            tab_clientfd[p]=get_client_id(cut.get(p));
            planche[p]=get_plank_id(cut.get(p));
          //  id_fournisseur[p]=
           // panneau[p]=
            x[p]= getx(cut.get(p));
            y[p]=gety(cut.get(p));

        }
        // fonction inaccessible pour le moment; 
        ecriture(tab_clientfd, planche,/*id_fournisseur,panneau,*/x,y);
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