package core;

import com.sun.org.apache.xpath.internal.operations.Or;
import core.model.Dimesion;
import core.model.Pizza;

import java.util.Scanner;

public class OrderManagement {
    public Order makeAnOrder(){
        Pizza pizza = makePizzaChoice();
        Order anOrder = new Order();
        anOrder.getPizzaList().add(pizza);
        return anOrder;
    }

    private Pizza makePizzaChoice() {
        Scanner scanner = new Scanner(System.in);
        String pizza;
        String sizePizza;
        System.out.println("What is your flavor?(Pizza|Drink)");
        pizza = scanner.nextLine();
        System.out.println("What is your favorite size?(Pizza)");
        sizePizza = new Scanner(System.in).nextLine();
        return new Pizza(pizza, new Dimesion(sizePizza));
    }
}
