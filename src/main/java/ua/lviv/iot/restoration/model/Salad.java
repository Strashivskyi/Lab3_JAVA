package ua.lviv.iot.restoration.model;

import java.util.ArrayList;

public abstract class Salad extends AbstractDish {
	protected String saladDressing;

	public Salad(double priceInUAH, int massInGrams, String nameOfDish, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes,
			String saladDressing) {
		super(priceInUAH, massInGrams, nameOfDish, ingredients, specifications, condition, timeForCookingInMinutes);
		this.saladDressing = saladDressing;
	}

	public Salad(double priceInUAH) {
		super(priceInUAH);
	}
}
