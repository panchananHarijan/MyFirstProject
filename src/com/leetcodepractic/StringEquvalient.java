package com.leetcodepractic;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class StringEquvalient {
    public static void main(String[] args) {
        String [] str1={"a", "cb"};
        String [] str2={"ab", "c"};
       System.out.println(chekStringEquavelient(str1,str2));

        String str="Hyderabad";
       System.out.println( reverseString(str));
       System.out.println(reverseStringTest(str));

        int[] arr={0,1,0,3,12,0,5,0};
        moveZeroToRight(arr);

        String ms="My Hyderabad Is Very Good For It";
       countWordStartWithCapital(ms);

        int [] numbers = {10, 5, 20, 8, 20, 25, 5};
        findSecondHeighestNumber(numbers);

        Integer[] ar={2, 3, 4, 5, 6, 7, 8, 10};
        sumOfEven(ar);


    }

    public static boolean chekStringEquavelient(String[] word1,String[] word2){
        StringBuilder str=new StringBuilder("");
        StringBuilder str2=new StringBuilder("");
        for(int i=0;i<word1.length;i++){
            str.append(word1[i]);
        }
        for(int i=0;i<str2.length();i++){
            str2.append(word2);
        }
        return (str.toString().equals(str2.toString()));

    }

    public static  String reverseString(String str){
        StringBuilder st=new StringBuilder(str);
        return st.reverse().toString();
    }

    public static String reverseStringTest(String str){
        char[] charArray = str.toCharArray();
        int start=0;
        int end=charArray.length-1;
        while(start<end){
            char temp=charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;
            start++;
            end--;
        }
        return  new String(charArray);
    }

    //move zero to right
    public static void moveZeroToRight(int[] array){
        int nonZeroIndex=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                int temp=array[nonZeroIndex];
                array[nonZeroIndex]=array[i];
                array[i]=temp;
                nonZeroIndex++;
            }
        }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }

    public static void countWordStartWithCapital(String st){
       int count=0;
      /* for(int i=0;i<st.length();i++){
           if(Character.isUpperCase(st.charAt(i))){
               count++;
           }

       }
        System.out.println(count);*/
        String[] arr=st.split(" ");
        for(String word:arr){
            if(Character.isUpperCase(word.charAt(0))){
                count++;

            }
        }
        System.out.println(count);
    }

    public static void findSecondHeighestNumber(int[] number) {
        OptionalInt result = Arrays.stream(number).distinct().boxed().sorted((a, b) -> Integer.compare(b, a)).skip(1)
                .mapToInt(Integer::intValue)
                .findFirst();

        System.out.println(result);

        result.ifPresentOrElse(
                value -> System.out.println("Second largest number: " + result),
                () -> System.out.println("No second largest number found")
        );
    }

    public static void sumOfEven(Integer[] arr){
        int sum = Arrays.stream(arr).filter(m -> m % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }






}
