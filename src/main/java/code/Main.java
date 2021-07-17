package code;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0 ; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += arr[i] * (arr.length - i);
        }

        System.out.println(sum);

    }
}
