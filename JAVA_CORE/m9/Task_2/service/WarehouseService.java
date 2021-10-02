package m9.Task_2.service;


import m9.Task_2.entity.Warehouse;
import m9.Task_2.entity.Invoice;
import m9.Task_2.entity.mockDB.DB;
import java.text.ParseException;

public class WarehouseService {

    public void printItems(Warehouse warehouse) {
        System.out.println("Предметы на складе по адресу: " + warehouse.getAddress());
        warehouse.getItems().forEach(
                System.out::println
        );
    }

    public void printOneItems(Warehouse warehouse, String item) {
        warehouse.getItems().stream().filter(o -> o.getName().equalsIgnoreCase(item)).forEach(
                v -> System.out.printf("товар %s есть на складе %s", item, warehouse.getAddress())
        );
    }

    public void printIssuers() throws ParseException {
        DB.getInstance().getIssuers().forEach(
                (k, v) -> {
                    System.out.printf("Номер поставщика: %d, имя поставщика: %s\n", k, v);
                }
        );
    }

    public Warehouse runInvoice(Warehouse warehouse, Invoice invoice) throws Exception {
        if (!invoice.isDeleted()) {
            invoice.getItems().forEach(item ->
                    warehouse.getItems().add(item)
            );
            invoice.setDeleted(true);
        } else {
            throw new Exception("Накладная уже использована");
        }
        return warehouse;
    }

    /** ДЗ №1 (Товары могут поступать как от внешних поставщиков, так и перемещаться между
     складами компании.):
     *
     * - Создать метод трансферу между складами (на вход приходят склад1, склад2, идПрдметов)
     * - Сгенерировать накладную с предметами для перемещения
     * - Удаляете предметы из склада 1
     * - Вызываете метод runInvoice с созданной накладной для склада 2
     *
     * ДЗ №2:
     * - искать товар на складе по наименованию.
     */
}
