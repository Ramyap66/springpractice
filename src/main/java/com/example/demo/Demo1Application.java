package com.example.demo;
import java.io.*;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);

       String nstr="";
        char ch;

      Scanner scanner = new Scanner(System.in);
	   System.out.print("Enter String :");
	    String strr = scanner.nextLine();
      
      for (int i=0; i<strr.length(); i++)
      {
        ch= strr.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed String: "+ nstr); 
		    
		    }
	}


