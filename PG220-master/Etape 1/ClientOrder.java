public class ClientOrder extends Order{
    private Client client;
    private Plank plank;

public ClientOrder initClientOrder(){
    ClientOrder clientorder;
    clientorder.number=0;
    clientorder.client=initClient();
    clientorder.plank=initPlank();
    return clientorder;
}

public static ClientOrder createClientOrder(number,id_client,idPlank,length,width){
    ClientOrder clientorder;
    clientorder.number=0;
    clientorder.client=createClient(id_client);
    clientorder.plank=createPlank(idPlank,createSize(length, width));
    return clientorder;
}

}