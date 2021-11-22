public class ClientOrder extends Order{
    private Client client;
    private Plank plank;

public ClientOrder initClientOrder(){
    return new ClientOrder();
}

public ClientOrder createClientOrder(String date, int number,int type, Double price,int id_client,int idPlank,int length,int width){
    return new ClientOrder(date, number, type, price, id_client, idPlank, length, width);
}

private ClientOrder(){
    this.client=client.initClient();
    this.plank=plank.initPlank();
    setnumber(0);
}

private ClientOrder(String date, int number,int type, Double price,int id_client,int idPlank,int length,int width){
    this.client=client.createClient(id_client);
    this.plank=plank.createPlank(idPlank,length, width);
    setnumber(number);
    setdate(date);
    setprice(price);
    settype(type);
}
}