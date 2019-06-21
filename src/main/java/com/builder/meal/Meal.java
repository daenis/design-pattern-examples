package com.builder.meal;

import com.builder.meal.burger.Burger;
import com.builder.meal.drink.Drink;
import com.builder.meal.side.Side;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Drink> drinks = new ArrayList<>();
    private List<Burger> burgers = new ArrayList<>();
    private List<Side> sides = new ArrayList<>();

    public static Meal createMeal() {
        return new Meal();
    }

    public Meal addDrink(Drink drink) {
        drinks.add(drink);
        return this;
    }

    public Meal addBurger(Burger burger) {
        burgers.add(burger);
        return this;
    }

    public Meal addSide(Side side) {
        sides.add(side);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Meal:\n");
        drinks.forEach(drink -> sb.append(drink.getClass().getSimpleName()).append('\n'));
        burgers.forEach(burger -> sb.append(burger.getClass().getSimpleName()).append('\n'));
        sides.forEach(side -> sb.append(side.getClass().getSimpleName()).append('\n'));
        return sb.toString();
    }

}
