package com.dileep;

import java.util.Scanner;

import static java.lang.Math.*;


public class Geometry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1.Area\n" + "2.Volume\n" +"3.perimeter\n"+ "Enter Your Choice : ");
        int c = in.nextInt();
        switch(c){
            case 1 -> Area();
            case 2 -> Volume();
            case 3 -> Perimeter();
            default -> System.out.print("Enter valid input");
        }
    }

    private static void Perimeter() {
        Scanner in = new Scanner(System.in);
        System.out.print("1.Perimeter Of Circle\n" +
                "2.Perimeter Of Equilateral Triangle\n" +
                "3.Perimeter Of Parallelogram\n" +
                "4.Perimeter Of Rectangle\n" +
                "5.Perimeter Of Square\n" +
                "6.Perimeter Of Rhombus\n"+
                "Enter Your choice : ");
        int z = in.nextInt();
        switch(z) {
            case 1 -> PerimeterOfCircle();
            case 2 -> PerimeterOfEquilateralTraingle();
            case 3 -> PerimeterOfParellelogram();
            case 4 -> PerimeterOfRectangle();
            case 5 -> PerimeterOfSquare();
            case 6 -> PerimeterOfRhombus();
            default -> System.out.println("Enter Valid Choice");
        }

    }

    private static void PerimeterOfRhombus() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter Side :");
        float s = in.nextFloat();
        System.out.println("Perimeter = " + 4*s);

    }

    private static void PerimeterOfRectangle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length : ");
        float l = in.nextFloat();
        System.out.print("Enter width : ");
        float b = in.nextFloat();
        System.out.print("perimeter = " + 2*(l+b));
        
    }

    private static void PerimeterOfSquare() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter Side :");
        float s = in.nextFloat();
        System.out.println("Perimeter = " + 4*s);
    }

    private static void PerimeterOfParellelogram() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side1 : ");
        float a = in.nextFloat();
        System.out.print("Enter side2 : ");
        float b = in.nextFloat();
        System.out.print("perimeter = " + 2*(a+b));
    }

    private static void PerimeterOfEquilateralTraingle() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter side :");
        float s = in.nextFloat();
        System.out.println("Perimeter = " + 3*s);

    }

    private static void PerimeterOfCircle() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter radius :");
        float r = in.nextFloat();
        System.out.println("Perimeter = " + 2*3.14*r);
    }

    private static void Volume() {
        Scanner in = new Scanner(System.in);
        System.out.print("\n1.Volume Of Cone Java Program\n" +
                "2.Volume Of Prism\n" +
                "3.Volume Of Cylinder\n" +
                "4.Volume Of Sphere\n" +
                "5.Volume Of Pyramid\n" +
                "Enter your choice : ");
        int y = in.nextInt();
        switch(y) {
            case 1 -> VolumeOfCone();
            case 2 -> VolumeOfPrism();
            case 3 -> VolumeOfCylinder();
            case 4 -> VolumeOfSphere();
            case 5 -> VolumeOfPyramid();
            default -> System.out.println("Enter Valid Choice");
        }
    }

    private static void VolumeOfPyramid() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base area : ");
        float a = in.nextFloat();
        System.out.print("Enter height : ");
        float h = in.nextFloat();
        System.out.print("Volume = " + a*h);
    }

    private static void VolumeOfSphere() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius : ");
        float r = in.nextFloat();
        System.out.print("Volume = " + (4*3.14*r*r*r)/3);

    }

    private static void VolumeOfCylinder() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius : ");
        float r = in.nextFloat();
        System.out.print("Enter height : ");
        float h = in.nextFloat();
        System.out.print("Volume = " + (3.14*r*r*h));
        
    }

    private static void VolumeOfPrism() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base area : ");
        float a = in.nextFloat();
        System.out.print("Enter height : ");
        float h = in.nextFloat();
        System.out.print("Volume = " + a*h);
    }

    private static void VolumeOfCone() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius : ");
        float r = in.nextFloat();
        System.out.print("Enter height : ");
        float h = in.nextFloat();
        System.out.print("Volume = " + (3.14*r*r*h)/3);

        
    }

    private static void Area() {
        Scanner in = new Scanner(System.in);
        System.out.print("\n1.Area Of Circle\n" +
                "2.Area Of Triangle\n" +
                "3.Area Of Rectangle Program\n" +
                "4.Area Of Isosceles Triangle\n" +
                "5.Area Of Parallelogram\n" +
                "6.Area Of Rhombus\n" +
                "7.Area Of Equilateral Triangle\n" +
                "Enter your Choice : ");
        int x = in.nextInt();
        switch(x) {
            case 1 -> AreaOfCircle();
            case 2 -> AreaOfTriangle();
            case 3 -> AreaOfRectangle();
            case 4 -> AreaOfIsoscelesTriangle();
            case 5 -> AreaOfParallelogram();
            case 6 -> AreaOfRhombus();
            case 7 -> AreaOfEquilateralTriangle();
            default -> System.out.println("Enter Valid Choice");
        }

    }

    private static void AreaOfEquilateralTriangle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of side s : ");
        float s = in.nextFloat();
        System.out.print("Area = " + (sqrt(3)/4)*s);

    }

    private static void AreaOfRhombus() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter daignol1 : ");
        float d1 = in.nextFloat();
        System.out.print("Enter daignol2 : ");
        float d2 = in.nextFloat();
        System.out.print("Area = " + (0.5*d1*d2));


    }

    private static void AreaOfParallelogram() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base: ");
        float b = in.nextFloat();
        System.out.print("Enter height: ");
        float h = in.nextFloat();
        System.out.print("Area = " + (b*h));

    }

    private static void AreaOfIsoscelesTriangle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base: ");
        float b = in.nextFloat();
        System.out.print("Enter height: ");
        float h = in.nextFloat();
        System.out.print("Area = " + (0.5*b*h));
    }

    private static void AreaOfRectangle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length: ");
        float l = in.nextFloat();
        System.out.print("Enter bredth: ");
        float b = in.nextFloat();
        System.out.print("Area = " + (l*b));
    }

    private static void AreaOfTriangle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base: ");
        float b = in.nextFloat();
        System.out.print("Enter height: ");
        float h = in.nextFloat();
        System.out.print("Area = " + (0.5*b*h));
    }

    private static void AreaOfCircle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius : ");
        float r = in.nextFloat();
        System.out.print("Area = " + (3.14*r*r));
    }
}
