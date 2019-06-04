package com.abstractfactory.clothing;

import com.abstractfactory.clothing.shirt.NikeShirt;
import com.abstractfactory.clothing.shirt.Shirt;
import com.abstractfactory.clothing.shorts.NikeShorts;
import com.abstractfactory.clothing.shorts.Shorts;

public class NikeClothingFactory implements ClothingFactory {

    @Override
    public Shirt createShirt() {
        return new NikeShirt();
    }

    @Override
    public Shorts createShorts() {
        return new NikeShorts();
    }

}
