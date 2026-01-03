import java.io.*;
import java.util.*;

public class Livestocklineup {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n  = Integer.parseInt(st.nextToken());
        HashMap<String, String> map = new HashMap<>();
        map.put("Beatrice", "");
        map.put("Belinda", "");
        map.put("Bella", "");
        map.put("Bessie", "");
        map.put("Betsy", "");
        map.put("Blue", "");
        map.put("Buttercup", "");
        map.put("Sue", "");

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String tmp = st.nextToken();
            for (int j = 0; j < 4; j++) {
                st.nextToken();
            }
            map.put(tmp, st.nextToken());
        }

        LinkedHashSet<String> list = new LinkedHashSet<>();
        for (var key : map.keySet()) {
            if (!map.get(key).isEmpty()) {
                var tmp = map.get(key);
                list.remove(tmp);
                list.add(tmp);
                list.add(key);
                while (!map.get(tmp).isEmpty()) {
                    list.remove(map.get(tmp));
                    list.add(map.get(tmp));
                    tmp = map.get(tmp);
                }
            }
            else  {
                list.add(key);
            }
        }
        for (var x : list) {
            pw.println(x);
        }
        pw.close();
    }
}
