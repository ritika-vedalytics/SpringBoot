package org.example;

public class Desktop implements Computer {
    public Desktop(){
        System.out.println("Desktop constructor");
    }
    public void compile(){
        System.out.println("compiling in Desktop");
    }
}
