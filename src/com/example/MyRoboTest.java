package com.example;

import com.example.myroboproject.MainActivity;
import com.example.myroboproject.R;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

	@RunWith(RobolectricTestRunner.class)

	public class MyRoboTest {
	    public static void main(String[] args) {  
	    	JUnitCore.main(MyRoboTest.class.getName());
	    }   
	    @Test
	    public void shouldHaveHappySmiles() throws Exception {
	     
	    	MainActivity act = new MainActivity();
	        assertTrue(act.add(0, 1)==1);
	    }
	}


