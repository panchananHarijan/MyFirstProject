package com.java8;

import java.util.stream.Stream;

public class Usingjava8FibanicSeeries {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1]}).limit(10).map(f->f[0]).forEach(System.out::println);
    }
}