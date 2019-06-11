package com.abstractfactory;

import com.abstractfactory.clothing.Brand;
import com.abstractfactory.clothing.ClothingFactory;
import com.abstractfactory.clothing.HurleyClothingFactory;
import com.abstractfactory.clothing.NikeClothingFactory;
import com.abstractfactory.clothing.shirt.Shirt;
import com.abstractfactory.clothing.shorts.Shorts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please type either Nike or Hurley: ");
        String brand = in.nextLine();

        ClothingFactory clothingFactory = getClothingFactoryByName(brand);

        Shirt shirt = clothingFactory.createShirt();
        Shorts shorts = clothingFactory.createShorts();

        System.out.println("Instance type of shirt: " + shirt.getClass().getSimpleName());
        System.out.println("Instance type of shorts: " + shorts.getClass().getSimpleName());
    }

    private static ClothingFactory getClothingFactoryByName(String brandName) {
        if (Brand.NIKE.getName().equalsIgnoreCase(brandName)) {
            return new NikeClothingFactory();
        }

        if (Brand.HURLEY.getName().equalsIgnoreCase(brandName)) {
            return new HurleyClothingFactory();
        }

        throw new RuntimeException("There is no factory for ".concat(brandName).concat(" clothing!"));
    }

}
