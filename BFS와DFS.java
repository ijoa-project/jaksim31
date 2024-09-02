import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS와DFS {
    static int n;
    static int m;
    static int start_v;
    static int[][] arr;
    static int[] visited;
    static Queue<Integer> q;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        start_v = Integer.parseInt(st.nextToken());
        arr = new int[n+1][n+1];
        visited = new int[n+1];
        q = new LinkedList<>();

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        dfs(start_v);
        visited = new int[n+1];

        System.out.println();
        bfs(start_v);

    }
    static void dfs(int v){
        System.out.print(v+" ");
        visited[v] = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[v][i]==1 && visited[i]==0){
                dfs(i);
            }
        }
    }

    static void bfs(int v){
        visited[v]=1;
        q.offer(v);
        while(!q.isEmpty()){
            int temp = q.poll();
            System.out.print(temp+" ");
            for(int i=1;i<arr.length;i++){
                if(arr[temp][i] == 1 && visited[i]==0){
                    visited[i] = 1;
                    q.offer(i);
                }
            }
        }
    }
}
