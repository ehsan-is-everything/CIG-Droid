package com.example.lab.testak_textinput;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MainRunner {

	public static void main(String[] args){
		System.out.println("Starting up Robolectric!");
		JUnitCore junit = new JUnitCore();
		Result result = junit.run(DummyMain.class);
		int resultInt = result.getFailureCount();
		if (0!=resultInt){
			System.out.println("Failed run! There were: "+resultInt+" failures!");

			for(Failure failure : result.getFailures()){
				System.out.println(failure.getMessage());
			}

			return;
		}
		System.out.println("Successful run!");


	}

}
