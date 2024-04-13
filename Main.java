//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //14.Полезное упражнение: напишите программу, которая считает дискриминант квадратного уравнения
        //вот наше квадратное уравнение ax*x+bx+c=0, D=b*b-4ac
        int a = 2;
        int b = 4;
        int c = 2;
        double D = (Math.pow(b, 2)) - (4*a*c);
        System.out.println("14. " + D);

    }
}