package com.javacodegeeks.junit;

import java.util.Arrays;

public class FirstDayAtSchool {
	 public String[] prepareMyBag() {
	        String[] schoolbag = { "Books", "Notebooks", "Pens" };
	        String[] schoolbag2 = { "Books", "Notebooks", "Pens2" };
	        System.out.println("My1 school bag contains: "
	                + Arrays.toString(schoolbag));
	        return schoolbag;
	    }
	 
	    public String[] addPencils() {
	        String[] schoolbag = { "Books", "Notebooks", "Pens", "Pencils" };
	        System.out.println("Now my school bag contains: "
	                + Arrays.toString(schoolbag));
	        return schoolbag;
	    }
}
