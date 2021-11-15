class Panel{
    private int id_panel;
    private Size size;

    public Panel(){
        this.id_panel =0;
        this.size.setlength(0);
        this.size.setwidth(0);
    }

    public Panel(int id_panel, int length, int width){
        setid(id_panel);
        setsize(size.CreateSize(length, width));
    }

    public Panel initPanel(){
        return new Panel();
    }

    public Panel createPanel(int id_panel, int length, int width){
        return new Panel(id_panel, length, width);
    }

    private void setid(int id_panel){
        this.id_panel = id_panel;
    }

    private void setsize(Size size){
        this.size = size;
    }


}