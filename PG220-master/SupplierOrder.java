class SupplierOrder{
    Supplier supplier;
    int panel_number;
    int id_panel;


    public SupplierOrder(){
        this(this.supplier.initSupplier(),0,0);
    }

    public SupplierOrder(Supplier supplier, int panel_number,int id_panel){
        setsupplier(supplier);
        this.panel_number = panel_number;
        this.id_panel = id_panel;
    }


    public SupplierOrder initSupplierOrder(){
        return new SupplierOrder();

    }

    public SupplierOrder createSupplierOrder(Supplier suppler){
        return new SupplierOrder(supplier);
    }

    public void setsupplier(Supplier supplier){
        this.supplier = supplier;
    }

    
}