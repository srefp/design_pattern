package com.atguigu.composite;

import java.util.ArrayList;
import java.util.List;

//University就是Composite，可以管理College
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    //构造器
    public University(String name, String des) {
        super(name, des);
    }

    //重写add()


    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    //重写remove()
    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    //重写getName()
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //print()方法，就是输出University包含的学院
    @Override
    protected void print() {
        System.out.println("---------------" + getName() + "---------------");
        //便利organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }

    }
}
