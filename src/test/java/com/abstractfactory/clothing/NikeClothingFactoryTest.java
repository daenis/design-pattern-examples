package com.abstractfactory.clothing;

import com.abstractfactory.clothing.shirt.NikeShirt;
import com.abstractfactory.clothing.shirt.Shirt;
import com.abstractfactory.clothing.shorts.NikeShorts;
import com.abstractfactory.clothing.shorts.Shorts;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NikeClothingFactoryTest {

    private NikeClothingFactory nikeClothingFactory;

    @BeforeEach
    void init() {
        nikeClothingFactory = new NikeClothingFactory();
    }

    @Test
    void testCreateShirt() {
        Shirt shirt = nikeClothingFactory.createShirt();

        assertEquals(NikeShirt.class, shirt.getClass(), "There was an error returning the shirt.");
    }

    @Test
    void testCreateShorts() {
        Shorts shorts = nikeClothingFactory.createShorts();

        assertEquals(NikeShorts.class, shorts.getClass(), "There was an error returning the shorts.");
    }

}
