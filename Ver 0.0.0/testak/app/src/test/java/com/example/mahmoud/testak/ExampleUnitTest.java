package com.example.mahmoud.testak;

import android.content.Context;
import android.os.Bundle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {
    @Mock
    Context mMockContext;
    @Test
    public void dummyMain() throws Exception {

        MainActivity ma = new MainActivity();
        ma.onCreate(Bundle.EMPTY);
        
    }
}