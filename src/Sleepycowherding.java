import java.util.*;
import java.io.*;

public class Sleepycowherding {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("herding.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("herding.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        TreeSet<Integer> set = new TreeSet<Integer>();

        for (int i = 0; i < 3; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        if ((int) set.toArray()[2] - (int) set.toArray()[1] == 1 && (int) set.toArray()[1] - (int) set.toArray()[0] == 1) pw.println(0);
        else if ((int) set.toArray()[2] - (int) set.toArray()[1] == 2 || (int) set.toArray()[1] - (int) set.toArray()[0] == 2) pw.println(1);
        else pw.println(2);

        pw.println(Math.max((int) set.toArray()[2] - (int) set.toArray()[1], (int) set.toArray()[1] - (int) set.toArray()[0]) - 1);
        pw.close();
    }
}
