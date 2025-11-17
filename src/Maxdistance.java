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
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            coords[i][0] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            coords[i][1] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < n - 1; i++) {
            int distance = (int) Math.sqrt(Math.pow(coords[i+1][0] - coords[i][0], 2) + Math.pow(coords[i+1][1] - coords[i][1], 2));
            if (distance > maxDist) {
                maxDist = distance;
            }
        }
        
        pw.println(maxDist);
        pw.close();
    }
}
