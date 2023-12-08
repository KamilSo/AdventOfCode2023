import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("Input.txt");
        BufferedReader myreader = new BufferedReader(new InputStreamReader(inputStream));
        String line = myreader.readLine();
        while (line != null) {
            ArrayList<Integer> lastDigit = new ArrayList<>();
            ArrayList<Integer> firstDigit = new ArrayList<>();
            for (int i = 0; i <= 9; i++) {
                lastDigit.add(line.lastIndexOf(Integer.toString(i)));
                firstDigit.add(line.indexOf(Integer.toString(i)));
            }
            int index1 = Collections.min(firstDigit);
            int index2 = Collections.max(lastDigit);
            sum += Integer.parseInt(Integer.toString(index1) + index2);
        }
        System.out.println(sum);
    }
}