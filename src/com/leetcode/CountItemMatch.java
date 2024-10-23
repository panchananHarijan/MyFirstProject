package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemMatch {

     public static int countMatch(List<List<String>> items,String ruleKey,String ruleValue){
         int index=0;
         if(ruleKey.equals("color"))
             index=1;
          else if (ruleKey.equals("name"))
             index=2;
          int count=0;
          for(List<String> item:items){
              if(item.get(index).equals(ruleValue)){
                  count++;
              }
          }
          return count;


     }
    public static void main(String[] args) {
        String[][] it ={
                {"phone", "blue", "pixel"},
                {"computer", "silver", "lenovo"},
                {"phone", "gold", "iphone"}
        };
        String ruleKey = "color";
         String ruleValue = "silver";

          List<List<String>> item=new ArrayList<>();
          for(String[] val:it){
              item.add(Arrays.asList(val));
          }
          int result=countMatch(item,ruleKey,ruleValue);
        System.out.println(result);

    }
}
