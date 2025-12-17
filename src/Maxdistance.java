import java.io.*;
import java.util.*;

public class Maxdistance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        int[][] coords = new int[n][2];
        int maxDist = 0;

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                coords[j][i] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int distance = (int) (Math.pow(coords[j][0] - coords[i][0], 2) + Math.pow(coords[j][1] - coords[i][1], 2));
                if (distance > maxDist) {
                    maxDist = distance;
                }
            }
        }
        
        pw.println(maxDist);
        pw.close();
    }
}
