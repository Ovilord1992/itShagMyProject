package m9.Task_2;


import m9.Task_2.entity.Invoice;
import m9.Task_2.entity.Item;
import m9.Task_2.entity.Warehouse;
import m9.Task_2.entity.mockDB.DB;
import m9.Task_2.service.WarehouseService;

public class Runner {

    private static WarehouseService warehouseService = new WarehouseService();


    public static void main(String[] args) throws Exception {
        DB db = DB.getInstance();
        Warehouse wh0 = db.getInstance().getWarehouses().get(0);
        Warehouse wh1 = db.getInstance().getWarehouses().get(1);
        Invoice in0 = db.getInvoices().get(0);
        Invoice in1 = db.getInvoices().get(1);
        warehouseService.runInvoice(wh0, in0);
        warehouseService.runInvoice(wh1, in1);
        warehouseService.printItems(wh0);
        warehouseService.printItems(wh1);
        warehouseService.printOneItems(wh1, "печенье");
    }

}
