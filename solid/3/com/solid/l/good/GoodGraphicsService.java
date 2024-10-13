package com.solid.l.good;

import com.solid.l.bad.BadSquare;

public class GoodGraphicsService {
    public void checkForArea(Shape shape) {
        int area = shape.getArea();
        if (shape instanceof GoodRectangle) {
            System.out.printf("The area of the RECTANGLE is %d\n", area);
        } else if (shape instanceof GoodSquare){
            System.out.printf("The area of the SQUARE is %d\n", area);
        } else {
            System.out.println("This is not a shape!!");
        }
    }
}
