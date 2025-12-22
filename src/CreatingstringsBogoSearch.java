import java.util.*;
import java.io.*;

public class CreatingstringsBogoSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st =  new StringTokenizer(br.readLine());
        String s = st.nextToken();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            arr.add(s.charAt(i) + "");
        }

        Collections.sort(arr);
        String prev = "";
        ArrayList<Integer> count = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(prev)) {
                temp++;
            }
            else if (temp != 0){
                count.add(temp);
            }
            prev = arr.get(i);
        }

        int n = factorial(arr.size());

        for (int i = 0; i < count.size(); i++) {
            n /= factorial(count.get(i));
        }

        ArrayList<String> ans = new ArrayList<>();
        while (ans.size() <= n) {
            Collections.shuffle(arr);
            String tempStr = "";
            for (int i = 0; i < arr.size(); i++) {
                tempStr += arr.get(i);
            }
            if (!ans.contains(tempStr)) {
                ans.add(tempStr);
            }
        }

        pw.write(n);
        for (var x : ans) {
            pw.write(x);
        }
        pw.close();
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
