package cse360assign2;


public class Calculator {
	
	private int total;
	public static String history = "0 ";
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	// returns the value of total
	// @return  the value of total 
	public int getTotal () {
		return total;
		
	}
	// @param value - value added to total
	// adds value to the total
	public void add (int value) {
		 total += value;
			history +=  " +  " + value; 

	}
	// @param value - value subtracted to total
	// subtracts value to the total
	public void subtract (int value) {
		total -= value;
		history +=  " - " + value ; 
	}
	// @param value - value multiplied by total
		// multiplies value to the total
	public void multiply (int value) {
		total = value*total;
		history +=  " * " + value; 
	}
	// @param value - value which total is divided
			// multiplies value to the total
	public void divide (int value) {
		if(value != 0)
			total = total / value;
		history += "/" + value;	
	}
	// @return the history of changes to total
	// returns all changes to total
	public String getHistory () {
		return history;
	}
	


}