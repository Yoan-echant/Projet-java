public class Plank{
    protected int id_plank;
    protected Size size;

    public Plank initPlank(){
        return new Plank();
    }

    public Plank createPlank(int id, Size size){
        return new Plank(id, size);
    }

    protected Plank(){
        this(0,createSize(0,0));
    }

    protected Plank(int id, int length, int width){
        setid(id);
        setsize(createSize(length,width));
    }

    protected void setid(int id){
        this.id_plank=id;
    }

    protected void setsize(Size size){
        this.size=size;
    }
}