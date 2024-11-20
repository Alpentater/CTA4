package main;

//Importing the ability for user input and the ability to use lists.
import java.util.Scanner;
import java.util.ArrayList;

public class WeeklyTemperatures {
	public static void main (String[] args) {
		
		//Defining some variables to be used later, as well as our two lists, one for temperatures and one for days of week.
		float totalOfTemps = 0f; //Will be a total of weekly temperatures.
		float weeklyAverage = 0f; //Will be the calculated average of the weekly temperatures when needed.
		ArrayList<String> days = new ArrayList<>();
		ArrayList<Float> temperatures = new ArrayList<>();
		
		//Adding days of the week as strings to the "days" list.
		days.add("monday"); //index 0
		days.add("tuesday"); //index 1
		days.add("wednesday"); //index 2
		days.add("thursday"); //index 3
		days.add("friday"); //index 4
		days.add("saturday"); //index 5
		days.add("sunday"); //index 6
		
		//Adding some temperatures to the "temperatures" list!
		temperatures.add(73.5f); //index 0
		temperatures.add(76f); //index 1
		temperatures.add(74.25f); //index 2
		temperatures.add(70f); //index 3
		temperatures.add(69f); //index 4
		temperatures.add(68.3f); //index 5
		temperatures.add(62.05f); //index 6
		
		//Asking the user for input.
		Scanner scanny = new Scanner(System.in);
		System.out.println("What day of the week would you like to get temperatures for?");
		System.out.println("(If you want temperatures for all days of the week, type 'week')");
		String userInput = scanny.nextLine();
		
		if(days.contains(userInput)) {
			int dayToPrint = days.indexOf(userInput);
			System.out.println("The temperature for " + days.get(dayToPrint) + " is: " + temperatures.get(dayToPrint) + "°F");
		} else if(userInput.equalsIgnoreCase("week")) {
			
			//A for loop that will go through each day and temperature list and print them.
			for(int i = 0; i < days.size(); i++) {
				System.out.println("Temperature for " + days.get(i) + " is: " + temperatures.get(i) + "°F");
				totalOfTemps += temperatures.get(i);
			}
			
			//Printing a blank line for spacing and readability... idk I just like it.
			System.out.println();
			
			//After displaying every day of the week and adding each temperature up, calculate and print the average.
			weeklyAverage = totalOfTemps/days.size();
			System.out.println("The weekly average temperature is: " + weeklyAverage + "°F");
		} else {
			//Self explanatory fallback for invalid inputs.
			System.out.println("No valid input was detected. Oops!");
		}
	}
}
