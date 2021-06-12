package com.tangguanglei;

import com.tangguanglei.chapter1.Circle;
import com.tangguanglei.chapter1.Shape;
import com.tangguanglei.chapter1.Triangle;
import org.junit.Test;

/**
 * 第1章 测试类
 */
public class Character1Tester {

    /**
     * OOP多态测试,只有在程序运行时才能识别实现的方案,编译器只负责方法的返回值与参数列表类型校验
     */
    @Test
    public void shapeTest() {
        useShape(new Circle());
        useShape(new Triangle());
    }

    private void useShape(Shape shape) {
        System.out.println(shape.draw());
        System.out.println(shape.erase());
        System.out.println(shape.move());
        System.out.println(shape.getColor());
    }
}
