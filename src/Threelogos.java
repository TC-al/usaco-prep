import java.util.*;
import java.io.*;

public class Threelogos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
            arr[i][2] = 65 + i;
            Arrays.sort(arr[i], 0, 2);
        }
        if (!isPerfectSquare(arr[0][0] * arr[0][1] + arr[1][0] * arr[1][1] + arr[2][0] * arr[2][1])) {
            pw.println(-1);
            pw.close();
            return;
        }
        if (arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1]) {
            if (arr[0][0] + arr[1][0] + arr[2][0] == arr[0][1]) {
                pw.println(arr[0][1]);
                for (int k = 0; k < 3; k++) {
                    for (int i = 0; i < arr[k][0]; i++) {
                        for (int j = 0; j < arr[k][1]; j++) {
                            pw.print(Character.toChars(arr[k][2]));
                        }
                        pw.println();
                    }
                }
            }
            else pw.println(-1);
            pw.close();
            return;
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));

        if ((arr[2][1] == arr[2][0] + arr[0][1] || arr[2][1] == arr[2][0] + arr[0][0]) && (arr[2][0] + arr[1][1] == arr[1][0] + arr[0][0] || arr[2][0] + arr[1][0] == arr[1][1] + arr[0][1] || arr[2][0] + arr[0][1] == arr[0][0] + arr[1][1])) {
            pw.println(arr[2][1]);
            for (int i = 0; i < arr[2][0]; i++) {
                for (int j = 0; j < arr[2][1]; j++) {
                    pw.print(Character.toChars(arr[2][2]));
                }
                pw.println();
            }
            if (arr[2][0] > arr[0][0]) {
                for (int i = 0; i < arr[0][0]; i++) {
                    for (int j = 0; j < arr[0][1]; j++) {
                        pw.print(Character.toChars(arr[0][2]));
                    }
                    for (int j = 0; j < arr[1][1]; j++) {
                        pw.print(Character.toChars(arr[1][2]));
                    }
                    pw.println();
                }
            }
            else {
                for (int i = 0; i < arr[0][1]; i++) {
                    for (int j = 0; j < arr[0][0]; j++) {
                        pw.print(Character.toChars(arr[0][2]));
                    }
                    for (int j = 0; j < arr[1][0]; j++) {
                        pw.print(Character.toChars(arr[1][2]));
                    }
                    pw.println();
                }
            }
            pw.close();
            return;
        }
        pw.println(-1);
        pw.close();
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }

        double sqrt = Math.sqrt(num);
        return sqrt == Math.floor(sqrt);
    }
}
