package com.abstractfactory;

import com.abstractfactory.clothing.ClothingFactory;
import com.abstractfactory.clothing.NikeClothingFactory;

public class Main {

    public static void main(String[] args) {
        ClothingFactory clothingFactory = new NikeClothingFactory();
    }

}
