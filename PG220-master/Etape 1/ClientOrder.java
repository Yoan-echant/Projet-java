public class ClientOrder extends Order{
    private Client client;
    private Plank plank;

public ClientOrder initClientOrder(){
    return new ClientOrder();
}

public ClientOrder createClientOrder(int id_client,int idPlank,int length,int width){
    return new ClientOrder(id_client, idPlank, length, width);
}

private ClientOrder(){
    this.client=client.initClient();
    this.plank=plank.initPlank();
    setnumber(0);
}

private ClientOrder(int id_client,int idPlank,int length,int width){
    setnumber(number);
    this.client=client.createClient(id_client);
    this.plank=plank.createPlank(idPlank,length, width);
}
}