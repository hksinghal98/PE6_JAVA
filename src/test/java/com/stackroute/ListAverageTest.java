package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListAverageTest {
    ListAverage LA;

    @After
    public void teardown(){
        ListAverage LA = null;
    }

    @Test
    public void ListAverage_findAverage_AssertEquals(){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        ListAverage LA = new ListAverage(list);
        Assert.assertEquals((Double) 17.5,LA.findAverage());
    }
    @Test
    public void ListAverage_findAverage_AssertNotEquals(){
        List<Integer> list = new ArrayList<>();
        ListAverage LA = new ListAverage(list);
        Assert.assertNotEquals((Double) 17.5,LA.findAverage());
    }
}
