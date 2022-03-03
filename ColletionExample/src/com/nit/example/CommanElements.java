package com.nit.example;

import java.util.ArrayList;
import java.util.HashSet;

public class CommanElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> one=new ArrayList<Integer>();
		
		ArrayList<Integer> two=new ArrayList<Integer>();
		
		one.add(1);
		one.add(2);
		one.add(3);
		one.add(4);
		one.add(5);
		
		two.add(6);
		two.add(7);
		two.add(1);
		two.add(2);
		two.add(3);
		
		
		HashSet  hs=new HashSet(one);
		
	//	HashSet  comman=new HashSet();
		
		two.retainAll(one);
		System.out.println(two);
	
		System.out.println("Comman elements "+hs);
		
		
		

	}

}
