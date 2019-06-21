package com.builder;

import com.builder.meal.Meal;
import com.builder.meal.burger.AngusBurger;
import com.builder.meal.burger.Burger;
import com.builder.meal.drink.Drink;
import com.builder.meal.drink.Water;
import com.builder.meal.side.Fries;
import com.builder.meal.side.Side;

public class Main {

    public static void main(String[] args) {
        Drink drink = new Water();
        Burger burger = new AngusBurger();
        Side side = new Fries();

        Meal meal = Meal
                .createMeal()
                .addDrink(drink)
                .addBurger(burger)
                .addSide(side);

        System.out.println(meal);
    }

}
