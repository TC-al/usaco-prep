import java.util.*;
import java.io.*;

public class Sleepycowherding {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter pw = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new FileReader("herding.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("herding.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        TreeSet<Integer> set = new TreeSet<Integer>();

        for (int i = 0; i < 3; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        TreeSet<Integer> set2 = new TreeSet<Integer>();
        for (int i = 0; i < 3; i++) {
            set2.add((int) set.toArray()[i]);
        }
        pw.println(minimum(set));
        pw.println(maximum(set2));
        pw.close();
    }

    public static int minimum(TreeSet<Integer> set) {
        int count = 0;
        while ((int) set.toArray()[2] - (int) set.toArray()[1] != 1 || (int) set.toArray()[1] - (int) set.toArray()[0] != 1) {
            if ((int) set.toArray()[2] - (int) set.toArray()[1] == 1) {
                int tmp = (int) set.toArray()[1] - ((int) set.toArray()[1] - (int) set.toArray()[0]) / 2;
                set.remove((int) set.toArray()[2]);
                set.add(tmp);
                count++;
            } else if ((int) set.toArray()[1] - (int) set.toArray()[0] == 1) {
                int tmp = (int) set.toArray()[1] + ((int) set.toArray()[2] - (int) set.toArray()[1]) / 2;
                set.remove((int) set.toArray()[0]);
                set.add(tmp);
                count++;
            } else {
                if ((int) set.toArray()[2] - (int) set.toArray()[1] > (int) set.toArray()[1] - (int) set.toArray()[0]) {
                    int tmp = (int) set.toArray()[1] - ((int) set.toArray()[1] - (int) set.toArray()[0]) / 2;
                    set.remove((int) set.toArray()[2]);
                    set.add(tmp);
                    count++;
                } else {
                    int tmp = (int) set.toArray()[1] + ((int) set.toArray()[2] - (int) set.toArray()[1]) / 2;
                    set.remove((int) set.toArray()[0]);
                    set.add(tmp);
                    count++;
                }
            }
        }
        return count;
    }

    public static int maximum(TreeSet<Integer> set) {
        int count = 0;
        while ((int) set.toArray()[2] - (int) set.toArray()[1] != 1 || (int) set.toArray()[1] - (int) set.toArray()[0] != 1) {
            if ((int) set.toArray()[2] - (int) set.toArray()[1] == 1) {
                int tmp = (int) set.toArray()[1] - 1;
                set.remove((int) set.toArray()[2]);
                set.add(tmp);
                count++;
            }
            else if ((int) set.toArray()[1] - (int) set.toArray()[0] == 1) {
                int tmp = (int) set.toArray()[1] + 1;
                set.remove((int) set.toArray()[0]);
                set.add(tmp);
                count++;
            }
            else {
                if ((int) set.toArray()[2] - (int) set.toArray()[1] > (int) set.toArray()[1] - (int) set.toArray()[0]) {
                    int tmp = (int) set.toArray()[1] + ((int) set.toArray()[2] - (int) set.toArray()[1]) / 2;
                    set.remove((int) set.toArray()[0]);
                    set.add(tmp);
                    count++;
                } else {
                    int tmp = (int) set.toArray()[1] - ((int) set.toArray()[1] - (int) set.toArray()[0]) / 2;
                    set.remove((int) set.toArray()[2]);
                    set.add(tmp);
                    count++;
                }
            }
        }
        return count;
    }
}
