import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0 ; i < n ; i++){
            for (int j = i; j < n  ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1 ; i < n ; i++){
            for (int j = 0; j < i + 1  ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*(n-i-1))+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
