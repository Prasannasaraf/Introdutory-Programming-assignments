import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        PrimeFactors primeFactors = new PrimeFactors();
        ArrayList<Integer> mylist = primeFactors.generate(30);
        for(int i : mylist) {
            System.out.println(i);
        }
    }
}