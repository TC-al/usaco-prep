import java.io.*;
import java.util.*;

public class Madscientist {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("breedflip.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("breedflip.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String idk = br.readLine();
        String ans = br.readLine();

        boolean prev = false;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (idk.charAt(i) != ans.charAt(i)) {
                if (i > 0) {
                    if (!prev) {
                        count++;
                    }
                    prev = true;
                }
                else {
                    count++;
                }
            }
            else {
                prev = false;
            }
        }
        pw.println(count);
        pw.close();
    }
}
