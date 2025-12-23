import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Distinctnumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(st.nextToken());
            if (!list.contains(k)) {
                list.add(k);
            }
        }

        pw.println(list.size());
        pw.close();
    }
}
