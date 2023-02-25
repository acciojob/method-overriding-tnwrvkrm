package com.driver;

import java.util.*;
import java.io.*;

public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }
    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String args[]){
        B b = new B();
        b.meth();
        System.out.println(b.meth());
        B b2 = new B();
        b2.meth();
        System.out.println(b2.meth());
    }
}

