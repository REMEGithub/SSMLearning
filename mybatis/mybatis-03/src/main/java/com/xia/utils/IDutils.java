package com.xia.utils;

import org.junit.Test;

import java.util.UUID;

public class IDutils {
    public static String getId(){
        return UUID.randomUUID().toString().replace("-","");
    }
    @Test
    public void Test(){
        System.out.println(getId());
    }

}
