public class Cut_algo extends Reader{
    public void main(int argv, String[] args){
        ClientOrder[] tabOrder=read("clients.xml");
        ClientOrder[] cut;
        int nbOrder= tabOrder.length;
        int pannel_num[]=new int[nbOrder];
        for (int i=0; i< nbOrder; i++){
            ClientOrder[] tabSupp = read("fournisseur.xml");
            int nbSupp= tabSupp.length;
            for (int j; j<nbSupp; j++){
                if (compare_size(tabOrder[i],tabSupp[j])>= 0 && compare_number(tabOrder[i],tabSupp[j]) >= 0){
                    pannel_num[i]=j;
                    ClientOrder[] tab=cutplank(tabOrder[i],tabSupp[pannel_num[i]]);
                    cut.add(tab[0]);
                    dec_number(tabSupp[j],clientorder.get_number(tabSupp[j]);
                    for (k=1; k<tab.length;k++){
                        tabSupp.add(tab[k]);
                    }
                    break;
                }
            }
            for (int i=0; i< nbOrder; i++){
                if (pannel_num[i]==0){
                    System.out.print("Il n'y a pas de panneau assez grand pour satisfaire la commande de la planche"+ get_plank_id(tabOrder[i])+"du client"+get_client_id(tabOrder[i]));
                }
            }
        }
    }
<<<<<<< HEAD

    private int reduce_number(ClientOrder clientorder, int entier){
        return get_number(clientorder)-entier;
    }
=======
}

private ClientOrder[] cutplank(ClientOrder order, ClientOrder supplier){
    return clientorder.cutplank(order,supplier);
>>>>>>> 418ef78817f38c341f92eeccd4ad98dee5405358
}