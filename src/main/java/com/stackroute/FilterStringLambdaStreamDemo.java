package com.stackroute;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStringLambdaStreamDemo {
    public List<String> search(List<String> list) {
        // Your code goes here
        if(list.toString().length()==0) return list;
        Stream<String> stringStream = list.stream().filter((s)->s.startsWith("a"));
        Stream<String> stringStream1 = stringStream.filter((s)->s.length()==3);
        List<String>stringList = stringStream1.collect(Collectors.toList());
        return stringList;
    }
}
