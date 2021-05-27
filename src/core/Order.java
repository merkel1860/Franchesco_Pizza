package core;

import core.model.Drink;
import core.model.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID;
    private List<Pizza> pizzaList = new ArrayList<>();
    private List<Drink> drinks;


    public Order() {
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }
}
