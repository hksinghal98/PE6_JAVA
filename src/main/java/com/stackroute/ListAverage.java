package com.stackroute;



import java.util.List;
import java.util.Optional;
import java.util.stream.*;

public class ListAverage {
    private List<Integer> list;
    public ListAverage(List<Integer> list){
        this.list = list;
    }

    public Double findAverage(){

        Stream<Integer> stream = this.list.stream();
        int count = (int)stream.count();
        if(this.list.stream().count() == 0) return 0.0;
        Optional<Integer> sum = this.list.stream().reduce((s1,s2) -> s1+s2);
        double avg = 0;
        if(sum.isPresent()){
            avg = sum.get()/(float)count;
        }
        Double AverageDouble = new Double(avg);

        return AverageDouble;
    }
}
