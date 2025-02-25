package com.designpattern;
class Singletone{

  private volatile static Singletone instance;
    private Singletone(){

    }
    public static Singletone getInstance(){
        if(instance==null){
            instance=new Singletone();
        }
        return instance;
    }
}
public class SingleToneDriver {
    public static void main(String[] args) {
        Singletone singletone= Singletone.getInstance();
        Singletone singletone1=Singletone.getInstance();
        if(singletone1==singletone){
            System.out.println("Object are same");
        }


    }

}
