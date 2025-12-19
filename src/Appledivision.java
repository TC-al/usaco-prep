import java.util.*;
import java.io.*;

public class Appledivision {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st =  new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < n; k++) {

                }
            }
        }
    }

    public int recursion(int total, int end, int index, int size){
        if (end <= 0) {
            return recursion(total, total, index, size+1);
        }
        if (index <= size) {
            return recursion(total, end-1, end-1, size);
        }
        if  (size <= total) {
            return 0;
        }
        else {
            for (int i = 0; i < ; i++) {
                
            }
            arr.add(num[end-1] + num[index])
            return recursion(total, end, index-1, size);
        }
    }
}
