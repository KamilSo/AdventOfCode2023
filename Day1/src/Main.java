import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        BufferedReader myreader = new BufferedReader(new FileReader("Input.txt"));
        while (myreader.readLine() != null) {
            ArrayList<Integer> lastDigit = new ArrayList<>();
            ArrayList<Integer> firstDigit = new ArrayList<>();
            for (int i = 0; i <= 9; i++) {
                lastDigit.add(myreader.readLine().lastIndexOf(Integer.toString(i)));
                firstDigit.add(myreader.readLine().indexOf(Integer.toString(i)));
            }
            int index1 = Collections.min(firstDigit);
            int index2 = Collections.max(lastDigit);
            sum += Integer.parseInt(Integer.toString(index1) + Integer.toString(index2));
        }
        System.out.println(sum);
    }
}