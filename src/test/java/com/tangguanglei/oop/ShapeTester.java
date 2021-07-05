package com.tangguanglei.oop;

import org.junit.Test;

/**
 * OOP多态示例
 */
public class ShapeTester {

    @Test
    public void testShape() {
        //这里不同类型可以直接赋值,体现了OOP的多态特性
        Shape circle = new Circle("shape1");
        System.out.println(circle.getName());
        System.out.println(circle.draw());
        Shape triangle = new Triangle("shape2");
        System.out.println(triangle.getName());
        System.out.println(triangle.draw());
        Shape squire = new Squire("shape3");
        System.out.println(squire.getName());
        System.out.println(squire.draw());
    }
}
