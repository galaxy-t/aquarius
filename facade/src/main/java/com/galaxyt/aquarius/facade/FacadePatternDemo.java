package com.galaxyt.aquarius.facade;

public class FacadePatternDemo {


    public static void main(String[] args) {
        ShapeFacade shapeMaker = new ShapeFacade();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
