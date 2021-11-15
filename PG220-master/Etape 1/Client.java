public class Client{
    private int id_client;


    public Client initClient(){
        return new Client();
    }

    public Client createClient(int id_client){
        return new Client(id_client);
    }

    public Client(){
        this(0);
    }

    public Client(int id){
        setid(id);
    }

    private void setid(int id){
        this.id_client=id;
    }

    public int getid(){
        return id_client;
    }
}