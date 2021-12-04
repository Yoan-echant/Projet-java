public interface Lecture{
    public ClientOrder createClientOrder(String date, int number,int type, Double price,int id_client,int idPlank,int length,int width);
    public ClientOrder[] reader_xml(String xml);
    public int compare_size(ClientOrder ord1, ClientOrder ord2);
    public int compare_number(ClientOrder ord1, ClientOrder ord2);
    public int get_number(ClientOrder ord);
    public int get_client_id(ClientOrder ord);
    public int get_plank_id(ClientOrder ord);
}