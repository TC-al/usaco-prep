import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] road = new int[n][2];
            int[][] bessie = new int[m][2];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                road[i][0] = Integer.parseInt(st.nextToken());
                road[i][1] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                bessie[i][0] = Integer.parseInt(st.nextToken());
                bessie[i][1] = Integer.parseInt(st.nextToken());
            }

            int tmp = 0;
            int tmpLimit = 0;
            int currLimit = road[tmpLimit][1];
            int speed = bessie[tmp][1];
            int largest = 0;

            for (int i = 0; i < 100; i++) {
                if (bessie[tmp][0] == i) {
                    tmp++;
                    bessie[tmp][0] += i;
                    speed = bessie[tmp][1];
                }
                if (road[tmpLimit][0] == i) {
                    tmpLimit++;
                    road[tmpLimit][0] += i;
                    currLimit = road[tmpLimit][1];
                }

                if (speed > currLimit) {
                    largest = speed - currLimit;
                }
            }
            pw.println(largest);
            pw.close();
    }
}