package com.skilldistillery.foodtruck.entities;

import java.util.Objects;

public class FoodTruck {
	private static int currentNumberOfTrucks;
	private int id = 100;
	private String foodTruckName;
	private String foodType;
	private int foodTruckRating;

	public String getFoodTruckName() {
		return foodTruckName;
	}

	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getFoodTruckRating() {
		return foodTruckRating;
	}

	public void setFoodTruckRating(int foodTruckRating) {
		this.foodTruckRating = foodTruckRating;
	}

	public FoodTruck(String foodTruckName, String foodType, int foodTruckRating) {
		FoodTruck.currentNumberOfTrucks++;
		id = FoodTruck.currentNumberOfTrucks;
		this.foodTruckName = foodTruckName;
		this.foodType = foodType;
		this.foodTruckRating = foodTruckRating;

	}

	public String toString() {
		return "FoodTruck [id=" + id + ", foodTruckName=" + foodTruckName + ", foodType=" + foodType
				+ ", foodTruckRating=" + foodTruckRating + "]";
	}

	public void displayTruck() {
		String truckData = toString();
		System.out.println(truckData);
	}

	@Override
	public int hashCode() {
		return Objects.hash(foodTruckName, foodTruckRating, foodType, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodTruck other = (FoodTruck) obj;
		return Objects.equals(foodTruckName, other.foodTruckName) && foodTruckRating == other.foodTruckRating
				&& Objects.equals(foodType, other.foodType) && id == other.id;
	}

}
