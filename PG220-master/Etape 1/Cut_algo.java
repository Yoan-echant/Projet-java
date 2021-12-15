import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Cut_algo extends Reader{
    
    public static void main(String[] args){
        Reader reader = initReader();
        ClientOrder[] tabOrder=reader.read("clients.xml");
        int nbOrder= tabOrder.length;
        int pannel_num[]=new int[nbOrder];
        ClientOrder[] tabSupp = reader.read("fournisseurs.xml");
        int nbSupp= tabSupp.length;
        List<ClientOrder> tabSuppList = new ArrayList<>(Arrays.asList(tabSupp)); //Convertit le tab en liste pour pouvoir add
        System.out.println("nb_order: "+nbOrder);
        List<ClientOrder> cut = new ArrayList<ClientOrder>();
        for (int i=0; i< nbOrder; i++){
            pannel_num[i]=0;
            for (int j=0; j<nbSupp; j++){
                ClientOrder clientorder = new ClientOrder();
                if (clientorder.compare_size(tabOrder[i],tabSupp[j])>= 0 && clientorder.compare_number(tabOrder[i],tabSupp[j]) <= 0){
                    pannel_num[i]=j;
                    ClientOrder[] tab=clientorder.cutplank(tabOrder[i],tabSupp[pannel_num[i]]);
                    System.out.println("La commande de la planche "+ reader.get_plank_id(tabOrder[i])+"du client "+reader.get_client_id(tabOrder[i])+"à été complété");
                    cut.add(tab[0]);
                    dec_number(tabSupp[j],reader.get_clientorder().get_number(tabSupp[j]));
                    for (int k=1; k<tab.length;k++){
                        tabSuppList.add(tab[k]);
                    }
                    break;
                }
            }
        }
        for (int k=0; k< nbOrder; k++){
            if (pannel_num[k]==0){
                System.out.println("Il n'y a pas de panneau assez grand pour satisfaire la commande de la planche "+ reader.get_plank_id(tabOrder[k])+" du client "+reader.get_client_id(tabOrder[k]));
            }
        }
    }

    private static int dec_number(ClientOrder clientorder, int entier){
        Reader reader = new Reader();
        return reader.get_number(clientorder)-entier;
    }

    private ClientOrder[] cutplank(ClientOrder order, ClientOrder supplier){
        return get_clientorder().cutplank(order,supplier);
    }

    private static Reader initReader(){
        return new Reader();
    }

}