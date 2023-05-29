package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	private static int MAX_TRUCKS = 5;
	private FoodTruck[] fleet = new FoodTruck[MAX_TRUCKS];
	private int numTrucks = 0;

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();

	}

	public void run() {
		Scanner kb = new Scanner(System.in);
		boolean running = true;
		boolean subRunning = true;

		while (running) {

			System.out.println("please enter the name of the food truck or enter 'Quit' to leave: ");
			String foodTruckName = kb.next();
			if (foodTruckName.equals("Quit")) {
				while (subRunning) {
					System.out.println("please choose from the below menu");
					System.out.println("1. List all existing food trucks.");
					System.out.println("2. See the average rating of food trucks.");
					System.out.println("3. Display the highest-rated food truck.");
					System.out.println("4. Quit the program.");
					int userInput = kb.nextInt();
					System.out.println();
					if (userInput == 1) {
						System.out.println("Here is the current list of Trucks: ");
						for (FoodTruck numTrucks : fleet) {
							if (numTrucks != null) {

								System.out.println(numTrucks);
							}
						}
					} else if (userInput == 2) {
						System.out.println("The average rating for the food trucks is: ");
						double average = 0;
						int total = 0;
						for (FoodTruck numTrucks : fleet) {
							if (numTrucks != null) {
								average += numTrucks.getFoodTruckRating();
								total++;
							}
						}
						System.out.println(average / total);
					} else if (userInput == 3) {
						System.out.println("the Highest-Rated food truck is:");
						int highestRated = 0;
						int lowestRated = 0;
						for (FoodTruck numTrucks : fleet) {
							if (numTrucks != null) {
								highestRated = numTrucks.getFoodTruckRating();
								System.out.println(numTrucks);
								if (highestRated > lowestRated) {

								}
							}
						}
					} else if (userInput == 4) {
						System.out.println("Leaving the Menu options screen!");
						subRunning = false;
					}
				}

			}
			System.out.println("please enter the kind of food that was served: ");
			String foodType = kb.next();

			System.out.println("please enter the rating you would give this truck: ");
			int foodTruckRating = kb.nextInt();

			FoodTruck foodTruck = new FoodTruck(foodTruckName, foodType, foodTruckRating);
			fleet[numTrucks] = foodTruck;
			numTrucks++;
			if (numTrucks == MAX_TRUCKS) {
				for (FoodTruck numTrucks : fleet) {
					System.out.println(numTrucks);
				}
			}
		}
		kb.close();

	}

}
