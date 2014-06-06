package com.epam.ad.hello;
public class Runner {

    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.setGreeter("Hello World!");
        System.out.println(g.getGreeter());

    }
}
