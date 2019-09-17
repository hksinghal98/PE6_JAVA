package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListStringUpperCaseTest {
    ListStringUpperCase LSU;

    @After
    public void teardown(){
        ListStringUpperCase LSU = null;
    }

    @Test
    public void ListStringUpperCase_toUpperCase_AssertEquals(){
        List<String> Inputlist = new ArrayList<>();
        Inputlist.add("ram");
        Inputlist.add("Shyam");
        Inputlist.add("mahesh");
        List<String> Outputlist = new ArrayList<>();
        Outputlist.add("RAM");
        Outputlist.add("SHYAM");
        Outputlist.add("MAHESH");
        ListStringUpperCase LSU = new ListStringUpperCase();
        Assert.assertEquals(Outputlist,LSU.toUpperCase(Inputlist));
    }

    @Test
    public void ListStringUpperCase_toUpperCase_AssertNotEquals(){
        List<String> Inputlist = new ArrayList<>();
        Inputlist.add("ram");
        Inputlist.add("Shyam");
        Inputlist.add("mahesh");
        ListStringUpperCase LSU = new ListStringUpperCase();
        Assert.assertNotEquals(Inputlist,LSU.toUpperCase(Inputlist));
    }
}
