package com.easylevel;

public class ClearDigit {
    public static void main(String[] args) {
      String str="cb23";
      clearString(str);

    }
    public static String clearString(String str){
          StringBuilder builder=new StringBuilder();
          for(int i=0;i<str.length();i++){
              if(Character.isDigit(str.charAt(i))){
                  builder.deleteCharAt(builder.length()-1);
              }
              else{
                  builder.append(str.charAt(i));
              }
          }
          return builder.toString();
    }

    public static void clearDigtFromString(String str){
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
               builder.append(str.charAt(i));
            }
        }
        System.out.println(builder.toString());
    }
}
