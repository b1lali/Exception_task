package Excep;

public class Parallelepiped {
    public static int area(int height, int length, int width) {
        return (2 * ((height * length) + (length * width) + (height * width)));
    }

    public static int volume(int length, int width, int height){
        return (length*width*height);
    }
}

