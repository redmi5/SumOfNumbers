import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        System.out.println("Enter number for calculate: ");
        Scanner in =new Scanner(System.in);
        Integer number=in.nextInt();
       System.out.print(Numbers.sum(number));
    }
}
