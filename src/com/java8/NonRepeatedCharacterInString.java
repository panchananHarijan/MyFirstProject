package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NonRepeatedCharacterInString {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day jkm".replaceAll("\\s+", "").toLowerCase();

        Map<String,Long> nonrep=Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        String s = nonrep.entrySet().stream().filter(m -> m.getValue() == 1).map(m -> m.getKey()).findFirst().get();
        System.out.println(s);

    }
}
