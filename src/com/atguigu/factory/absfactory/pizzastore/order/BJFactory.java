package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.factorymethod.pizzastore.pizza.pizza.BJCheesePizza;
import com.atguigu.factory.factorymethod.pizzastore.pizza.pizza.BJPepperPizza;
import com.atguigu.factory.factorymethod.pizzastore.pizza.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式~");
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
