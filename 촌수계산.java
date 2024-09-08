//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 촌수계산 {
    static int[][] arr;
    static int person;
    static int n;
    static int a;
    static int b;
    static int[] d;

    public 촌수계산() {
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        person = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        arr = new int[person + 1][person + 1];
        d = new int[person + 1];
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr[p][c] = 1;
            arr[c][p] = 1;
        }

        bfs(a, b);
        if (d[b] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(d[b]);
        }

    }

    static void bfs(int s, int e) {
        Queue<Integer> q = new LinkedList();
        q.offer(s);

        while(!q.isEmpty()) {
            int v = (Integer)q.poll();
            if (v == e) {
                break;
            }

            for(int i = 1; i <= person; ++i) {
                if (arr[v][i] == 1 && d[i] == 0) {
                    d[i] = d[v] + 1;
                    q.offer(i);
                }
            }
        }

    }
}
