package main.pack;

import classes.pack.Giraffe;
import classes.pack.Zebra;
import classes.pack.Zoo;
import classes.pack.Zookeeper;

public class Main {

	 public static void main(String[] args) 
	    { 
	        Zookeeper keeper=new Zookeeper("Dani");
	        Zoo zoo=new Zoo();
	        zoo.setZookeeper(keeper);
	        
	        Giraffe giraffe=new Giraffe("Girafa", 10);
	        Giraffe giraffe2=new Giraffe("Girafa2", 30,200);
	        
	        zoo.addAnimal(giraffe);
	        zoo.addAnimal(giraffe2);
	        
	        Zebra zebra=new Zebra("zebra", 20);
	        Zebra zebra2=new Zebra("zebra2", 30, 100);
	      
	        
	        zoo.addAnimal(zebra);
	        zoo.addAnimal(zebra2);
	        
	        zoo.feedAllAnimals();
	    } 
}
