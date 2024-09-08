import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 제로 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Long sum = 0L;
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(br.readLine());
            if(num!=0) {
                stack.push(num);
                sum += num;
            }
            else {
                if(!stack.isEmpty()) {
                    sum -= stack.pop();
                }
            }
        }
        System.out.println(sum);
    }
}
