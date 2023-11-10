import java.util.Scanner;

class Divide{
    public double division(double num1, double num2){
        return num1/num2;

    }
}
public class Div{
    public static void main(String[] args) {
        Scanner div=new Scanner(System.in);
        System.out.println("Enter num1: ");
        double num1=div.nextDouble();
        System.out.println("Enter num2: ");
        double num2=div.nextDouble();
        Divide tell= new Divide();
       double outcome= tell.division(num1, num2);
       System.out.println(outcome);

       div.close(); 
    }
}