package com.abstractfactory.clothing;

public enum Brand {

    NIKE("Nike"),
    HURLEY("Hurley");

    private final String name;

    Brand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
