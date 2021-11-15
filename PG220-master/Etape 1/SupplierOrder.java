class SupplierOrder extends Order{
    private Supplier supplier;
    private Panel panel;


    private SupplierOrder(){
        this.supplier=supplier.initSupplier();
        this.panel = panel.initPanel();
        setnumber(0);
    }

    private SupplierOrder(int id_supplier, int panel_number,int id_panel,int length, int width){
        supplier.setid(id_supplier);
        this.panel= panel.createPanel(id_panel,length, width);
        setnumber(panel_number);
    }

    private SupplierOrder initSupplierOrder(){
        return new SupplierOrder();

    }

    private SupplierOrder createSupplierOrder(int id_supplier, int panel_number,int id_panel,int length, int width){
        return new SupplierOrder(id_supplier,  panel_number,id_panel,length, width);
    }
}