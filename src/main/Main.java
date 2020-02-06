package main;
import java.io.FileNotFoundException;

import controller.Controller;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		Controller controler = new Controller();
		controler.run();
	}
}
