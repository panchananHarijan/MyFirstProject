package com.techblocks;

public class FindValueAfterSol {
    public static void main(String[] args) {
        String [] arr= {"--X","X++","X++"};
        finalValueAfterOperation(arr);

    }
    public static int finalValueAfterOperation(String[] arr){
            int count=0;
            for(int i=0;i<arr.length;i++){

                if(arr[i]=="++X" ||arr[i]=="X++"){
                    count++;
                } else if (arr[i]=="--X"||arr[i]=="X--") {
                    count--;

                }
            }
        System.out.println(count);

        return count;

    }

}
