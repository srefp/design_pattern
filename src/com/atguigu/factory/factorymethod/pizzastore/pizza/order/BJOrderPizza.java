package com.atguigu.factory.factorymethod.pizzastore.pizza.order;


import com.atguigu.factory.factorymethod.pizzastore.pizza.pizza.BJCheesePizza;
import com.atguigu.factory.factorymethod.pizzastore.pizza.pizza.BJPepperPizza;
import com.atguigu.factory.factorymethod.pizzastore.pizza.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
