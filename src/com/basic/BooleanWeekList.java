package com.basic;

import java.util.ArrayList;
import java.util.List;

public class BooleanWeekList {
    public static void main(String[] args) {
        List<Boolean> booleanList=new ArrayList<>();

        for(int i=0;i<7;i++){
            if(i==0){
                booleanList.add(true);

            }
            else{
                booleanList.add(false);
            }
        }
        System.out.println(booleanList);

        int trueIndex=-1;
        for(int i=0;i<booleanList.size();i++){
            if(booleanList.get(i)){
                trueIndex=i;
                break;
            }
        }
        if(trueIndex!=-1){
            System.out.println("The index of the first true value is: " + trueIndex);
        }
        else{
            System.out.println("No True Value find");
        }
    }
}
