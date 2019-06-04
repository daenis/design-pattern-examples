package com.abstractfactory.clothing;

import com.abstractfactory.clothing.shirt.Shirt;
import com.abstractfactory.clothing.shorts.Shorts;

public interface ClothingFactory {

    Shirt createShirt();
    Shorts createShorts();

}
