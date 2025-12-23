import java.io.*;
import java.util.*;

public class Creatingstrings {

    private static ArrayList<Character> arr = new ArrayList<>();
    public static boolean[] chosen;
    private static ArrayList<String> ans = new ArrayList<>();
    private static String current = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st =  new StringTokenizer(br.readLine());
        String[] s = st.nextToken().split("");

        for (int i = 0; i < s.length; i++) {
            arr.add(s[i].charAt(0));
        }

        chosen = new boolean[arr.size()];

        search(0);

        pw.println(ans.size());
        for (var x : ans) {
            pw.println(x);
        }
        pw.close();
    }

    public static void search(int n) {
        if (n == arr.size() && !ans.contains(current)) {
            ans.add(current);
            return;
        }

        for (int i = 0; i < arr.size(); i++) {
            if (chosen[i]) {
                continue;
            }
            chosen[i] = true;
            current += arr.get(i);
            search(n+1);
            chosen[i] = false;
            current = current.substring(0,current.length()-1);
        }
    }
}
