package com.techblocks;

import java.util.ArrayList;
import java.util.List;

public class WordGivenCharacterExistCheck {

    public static void main(String[] args) {
      String[] arr={"Leet","Code","dog"};
       String x="e";
        WordGivenCharacterExistCheck.StirngCheck(arr,x);
    }

    public static void  StirngCheck(String[] arr,String x){
        List<String> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].indexOf(x)!=-1){
                //System.out.println(arr[i]);
                list.add(arr[i]);

            }
        }
        System.out.println(list);
    }
}
