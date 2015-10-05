package com.example.testcompany.myapplication;

import android.app.Application;
import android.test.ApplicationTestCase;

import junit.framework.Assert;

import org.junit.Test;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {

        super(Application.class);
    }

    @Test
    public void testOner(){
        Assert.assertEquals(2 + 3, 5);
    }

    @Test
    public void testOner2() {
        Assert.assertEquals(2 + 4, 6);
    }

    public void testOner3() {
        Assert.assertEquals(2 + 5, 7);
    }
}