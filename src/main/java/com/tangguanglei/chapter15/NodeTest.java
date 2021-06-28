package com.tangguanglei.chapter15;

import java.util.ArrayList;
import java.util.List;

public class NodeTest {

    public static void main(String[] args) {
        Node<Jonathan> node = new Node<>();
        Node<Apple> node1 = new Node<>();
        Node<? extends Fruit> node2 = new Node<Apple>();
        Node<? extends Apple> node3 = new Node<Jonathan>();
        Node<?> node4 = new Node<>();
        Node<? super Fruit> node5 = new Node<Fruit>();
    }

    public static void playFruitTest() {
        List<Apple> apples = new ArrayList<>();
        List<Orange> oranges = new ArrayList<>();
        List<Food> foods = new ArrayList<>();
        playFruit(apples);
        playFruit(oranges);
//        playFruit(foods);
    }

    public static void playFruitBaseTest() {
        List<Apple> apples=new ArrayList<>();
        List<Food> foods =new ArrayList<>();
        List<Object> objects=new ArrayList<>();
//        playFruitBase(apples);
        playFruitBase(foods);
        playFruitBase(objects);
    }

    public static void playEveryListTest() {
        List<Apple> apples=new ArrayList<>();
        List<Fruit> fruits = new ArrayList<>();
        List<Food> foods =new ArrayList<>();
        playEveryList(apples);
        playEveryList(fruits);
        playEveryList(foods);
    }

    //只能取
    public static void playFruit(List<? extends Fruit> list) {
//        list.add(new Apple());
        Fruit fruit = list.get(0);
        fruit.fru();
    }

    public static void playFruitBase(List<? super Fruit> list) {
        list.add(new Apple());
//        Apple fruit = list.get(0);
        Object x = list.get(0);
    }

    public static void playEveryList(List<?> list) {
//        list.add(new Apple());
//        Apple apple = list.get(0);
    }
}