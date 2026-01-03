import java.io.*;
import java.util.*;

public class Fencepainting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("paint.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int total = b - a + d - c;
        int intersection = Math.max(Math.min(b, d) - Math.max(a, c), 0);

        pw.println(total - intersection);
        pw.close();
    }
}
