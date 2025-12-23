import java.io.*;
import java.util.*;

public class Chessboardandqueens {
    public static int count = 0;
    public static String[][] ans = new String[8][8];
    public static boolean[] column = new boolean[8];
    public static boolean[] diag1 = new boolean[15];
    public static boolean[] diag2 = new boolean[15];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st;
        for (int i = 0; i < 8; i++) {
            st = new StringTokenizer(br.readLine());
            String[] temp = st.nextToken().split("");
            for (int j = 0; j < 8; j++) {
                ans[i][j] =  temp[j];
            }
        }
        search(0);

        pw.write(count + "");
        pw.close();
    }

    public static void search(int y) {
        if (y == 8) {
            count++;
            return;
        }
        for (int i = 0; i < 8; i++) {
            if (column[i] || diag1[i + y] || diag2[i-y+7] || ans[i][y].equals("*")) {
                continue;
            }
            column[i] = true;
            diag1[i+y] = true;
            diag2[i-y+7] = true;
            search(y+1);
            column[i] = false;
            diag1[i+y] = false;
            diag2[i-y+7] = false;
        }
    }
}
