import java.util.List;
import java.util.ArrayList;

public class Reader{
    private ClientOrder clientorder;
    private ReaderXml readerxml;

    public ClientOrder createClientOrder(String date, int number,int type, Double price,int id_client,int idPlank,int length,int width){
        return clientorder.createClientOrder(date,number,type,price,id_client,idPlank,length,width);
    }

    public ClientOrder[] read(String xml){
        String date; 
        int number;
        int type;
        Double price;
        int id_client;
        int idPlank;
        int length;
        int width;
        ClientOrder readerclientorder;
        String [] tab = readerxml.reader_xml(xml);
        List<ClientOrder> tab_order = new ArrayList<ClientOrder>();
        for(int i=0; i< tab.length-8; i=i+8){
                type = Integer.parseInt(tab[i+0]);
                id_client = Integer.parseInt(tab[i+1]);
                idPlank = Integer.parseInt(tab[i+2]);
                number = Integer.parseInt(tab[i+3]);
                date   = tab[i+4];
                price = Double.parseDouble(tab[i+5]);
                length = Integer.parseInt(tab[i+6]);
                width = Integer.parseInt(tab[i+7]);
                readerclientorder = createClientOrder(date,number,type, price,id_client,idPlank,length,width);
                tab_order.add(readerclientorder);
        }
        ClientOrder[] tab_fin = new ClientOrder[tab_order.size()];
        tab_order.toArray(tab_fin);
        return tab_fin;
    }

    // public static void main(String[] args) {
    //     this.ClientOrder = TestReadXml(argv[1]);
    // }

    public int compare_size(ClientOrder ord1, ClientOrder ord2){
        return clientorder.compare_size(ord1,ord2);
    }

    public int compare_number(ClientOrder ord1, ClientOrder ord2){
        return clientorder.compare_number(ord1,ord2);
    }

    public int get_number(ClientOrder ord){
        return(clientorder.getnumber(ord));
    }

    public int get_client_id(ClientOrder ord){
        return(clientorder.get_client_id(ord));
    }
    public int get_plank_id(ClientOrder ord){
        return(clientorder.get_plank_id(ord));
    }

    public ClientOrder get_clientorder(){
        return this.clientorder;
    }

}