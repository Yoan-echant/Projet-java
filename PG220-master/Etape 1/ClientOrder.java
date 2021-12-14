import java.util.List;
import java.util.ArrayList;

public class ClientOrder extends Order{
    private Client client;
    private Plank plank;

    public ClientOrder initClientOrder(){
        return new ClientOrder();
    }

    public ClientOrder createClientOrder(String date, int number,int type, Double price,int id_client,int idPlank,int length,int width){
        return new ClientOrder(date, number, type, price, id_client, idPlank, length, width);
    }

    public ClientOrder(){
        Client client = new Client();
        Plank plank = new Plank();
        this.client=client.initClient();
        this.plank=plank.initPlank();
    }

    private ClientOrder(Plank plank, Client client){
        this.plank = plank;
        this.client=client;
    }

    private ClientOrder(String date, int number,int type, Double price,int id_client,int idPlank,int length,int width){
        Client client = new Client();
        Plank plank = new Plank();
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
            Plank[] tab_ret=plank.cut_plank(order.plank, supplier.plank);
            List<ClientOrder> tab_sup = new ArrayList<ClientOrder>();
            //tab_sup.add(tab_ret[0]);
            for (int i=1; i<tab_ret.length;i++){
                tab_sup.add(new ClientOrder(tab_ret[i-1],supplier.client));
            }
            ClientOrder[] tab_fin = new ClientOrder[tab_sup.size()];
            tab_sup.toArray(tab_fin);
            return tab_fin;
        }
}