package com.abstractfactory.clothing;

import com.abstractfactory.clothing.shirt.HurleyShirt;
import com.abstractfactory.clothing.shirt.Shirt;
import com.abstractfactory.clothing.shorts.HurleyShorts;
import com.abstractfactory.clothing.shorts.Shorts;

public class HurleyClothingFactory implements ClothingFactory {

    @Override
    public Shirt createShirt() {
        return new HurleyShirt();
    }

    @Override
    public Shorts createShorts() {
        return new HurleyShorts();
    }

}
