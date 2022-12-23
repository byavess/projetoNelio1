import java.util.Scanner;

public class TryCath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split("");
        int position = sc.nextInt();
            System.out.println(vect[position]);

        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Invalid position!");
        }
        System.out.println("End of programa");
        sc.close();
    }
}
