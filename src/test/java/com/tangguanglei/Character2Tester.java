package com.tangguanglei;

import com.tangguanglei.chapter2.FieldInit;
import com.tangguanglei.chapter2.HelloWorld;
import com.tangguanglei.chapter2.StaticField;
import org.junit.Test;

public class Character2Tester {

    /**
     * 类成员默认初始化测试
     */
    @Test
    public void fieldInitTest() {
        FieldInit fieldInit = new FieldInit();
        System.out.println(fieldInit.getA());
        System.out.println(fieldInit.getB());
    }

    /**
     * 打印hello world
     */
    @Test
    public void helloWorldTest() {
        HelloWorld.print();
    }

    /**
     * 静态域测试
     */
    @Test
    public void staticFieldTest() {
        StaticField staticField1 = new StaticField();
        StaticField staticField2 = new StaticField();
        System.out.println(staticField1.i);
        System.out.println(staticField2.i);
        StaticField.i++;
        System.out.println(staticField1.i);
        System.out.println(staticField2.i);
    }
}
