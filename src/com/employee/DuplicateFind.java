package com.employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateFind {
    public static void main(String[] args) {
        int[] arr={6,3,7,8,6,4,3,8,2};
        Integer[] ar={6,3,7,8,6,4,3,8,2};
        String[] strArr = {"apple", "banana", "apple", "orange", "banana"};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+",");

                }
            }
        }

        //create a set to store elements have already been seen
        Set<Integer> hashSet=new HashSet<>();
        for(Integer num:arr){
            if(!hashSet.add(num)){
                System.out.println(num+",");
            }
        }

        //Convert the array to a list
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //print the duplicate
        map.entrySet().stream().filter(enrty->enrty.getValue()>1)
                .map(Map.Entry::getKey).forEach(duplicate-> System.out.println(duplicate+","));
        duplicateFind(ar);
        duplicateFind(strArr);

    }

       //find duplicate between generic type
    public static <T>  void duplicateFind(T[] arr){
        List<T> list = Arrays.stream(arr).collect(Collectors.toList());
      Map<T,Long> frequencyMap= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      frequencyMap.entrySet().stream().filter(entry->entry.getValue()>1)
              .map(Map.Entry::getKey).forEach(duplicate-> System.out.println(duplicate+","));

    }


}
