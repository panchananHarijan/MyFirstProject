package com.leetcode;

public class RitchestCostumerWealth {
    public static int findRithestCostumer(int[][] accounts){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts.length;j++){
                sum=sum+accounts[i][j];
                max=Math.max(max,sum);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{3,2,1}};
        findRithestCostumer(accounts);
    }
}
