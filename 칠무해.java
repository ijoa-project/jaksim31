//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 칠무해 {
    public 칠무해() {
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Double> seven = new Stack();
        Stack<Double> temp = new Stack();
        int n = Integer.parseInt(st.nextToken());

        int i;
        for(i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            double num = Double.parseDouble(st.nextToken());
            if (seven.empty()) {
                seven.push(num);
            } else {
                if ((Double)seven.peek() < num) {
                    seven.push(num);
                } else if ((Double)seven.peek() == num) {
                    seven.push(num);
                } else {
                    while(!seven.empty() && (Double)seven.peek() > num) {
                        temp.push((Double)seven.pop());
                    }

                    seven.push(num);
                }

                while(!temp.empty()) {
                    seven.push((Double)temp.pop());
                }

                if (seven.size() == 8) {
                    seven.pop();
                }
            }
        }

        for(i = 0; i < 7; ++i) {
            temp.push((Double)seven.pop());
        }

        while(!temp.empty()) {
            System.out.println(temp.pop());
        }

    }
}
