package JavaHomeWorke1;
import java.util.Scanner;
public class triangularNumber {
    //Написать программу вычисления n-ого треугольного числа
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = GetNumber("Введите целое число");
        int res = TriangularNumber(n);
        System.out.print(res);
        
    }
    
    //1.Ввод с консоли n-ого значения.
    public static int GetNumber(String text){
        System.out.print(text);
        return input.nextInt();
    }

    //2.Нахождение n-ого числа.
    public static int TriangularNumber(int number){
        int triangularN = (number*(number+1))/2;
        return triangularN;
    }

}
