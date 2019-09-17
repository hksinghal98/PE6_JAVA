package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TransformStringLambdaStreamDemoTest {
    TransformStringLambdaStreamDemo TSL;

    @After
    public void teardown(){
        TransformStringLambdaStreamDemo TSL = null;
    }

    @Test
    public void TransformStringLambdaStreamDemo_String_AssertEquals(){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        TransformStringLambdaStreamDemo TSL = new TransformStringLambdaStreamDemo();
        Assert.assertEquals("o5,e4",TSL.getString(list));
    }

    @Test
    public void TransformStringLambdaStreamDemo_String_AssertNull(){
        List<Integer> list = new ArrayList<>();
        TransformStringLambdaStreamDemo TSL = new TransformStringLambdaStreamDemo();
        Assert.assertEquals(null,TSL.getString(list));
    }
}
