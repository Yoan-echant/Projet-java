public class Reader{
    private ClientOrder clientorder;

    public ClientOrder createClientOrder(String date, int number,int type, Double price,int id_client,int idPlank,int length,int width){
        return clientorder.createClientOrder(date,number,type,price,id_client,idPlank,length,width);
    }

    // public read_xml(String xml){
        

    // }


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

}