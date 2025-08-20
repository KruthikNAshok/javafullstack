package com.xworkz.fruitapp;

import com.xworkz.fruitapp.apple.Apple;
import com.xworkz.fruitapp.orange.Orange;

public class FruitRunner {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.ID = 1;
        apple.Name = "Red Delicious";

        Orange orange = new Orange();
        orange.ID = 2;
        orange.Name = "Nagpur Orange";

        System.out.println("Apple ID: " + apple.ID);
        System.out.println("Apple Name: " + apple.Name);
        System.out.println("Orange ID: " + orange.ID);
        System.out.println("Orange Name: " + orange.Name);
    }
}