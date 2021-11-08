public class ClientOrder extends Order{
    public Client client;
    public Plank plank;
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
    clientorder.plank=createPlank(idPlank,(length,width));
    return clientorder;
}
}