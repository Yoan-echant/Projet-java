class Panel{
    private int id_panel;
    private Size size;

    public Panel(){
        this(0,);
    }

    public Panel(int id_panel, Size size){
        setid(id_panel);
        setsize(size);
    }

    public Panel initPanel(){
        return new Panel();
    }

    public Panel createPanel(int id_panel, Size size ){
        return new Panel(id_panel, size);
    }

    public void setid(int id_panel){
        this.id_panel = id_panel;
    }

    public void setsize(Size size){
        this.size = 
   
    }

}