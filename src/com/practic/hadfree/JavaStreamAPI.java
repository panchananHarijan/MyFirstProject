package com.practic.hadfree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamAPI {
    public static void main(String[] args) {
        /*List<Integer> list= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //find even number
        List<Integer> result=list.stream().filter(m->m%2==0).toList();
        System.out.println(result);


        //Stream.Of()
        Stream<Integer> smt=Stream.of(1,2,3,4,5,6,7,8,9);
        smt.forEach(m->System.out.print(m+","));

        //Stream.Of(array)
       Stream<Integer> stm= Stream.of(new Integer[]{1,2,3,4,5,6,7,8,9});
       stm.forEach(n->System.out.print(n+","));
       */


       //List.stream()

       /* List<Integer> lit=new ArrayList<>();
        for(int i=1;i<10;i++){
            lit.add(i);
        }
        lit.stream().forEach(n->System.out.println(n));

        */


        //Stream.generate() or Stream.iterate()
        Stream<Integer> rand=Stream.generate(()->new Random().nextInt(100));
        rand.limit(20).forEach(System.out::println);

        //Intermediate operation
        List<String> memberShip=new ArrayList<>();
        memberShip.add("Amitabh");
        memberShip.add("Shekhar");
        memberShip.add("Aman");
        memberShip.add("Rahul");
        memberShip.add("Shahrukh");
        memberShip.add("Salman");
        memberShip.add("Yana");
        memberShip.add("Lokesh");

        //Stream.filter()
        memberShip.stream().filter(n->n.startsWith("A")).forEach(System.out::println);

        //Stream.Map()
        memberShip.stream().map(String::toUpperCase).filter(m->m.startsWith("A")).forEach(System.out::println);

        //Stream.sorted()
        memberShip.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

        //Terminal operator
        //Stream.foreach()
        List<String> lst=memberShip.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(lst);

        //Stream.match()
        boolean result = memberShip.stream().allMatch(k -> k.startsWith("A"));//true
        System.out.println(result);
        boolean mun=memberShip.stream().anyMatch(n->n.startsWith("B"));//false
        System.out.println(mun);
        boolean bhun=memberShip.stream().noneMatch(j->j.startsWith("W"));//false
        System.out.println(bhun);

        //Stream count
        Long reslt=memberShip.stream().filter(n->n.startsWith("A")).count();
        System.out.println(reslt);

        //Stream.reduce()
        String reduce = memberShip.stream().reduce((s1, s2) -> s1 + "#" + s2).get();

        //Stream.anyMatch()
        boolean match=memberShip.stream().anyMatch(s->s.startsWith("A"));
        System.out.println(match);

        //Stream.findFirst();

        String findFirst=memberShip.stream().filter(m->m.startsWith("A")).findFirst().get();
        System.out.println(findFirst);

        //Paraller Stream




    }
}
