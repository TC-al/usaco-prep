import java.util.*;
import java.io.*;

public class Appledivision {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] weights = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            weights[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(recursion(0, 0, 0, n, weights));
        pw.write(recursion(0, 0, 0, n, weights));
        pw.close();
    }

    public static int recursion(int i, int s1, int s2, int n, int[] weights) {
        if (n == i) return Math.abs(s1-s2);

        return Math.min(recursion(i+1, s1 + weights[i], s2, n, weights), recursion(i+1, s1, s2 + weights[i], n, weights));
    }
}
