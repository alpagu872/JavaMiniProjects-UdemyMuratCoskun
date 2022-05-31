package Sol1_103_GeoShapeAreaCalc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Triangle triangle = new Triangle("Triangle",3,4, 5);
//        triangle.areaCalc();
//
//        Square square = new Square("Square" , 5);
//        square.areaCalc();
//
//        Circle circle = new Circle("Circle" , 5);
//        circle.areaCalc();

        Scanner scanner = new Scanner(System.in);

        boolean cond = true;
        while (cond){
            String calcOp = "1 - Square \n" +
                    "2 - Circle\n" +
                    "3 - Triangle\n" +
                    "4 - Exit.";
            System.out.println(calcOp);
            int choose = scanner.nextInt();
            if (choose == 1){
                System.out.print("Edge: ");
                int r = scanner.nextInt();
                Square square = new Square("Square",r);
                square.areaCalc();
            }
            else if (choose == 2){
                System.out.print("Radius: ");
                int r = scanner.nextInt();
                Circle circle = new Circle("Circle",r);
                circle.areaCalc();

            }else if (choose == 3){
                System.out.print("A,B,C: ");
                int a,b,c;
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                Triangle triangle = new Triangle("Triangle",a,b,c);
                triangle.areaCalc();

            }else if (choose == 4){
                System.out.println("Closing program.");
                cond = false;
                break;
            }
            else {
                System.out.println("Provide input!");

            }

        }

    }
}
