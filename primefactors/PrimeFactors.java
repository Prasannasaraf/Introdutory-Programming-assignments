import java.util.ArrayList;

public class PrimeFactors {
    public  ArrayList<Integer> generate(int number){
        ArrayList<Integer> myList = new ArrayList<>();
        int top = number;
        for (int i = 2; i < top+1; i++) {
            if (top%i == 0){
                myList.add(i);
                while(top%i == 0){
                    top = top/i;
                }
            }
        }
        return myList;
    }
}