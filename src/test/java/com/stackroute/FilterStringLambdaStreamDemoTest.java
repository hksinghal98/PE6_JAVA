package com.stackroute;


import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FilterStringLambdaStreamDemoTest {

    FilterStringLambdaStreamDemo FSL;

    @After
    public void teardown(){
        FilterStringLambdaStreamDemo FSL = null;
    }

    @Test
    public void FilterStringLambdaStreamDemo_FilteredList_AssertEquals(){
        FilterStringLambdaStreamDemo FSL = new FilterStringLambdaStreamDemo();
        List<String> Inputlist = new ArrayList<>();
        Inputlist.add("asjdj");
        Inputlist.add("asd");
        Inputlist.add("ssc");
        List<String> Outputlist = new ArrayList<>();
        Outputlist.add("asd");
        Assert.assertEquals(Outputlist,FSL.search(Inputlist));
    }

}
