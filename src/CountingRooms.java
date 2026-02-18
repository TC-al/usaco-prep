import java.io.*;
import java.util.*;

public class CountingRooms {
    public static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] image = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String[] str = st.nextToken().split("");
            for (int j = 0; j < m; j++) {
                if (str[j].equals("#")) {
                    image[i][j] = 0;
                }
                else  {
                    image[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (image[i][j] == 1) {
                    count++;
                    dfs(image, i, j);
                }
            }
        }
        pw.println(count);
        pw.close();
    }

    public static void dfs(int[][] image, int x, int y) {
        if (x < 0 || y < 0 || x >= image.length || y >= image[0].length || image[x][y] == 0) {
            return;
        }
        image[x][y] = 0;

        dfs(image, x + 1, y);
        dfs(image, x - 1, y);
        dfs(image, x, y + 1);
        dfs(image, x, y - 1);
    }
}
