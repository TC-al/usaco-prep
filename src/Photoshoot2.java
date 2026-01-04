import java.util.*;
import java.io.*;

public class Photoshoot2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] moved = new int[n];

        int[] arr1 = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr1[i] = Integer.parseInt(st.nextToken()) - 1;

        int[] arr2 = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr2[i] = Integer.parseInt(st.nextToken()) - 1;

        int count = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j < n && moved[arr1[j]] == 1) {
                j++;
            }

            if (j < n && arr1[j] == arr2[i]) {
                j++;
            }
            else {
                count++;
                moved[arr2[i]] = 1;
            }
        }

        pw.println(count);
        pw.close();
    }
}
