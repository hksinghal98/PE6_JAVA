package com.stackroute;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListStringUpperCase {

    public List<String> toUpperCase(List<String> list) {
       Stream<String>stream = list.stream().map(String::toUpperCase);
        List<String>stringList = stream.collect(Collectors.toList());
        ArrayList<String>arrayList = new ArrayList<String>(stringList);
        return arrayList;
    }

}
