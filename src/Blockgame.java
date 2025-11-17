import java.io.*;
import java.util.*;

public class Blockgame {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static StringTokenizer st;
    public static int n = 0;

    static {
        try {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String[][] words = new String[n][2];
    public static ArrayList<String> valid = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            words[i][0] = st.nextToken();
            words[i][1] = st.nextToken();
        }

        combinations(0);

        System.out.println(valid);

        for (int i = 0; i < Math.pow(2, n); i++) {

        }

    }

    public static void combinations(int num) {
        for (int i = 0; i < 2; i++) {
            if (num < n) {
                num++;
                combinations(num);
            } else {
                valid.add(words[num][i]);
            }
        }
    }
}
