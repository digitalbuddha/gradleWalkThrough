package com.example.gradledemo.app;

import android.test.ActivityInstrumentationTestCase2;


import com.jayway.android.robotium.solo.Solo;

import java.net.URL;

/**
 * Created by miken on 3/18/14.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2 {

    private Solo solo;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testMainActivity() throws Exception {
        solo.assertCurrentActivity("Main Activity Never Loaded", MainActivity.class);
    }

    public void testFail() throws Exception {
        assertEquals(((MainActivity)solo.getCurrentActivity()).getUrl(), null);
    }
}
