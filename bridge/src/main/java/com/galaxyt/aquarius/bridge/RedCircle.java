package com.galaxyt.aquarius.bridge;


public class RedCircle implements DrawAPI {


    public void drawCircle(int radius, int x, int y) {
        System.out.println("红色的圆, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
