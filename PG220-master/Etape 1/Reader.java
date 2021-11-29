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

}