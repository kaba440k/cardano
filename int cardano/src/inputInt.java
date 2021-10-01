import java.util.ArrayList;
import java.util.Scanner;

class inputInt {
    public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    System.out.println("Введите 5 вашиx чисел, если у вас квадратное уравнение, пятое ваше число должно быть равно 0: ");
    Double a = k.nextDouble();
    Double b = k.nextDouble();
    Double c = k.nextDouble();
    Double d = k.nextDouble();
    Double e = k.nextDouble();
    ArrayList<Double> numbr = new ArrayList<Double>();
    numbr.add(a);
    numbr.add(b);
    numbr.add(c);
    numbr.add(d);
    numbr.add(e);
    Double denominator = 2*a;
        if (d ==1 && !numbr.contains(e) ){
            if (a != 0.0 & b !=0.0 & c !=0.0 ){

                Double discriminant = b*b - 4*a*c;

                if (discriminant > 0 ){
                    Double numerator1 = (-1*b+ Math.sqrt(discriminant));
                    Double numerator2 = (-1*b- Math.sqrt(discriminant));
                    Double x1 = numerator1 / denominator;
                    Double x2 = numerator2 / denominator;
                    System.out.println(x1);
                    System.out.println(x2);
                }
                else if (discriminant == 0 ){
                    Double numerator3 = (-1*b);
                    Double x3 = numerator3 / denominator;
                    System.out.println(x3);
                }
                else if (discriminant < 0){
                    System.out.println("Корней нет");
                }
            }
        }

//        if(e==1){
//
//        }
    }
}