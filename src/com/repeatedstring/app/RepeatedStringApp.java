package com.repeatedstring.app;

import java.util.HashMap;

public class RepeatedStringApp {

	public static void main(String[] args) {
		
		//you have to count all the strings in the string array and show how many repeated strings are per string
		String[] paises = {"Mexico","Unitated States", "Mexico", "United Kingdom", "Argentina" , "Argentina"};
		HashMap<String,Integer> hash = new HashMap<String,Integer>();
		
		
		for(String pais : paises) //for each pais in paises
		{
			if(hash.containsKey(pais)) //if our hashmap contains the pais key we have to sum +1
			{
				hash.put(pais, hash.get(pais)+1); 
			}
			else						//if there is no that key in our hash map, we put that key with value of 1 because theres only one string of that
			{
				hash.put(pais,1);
			}
		}
		
		System.out.println(hash.toString());

	}

}
