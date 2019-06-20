package com.abstractfactory.clothing;

import com.abstractfactory.clothing.shirt.HurleyShirt;
import com.abstractfactory.clothing.shirt.Shirt;
import com.abstractfactory.clothing.shorts.HurleyShorts;
import com.abstractfactory.clothing.shorts.Shorts;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HurleyClothingFactoryTest {

    private HurleyClothingFactory hurleyClothingFactory;

    @BeforeEach
    void init() {
        hurleyClothingFactory = new HurleyClothingFactory();
    }

    @Test
    void testCreateShirt() {
        Shirt shirt = hurleyClothingFactory.createShirt();

        assertEquals(HurleyShirt.class, shirt.getClass(), "There was an error returning the shirt.");
    }

    @Test
    void testCreateShorts() {
        Shorts shorts = hurleyClothingFactory.createShorts();

        assertEquals(HurleyShorts.class, shorts.getClass(), "There was an error returning the shorts.");
    }

}
