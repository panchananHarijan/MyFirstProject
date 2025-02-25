package com.leetcodepractic;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindNonRepeatedCharacter {
    public static void main(String[] args) {
       String str="abaccdeff";
       findNonRepeatCharacter(str);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 8);
        findDuplicateElementFromArray(numbers);
        String sentence = "Java 8 is powerful";
       reverseString(sentence);
       String text = "Java is awesome and Java is powerful";
       wordCountInArray(text);
        int[] arr={3,40,0,3,0,34,0,0,3,4,2,5,0,0,0,0,246,35};
        zeroMovedRight(arr);


    }

    public static void findNonRepeatCharacter(String str){
        IntStream stream = str.chars();
        stream.distinct().filter(ch->str.indexOf(ch)==str.lastIndexOf(ch)).findFirst()
                .ifPresent(ch-> System.out.println("Find non repeated character:"+(char)ch));

    }

    public static void findDuplicateElementFromArray(List<Integer> numbers){
         Set<Integer> dupliacte= numbers.stream().collect(Collectors.groupingBy(number->number,Collectors.counting()))
                  .entrySet().stream().filter(number->number.getValue()>1)
                  .map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println("Duplicate element are:"+dupliacte);
    }
    public static void reverseString(String str){
        String reverse=Arrays.stream(str.split(" ")).map(word->new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(reverse);

    }
    public static void wordCountInArray(String text){
          Map<String,Long> map= Arrays.stream(text.toLowerCase().split(" "))
                   .collect(Collectors.groupingBy(word->word,Collectors.counting()));
        System.out.println(map);
    }

    public static void zeroMovedRight(int[] arr){
        int[] newarr = new int[arr.length];
        int counter =0;
        for(int i=0; i< arr.length;i++){
            if(arr[i]>0){
                newarr[counter] = arr[i];
                counter++;
            }
        }
        for(int j=0; j < newarr.length;j++){
            System.out.print(newarr[j]+" ");
        }

    }

    public static void zeroMovesRightSide(int[] arr){
        int nonZeroIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[nonZeroIndex];
                arr[nonZeroIndex]=arr[i];
                arr[i]=temp;
                nonZeroIndex++;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }




}
