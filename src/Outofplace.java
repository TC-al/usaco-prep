import java.io.*;
import java.util.*;

public class Outofplace {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("outofplace.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("outofplace.out")));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        ArrayList<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!(sorted.get(i).equals(arr.get(i)))) {
                count++;
            }
        }

        pw.println(count - 1);
        pw.close();
    }
}
