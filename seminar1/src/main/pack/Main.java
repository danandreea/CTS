package main.pack;

import classes.pack.Zoo;
import classes.pack.Zookeeper;

public class Main {

	 public static void main(String[] args) 
	    { 
	        Zookeeper keeper=new Zookeeper("Dani");
	        Zoo zoo=new Zoo();
	        zoo.setZookeeper(keeper);
	        
	        
	      
	    } 
}
