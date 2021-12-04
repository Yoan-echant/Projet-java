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

private ClientOrder(Plank plank, Client client){
    this.plank = plank;
    this.client=client;
}

private ClientOrder(String date, int number,int type, Double price,int id_client,int idPlank,int length,int width){
    this.client=client.createClient(id_client);
    this.plank=plank.createPlank(idPlank,length, width);
    setnumber(number);
    setdate(date);
    setprice(price);
    settype(type);
}

public int compare_size(ClientOrder ord1, ClientOrder ord2){
    return plank.compare_size(ord1.plank,ord2.plank);
}

public int compare_number(ClientOrder ord1, ClientOrder ord2){
    int num1= getnumber(ord1);
    int num2= getnumber(ord2);
    if (num1==num2){
        return 0;
    }
    else if (num1>num2){
        return 1;
    }
    else{
        return -1;
    }
}

public int get_number(ClientOrder ord){
    return getnumber(ord);
}

public int get_client_id(ClientOrder ord){
    return client.getid(ord.client);
}

public int get_plank_id(ClientOrder ord){
    return plank.getid(ord.plank);
}

public ClientOrder[] cutplank(ClientOrder order, ClientOrder supplier){
        int i;
        Plank[] tab_ret=plank.cutplank(order.plank, supplier.plank);
        ClientOrder[] tab_sup;
        tab_sup.add(tab_ret[0]);
        for (i=1; i<tab_ret.size;i++){
            tab_sup.add(new ClientOrder(tab_ret[i-1],supplier));
        }
        return tab_sup;
    }
}