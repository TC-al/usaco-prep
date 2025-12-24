import java.io.*;
import java.util.*;

public class Whereami {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("whereami.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("whereami.out")));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (int i = 1; i <= n; i++) {
            Set<String> set = new HashSet<>();
            for (int j = 0; j <= n - i; j++) {
                set.add(str.substring(j,j + i));
                if (set.size() == n - i + 1) {
                    pw.println(i);
                    pw.close();
                    return;
                }
            }
        }

        pw.println(n);
        pw.close();
    }
}
