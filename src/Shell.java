import java.io.*;
import java.util.*;

public class Shell {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("shell.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("shell.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[][] col = new int[n][3];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            col[i][0] = Integer.parseInt(st.nextToken());
            col[i][1] = Integer.parseInt(st.nextToken());
            col[i][2] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 3; i++) {
            int tmp = 0;
            int pos = i+1;

            for (int[] ints : col) {
                if (ints[0] == pos) {
                    pos = ints[1];
                } else if (ints[1] == pos) {
                    pos = ints[0];
                }

                if (pos == ints[2]) {
                    tmp++;
                }
                if (tmp > ans) {
                    ans = tmp;
                }
            }
        }

        pw.println(ans);
        pw.close();
    }
}
