package controllers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.LabSupply;

public class InventoryController {

    // Metodo A
    public Set<LabSupply> filterAndSortSupplies(List<LabSupply> supplies, int minimumStock) {

        if (supplies == null) {
            return new TreeSet<>();
        }

        Set<LabSupply> resultado = new TreeSet<>(new Comparator<LabSupply>() {

            @Override
            public int compare(LabSupply s1, LabSupply s2) {
                int compStock = Integer.compare(s2.getStock(), s1.getStock());

                if (compStock != 0) {
                    return compStock;
                }
                return s1.getCode().compareToIgnoreCase(s2.getCode());
            }
        });

        for (LabSupply s : supplies) {

            if (s != null && s.getStock() >= minimumStock) {
                resultado.add(s);
            }
        }

        return resultado;
    }

    // Metodo B
    public Map<String, List<String>> groupCodesByStock(List<LabSupply> supplies) {

        Map<String, List<String>> mapaCategorias = new TreeMap<>();

        mapaCategorias.put("HIGH", new ArrayList<>());
        mapaCategorias.put("MEDIUM", new ArrayList<>());
        mapaCategorias.put("LOW", new ArrayList<>());

        if (supplies == null) {
            return mapaCategorias;
        }

        for (LabSupply s : supplies) {

            if (s == null) {
                continue;
            }

            String categoria;

            if (s.getStock() >= 50) {
                categoria = "HIGH";
            } else if (s.getStock() >= 20) {
                categoria = "MEDIUM";
            } else {
                categoria = "LOW";
            }

            String codigo = s.getCode();

            if (!mapaCategorias.get(categoria).contains(codigo)) {
                mapaCategorias.get(categoria).add(codigo);
            }
        }

        return mapaCategorias;
    }
}