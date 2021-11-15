class SupplierOrder extends Order{
    private Supplier supplier;
    private int panel_number;


    private SupplierOrder(){
        this.supplier.initSupplier();
        this.panel_number = 0;
    }

    private SupplierOrder(Supplier supplier, int panel_number,int id_panel){
        setsupplier(supplier);
        this.panel_number = panel_number;
        this.id_panel = id_panel;
    }


    private SupplierOrder initSupplierOrder(){
        return new SupplierOrder();

    }

    private SupplierOrder createSupplierOrder(Supplier suppler){
        return new SupplierOrder(supplier);
    }

    private void setsupplier(Supplier supplier){
        this.supplier = supplier;
    }

}