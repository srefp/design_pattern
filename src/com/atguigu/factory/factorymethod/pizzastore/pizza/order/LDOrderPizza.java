package com.atguigu.factory.factorymethod.pizzastore.pizza.order;


import com.atguigu.factory.factorymethod.pizzastore.pizza.pizza.LDCheesePizza;
import com.atguigu.factory.factorymethod.pizzastore.pizza.pizza.LDPepperPizza;
import com.atguigu.factory.factorymethod.pizzastore.pizza.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
