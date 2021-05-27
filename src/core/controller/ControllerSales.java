package core.controller;

import core.Order;
import core.view.OrderManagement;

public class ControllerSales {

    public void init(){
        Order order = OrderManagement.makeAnOrder();
    }
}
