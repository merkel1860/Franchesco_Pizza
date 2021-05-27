package core.model;

import core.Ingredrient;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private int idPizza;
    private List<Ingredrient> ingredrientList = new ArrayList<>();
    private Dimesion dimesionPizza;

    public Pizza() {
    }

    public Pizza(String name, Dimesion dimesionPizza) {
        this.name = name;
        this.dimesionPizza = dimesionPizza;
    }
}
