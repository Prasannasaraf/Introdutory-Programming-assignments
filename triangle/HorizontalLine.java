import java.util.Scanner;

public class HorizontalLine {
    public static void  main(String[] s){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0 ; i < n ; i++){
            System.out.print("*");
        }
    }
}
