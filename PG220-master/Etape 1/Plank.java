public class Plank{
    private int id_plank;
    private Size size;

    public Plank initPlank(){
        return new Plank();
    }

    public Plank createPlank(int id, Size size){
        return new Plank(id, size);
    }

    private Plank(){
        this.id_plank=0;
        this.size=getplanksize();
    }

    private Plank(int id, Size size){
        setid(id);
        setsize(size);
    }

    private void setid(int id){
        this.id_plank=id;
    }

    private Size getplanksize(){
        return size.initSize();
    }

    private void setsize(Size size){
        this.size=size;
    }
}