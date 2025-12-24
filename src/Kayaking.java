import java.util.*;
import java.io.*;

public class Kayaking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()) * 2;

        ArrayList<Integer> arr = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            list.add(arr.get(i + 1) - arr.get(i));
        }
        int min = 0;
        for (int i = 0; i < 2; i++) {
            int max = list.indexOf(Collections.max(list));
            list.set(max, 0);
            arr.remove(max + 1);
        }
        for (int i = 0; i < n - 3; i+=2) {
                min += arr.get(i + 1) - arr.get(i);
        }
        pw.println(min);
        pw.close();
    }
}
