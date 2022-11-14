package com.lambdaStream;

interface Drawable {
    public void draw();
}

//without using lamabda function
public class DemoEx1 {
    public static void main(String[] args) {
        int width = 10;
//    Drawable d1 = new Drawable() {
//        @Override
//        public void draw() {
//            System.out.println("Drawing" +width);
//        }
//    };
        //using lamabda function
        Drawable d1 = () -> {
            System.out.println("with lamabda function drawing" + width);
        };


        d1.draw();
    }
}
