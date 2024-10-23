package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergTwoArrayList {
    public static void main(String[] args) {
     List<Integer> list=new ArrayList<>();
     list.add(10);
     list.add(6);
     list.add(30);
     List<Integer> list2=new ArrayList<>();
     list2.add(40);
     list2.add(50);
     list2.add(50);

     list.addAll(list2);
        Collections.sort(list);
     for(Integer mn:list){
         System.out.print(mn+" ");
     }

    }
}
