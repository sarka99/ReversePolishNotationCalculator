package com.sarka99.RPMCalculator;

import com.sarka99.RPMCalculator.model.Stack;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class RpmCalculatorApplication {

	public static void main(String[] args){
		SpringApplication.run(RpmCalculatorApplication.class, args);
		System.out.println("main program run");

	}

}
