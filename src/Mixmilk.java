import java.io.*;
import java.util.*;

public class Mixmilk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("mixmilk.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));

        int[][] arr = new int[3][2];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (arr[0][0] < arr[2][1] + arr[0][1]) {
                    int calc = arr[0][0] - arr[0][1];
                    arr[2][1] -= calc;
                    arr[0][1] += calc;
                }
                else {
                    arr[0][1] += arr[2][1];
                    arr[2][1] = 0;
                }
            }
            else if ((i+1) % 3 == 0) {
                if (arr[2][0] < arr[1][1] + arr[2][1]) {
                    int calc = arr[2][0] - arr[2][1];
                    arr[1][1] -= calc;
                    arr[2][1] += calc;
                }
                else {
                    arr[2][1] += arr[1][1];
                    arr[1][1] = 0;
                }
            }
            else {
                if (arr[1][0] < arr[0][1] + arr[1][1]) {
                    int calc = arr[1][0] - arr[1][1];
                    arr[0][1] -= calc;
                    arr[1][1] += calc;
                }
                else {
                    arr[1][1] += arr[0][1];
                    arr[0][1] = 0;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            pw.println(arr[i][1]);
        }
        pw.close();
    }
}
