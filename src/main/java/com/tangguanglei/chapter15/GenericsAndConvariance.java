package com.tangguanglei.chapter15;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndConvariance {

    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<Apple>();
//        flist.add(new Apple());
//        flist.add(new Fruit());
//        flist.add(new Object());
        Fruit f = flist.get(0);
    }
}
