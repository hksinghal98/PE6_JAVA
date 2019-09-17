package com.stackroute;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransformStringLambdaStreamDemo {
    public String getString(List<Integer> list) {
        // Your code goes here
        if(list.size()==0) return null;
        Stream<String> stringStream = list.stream().map((i)->(i%2==0)?"e"+i.toString():"o"+i.toString());
        List<String> outputlist = stringStream.collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<outputlist.size();i++) { sb.append(outputlist.get(i)).append(","); }
        return sb.toString().substring(0,sb.toString().length()-1);
    }

}
