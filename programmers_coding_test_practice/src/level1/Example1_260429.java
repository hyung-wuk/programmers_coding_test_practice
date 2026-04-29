package level1;

import java.util.*;

public class Example1_260429 {
    public int[] example(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (i +1 < arr.length && arr[i] == arr[i+1]){
                continue;
            }
            else{
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
class Main_260429 {
    public static void main(String[] args) {
        Example1_260429 example = new Example1_260429();
        int[] answer = example.example(new int[]{4,4,4,3,3});
        System.out.println(Arrays.toString(answer));
    }
}