package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        int overloading_1 = p.product(4, 5);
        int overloading_2 = p.product(6, 7, 8);
        double overloading_3 = p.product(9.5, 10.5);
        System.out.println("first method- "+overloading_1+" Second method- "+overloading_2+" Third method- "+overloading_3);

    }
public static class Product{
    public int product(int x, int y){
        return x*y;
    }
    public int product(int x, int y, int z){
        return x*y*z;
    }

    public double product (double x, double y ){
        return x*y;
    }
}
}