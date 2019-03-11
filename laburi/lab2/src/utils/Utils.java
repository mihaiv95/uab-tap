package utils;

import java.lang.Math;

public class Utils {
    public Utils(){}
    public static void ec2(Double a, Double b, Double c){
        System.out.println(a.toString()+"x^2 "+b.toString()+"x "+c+" = 0\n");

        Double delta = b*b-4*a*c;

        if (delta < 0){
            Double r = Math.sqrt(-delta);
            System.out.println("here");
            System.out.println("x1= "+b.toString()+" + i*"+r.toString());
            System.out.println("x2= "+b.toString()+" - i*"+r.toString());



        }else if (delta == 0){
            Double x = -b / 2*a;
            System.out.println("x= "+ x.toString());
        }
        else{
            Double r = Math.sqrt(delta);
            Double x1 = (-b + r)/(2*a);
            Double x2 = (-b - r)/(2*a);
            System.out.println("Delta: " + delta.toString());
            System.out.println("x1= "+x1.toString());
            System.out.println("x1= "+x2.toString());
        }
    }
}
