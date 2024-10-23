package com.techblocks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TwoArrayListAddAndMerg {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(12);
        list1.add(20);
        list1.add(90);
        List<Integer> list2=new ArrayList<>();
        list2.add(23);
        list2.add(20);
        list2.add(19);
        boolean b = list1.addAll(list2);
        Collections.sort(list1);
        System.out.println(list1);

    }
}
