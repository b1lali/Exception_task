package Excep;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        System.out.println("1. Паралелепипедтин тин колому жана аянты");
        System.out.println("2. Cylinder дин колому жана аянты");
        while(true){
            int nnn=scanner1.nextInt();
            switch (nnn){
                case 1:
                    try {
                        Scanner scanner = new Scanner(System.in);
                        int length = scanner.nextInt();
                        int height = scanner.nextInt();
                        int width = scanner.nextInt();
                        if (length <0) {
                            throw new RuntimeException();
                        }
                        System.out.println("Паралелепипедтин аянты ");
                        System.out.println(Parallelepiped.area(height, length, width));
                        System.out.println("Паралелепипедтин колому ");
                        System.out.println(Parallelepiped.volume(length, width, height));
                    }catch (RuntimeException e){
                        System.out.println("туура эмес!!! ");
                        break;
                    } case 2:
                    if(nnn==2){
                        try {
                            System.out.println("Цилиндирдин узундугун бер");
                            int height1= scanner1.nextInt();
                            System.out.println("Радиусдун узундугун бер ");
                            int radius1=scanner1.nextInt();

                            if(height1<0){
                                throw new RuntimeException();
                            }
                            Cylinder cylinder=new Cylinder();
                            System.out.println("Цилиндирдин аянты ");
                            cylinder.areaCylinder( radius1, height1);
                            System.out.println("Цилиндирдин колому");
                            cylinder.volumeCylinder(radius1, height1);
                        }catch (RuntimeException ex){
                            System.out.println("Туурасын жаз ");
                        }
                    }
            }}}}



