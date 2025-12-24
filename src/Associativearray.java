import java.util.*;
import java.io.*;

public class Associativearray {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Long, Long> map = new HashMap<>();
        long n = Long.parseLong(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            long j = Long.parseLong(st.nextToken());
            if (j == 0) {
                map.put(Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken()));
            }
            if (j == 1) {
                long k = Long.parseLong(st.nextToken());
                if (map.get(k) == null) {
                    pw.println(0);
                }
                else pw.println(map.get(k));
            }
        }
        pw.close();
    }
}
