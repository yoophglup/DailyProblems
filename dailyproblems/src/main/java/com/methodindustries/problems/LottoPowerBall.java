package com.methodindustries.problems;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoPowerBall {
    public static final int ns=5;
    public static final int maxns=69;
    public static final int maxspecialnumber=26;
    
    public static void generateTicket(){
    	
    	//You can use int inside the method instead of public static final int if desired
        //int ns=5;
        //int maxns=69;
        //int maxspecialnumber=26;
    	
        //Set ensures no repeat numbers, treeset ensures they are sorted
        Set<Integer> winningNumbers = new TreeSet<Integer>();
        Random r = new Random();
        while (winningNumbers.size() < ns) {
            int number = r.nextInt(maxns);
            winningNumbers.add(number);
        }
        int power_number = r.nextInt(maxspecialnumber);

        //not really needed 
        //Integer powerballnumber =power_number;

        for (Integer i : winningNumbers){
        	if (i.toString().length()==1) {
        		System.out.print(" ");
        	}
            System.out.print(i.toString()+" ");
        }

        System.out.println("SP "+power_number);
    }

    public static void main(String[] args) {
        //1-69
        //1-26
        //no repeat numbers
        //numbers should be random
        //numbers in sorted order
        //5 random numbers ticket numbers
        //6th random number between 1 and 26
    	
        for (int i=0;i<5;i++){
        	generateTicket();

        }


}}