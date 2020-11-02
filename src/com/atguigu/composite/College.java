package com.atguigu.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {
    //List中存放的是Department
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    //构造器
    public College(String name, String des) {
        super(name, des);
    }

    //重写add()


    @Override
    protected void add(OrganizationComponent organizationComponent) {
        //将来实际业务中，College的add和University的add不一定完全一样
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
