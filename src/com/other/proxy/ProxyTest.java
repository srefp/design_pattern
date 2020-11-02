package com.other.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Company company = new Proxy();
        company.findWorker("Java");
    }
}
