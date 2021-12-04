public class Cut_algo extends Reader{
    public void main(int argv, String[] args){
        ClientOrder[] tabOrder=read("clients.xml");
        int nbOrder= tabOrder.length;
        int pannel_num[]=new int[nbOrder];
        for (int i=0; i< nbOrder; i++){
            ClientOrder[] tabSupp = read("fournisseur.xml");
            int nbSupp= tabSupp.length;
            for (int j; j<nbSupp; j++){
                if (compare_size(tabOrder[i],tabSupp[j])>= 0 && compare_number(tabOrder[i],tabSupp[j]) >= 0){
                    pannel_num[i]=j;
                    break;
                }
            }
            if (pannel_num[i]==0){
                System.out.print("Il n'y a pas de panneau assez grand pour satisfaire la commande de la planche"+ get_plank_id(tabOrder[i])+"du client"+get_client_id(tabOrder[i]));
            }
            else{
                cut.cutplank(tabOrder[i],tabSupp[pannel_num[i]]);
                modif_xml_fournisseur(pannel_num[i],get_number(tabOrder[i]));
            }
        }
    }

    private int reduce_number(ClientOrder clientorder, int entier){
        return get_number(clientorder)-entier;
    }
}