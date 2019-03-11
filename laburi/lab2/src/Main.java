import java.util.Scanner;
import utils.Utils;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Double a,b,c;
        System.out.print("a= ");
        a = reader.nextDouble();

        System.out.print("b= ");

        b = reader.nextDouble();
        System.out.print("c= ");

        c = reader.nextDouble();
        Utils.ec2(a,b,c);


    }
}
