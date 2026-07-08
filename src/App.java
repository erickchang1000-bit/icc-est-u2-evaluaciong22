import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import controllers.InventoryController;
import models.LabSupply;

public class App {

    public static void main(String[] args) {

        // Crear la lista de suministros
        List<LabSupply> supplies = new ArrayList<>();

        supplies.add(new LabSupply("IN-205-104", "Ana Torres", 80));
        supplies.add(new LabSupply("IN-205-105", "Luis Romero", 40));
        supplies.add(new LabSupply("IN-205-106", "Erick Chang", 15));
        supplies.add(new LabSupply("IN-205-107", "Sebas Muñoz", 60));
        supplies.add(new LabSupply("IN-205-108", "Fernando Flores", 25));
        supplies.add(new LabSupply("IN-205-109", "Destroyer Anastasio", 10));
        supplies.add(new LabSupply("IN-205-110", "Erick Void", 90));

        InventoryController controller = new InventoryController();
        System.out.println("filtrados y ordneados");

        Set<LabSupply> resultado = controller.filterAndSortSupplies(supplies, 20);

        for (LabSupply s : resultado) {
            System.out.println(s);
        }
        System.out.println("supplies");

        Map<String, List<String>> categorias =
                controller.groupCodesByStock(supplies);

        for (Map.Entry<String, List<String>> entry : categorias.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}