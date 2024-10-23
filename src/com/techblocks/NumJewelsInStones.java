package com.techblocks;

public class NumJewelsInStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        numJewelsInStones(jewels,stones);
    }

    public static int numJewelsInStones(String jewels,String stones){
        int count=0;
        for(int i=0;i<stones.length();i++){
            if(jewels.indexOf(stones.charAt(i))!=-1){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
