package com.tangguanglei.chapter1;

/**
 * 测试OOP中的多态概念
 */
public class Client {

    /**
     * 编译器只负责校验传入的参数与返回值类型的正确性，具体执行哪个对象实现只有在运行时才能确认
     * @param shape 基类
     */
    public void useShape(Shape shape) {
        System.out.println(shape.draw());
        System.out.println(shape.erase());
        System.out.println(shape.move());
        System.out.println(shape.getColor());
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.useShape(new Circle());
        client.useShape(new Triangle());
    }
}
