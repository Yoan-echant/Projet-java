public class Reader{
    private ClientOrder clientorder;
    private ReaderXml readerxml;

    public ClientOrder createClientOrder(String date, int number,int type, Double price,int id_client,int idPlank,int length,int width){
        return clientorder.createClientOrder(date,number,type,price,id_client,idPlank,length,width);
    }

    public ClientOrder[] read_xml(String xml){
        String date; 
        int numbe;
        int type;
        Double price;
        int id_client;
        int idPlank;
        int length;
        int width;
        ClientOrder readerclientorder;
        tab = readerxml.reader_xml(xml);
        List<ClientOrder> tab_order = new ArrayList<ClientOrder>();
        for(int i=0; i< tab.length-7; i=i+7){
                id_client = Integer.parseInt(tab[i+0]);
                idPlank = Integer.parseInt(tab[i+1]);
                number = Integer.parseInt(tab[i+2]);
                date   = tab[i+3];
                price = Double.parseDouble(tab[i+4]);
                length = Integer.parseInt(tab[i+5]);
                width = Integer.parseInt(tab[i+6]);
                readerclientorder = createClientOrder(date,number,type, price,id,idplanche,length,width);
                tab_order.add(readerclientorder);
        }
        ClientOrder[] tab_fin = new ClientOrder[tab_order.size()];
        tab_order.toArray(tab_fin);
        return tab_fin;
    }

    // public static void main(String[] args) {
    //     this.ClientOrder = TestReadXml(argv[1]);
    // }

}