import java.io.*;
import java.util.*;

class Rect {
    int x1, y1, x2, y2;
    int area() {
        return (x2 - x1) * (y2 - y1);
    }
}

public class Blockedbillboard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("billboard.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));

        StringTokenizer st;

        Rect a = new Rect();
        Rect b = new Rect();
        Rect c = new Rect();

        st = new StringTokenizer(br.readLine());
        a.x1 = Integer.parseInt(st.nextToken());
        a.y1 = Integer.parseInt(st.nextToken());
        a.x2 = Integer.parseInt(st.nextToken());
        a.y2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        b.x1 = Integer.parseInt(st.nextToken());
        b.y1 = Integer.parseInt(st.nextToken());
        b.x2 = Integer.parseInt(st.nextToken());
        b.y2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        c.x1 = Integer.parseInt(st.nextToken());
        c.y1 = Integer.parseInt(st.nextToken());
        c.x2 = Integer.parseInt(st.nextToken());
        c.y2 = Integer.parseInt(st.nextToken());

        pw.println(a.area() - intersect(a, c) + b.area() - intersect(b, c));
        pw.close();
    }

    public static int intersect(Rect a, Rect b) {
        int x = Math.max(0, Math.min(a.x2, b.x2) - Math.max(a.x1, b.x1));
        int y = Math.max(0, Math.min(a.y2, b.y2) - Math.max(a.y1, b.y1));
        return x * y;
    }
}
