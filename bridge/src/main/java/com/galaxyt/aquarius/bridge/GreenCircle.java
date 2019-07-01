package com.galaxyt.aquarius.bridge;

public class GreenCircle implements DrawAPI {

    public void drawCircle(int radius, int x, int y) {
        System.out.println("绿色的圆形, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}