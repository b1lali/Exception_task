package Excep;

import static java.lang.Math.PI;

public class Cylinder {
    public  void areaCylinder( int radius1, int height1) {
        System.out.println(2 * PI * radius1 * (height1 + radius1));

    }

    public void volumeCylinder(int radius1, int height1){
        System.out.println((PI*radius1*radius1*height1));
    }

}

