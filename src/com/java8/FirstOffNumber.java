package com.java8;

import java.util.stream.Stream;

public class FirstOffNumber {
    public static void main(String[] args) {
        Stream.iterate(new int[]{1,3},f->new int[]{f[1],f[1]+2}).limit(10).map(f->f[0])
                .forEach(i-> System.out.println(i+" "));
    }
}
