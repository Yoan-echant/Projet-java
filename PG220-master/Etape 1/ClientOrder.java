public class ClientOrder extends Order{
    private Client client;
    private Plank plank;

public ClientOrder initClientOrder(){
    return new ClientOrder();
}

public ClientOrder createClientOrder(int number,int id_client,int idPlank,int length,int width){
    return new ClientOrder(number, id_client, idPlank, length, width);
}

private ClientOrder(){
    this.number=0;
    this.client=client.initClient();
    this.plank=plank.initPlank();
}

private ClientOrder(int number,int id_client,int idPlank,int length,int width){
    this.number=number;
    this.client=client.createClient(id_client);
    this.plank=plank.createPlank(idPlank,length, width);
}
}