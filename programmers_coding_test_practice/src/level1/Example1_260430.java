package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Example1_260430 {
    public int[] example(int[] array, int[][] commands){
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int startindex = commands[i][0]-1;
            int endindex = commands[i][1]-1;
            int n = commands[i][2]-1;
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = startindex; j <= endindex; j++){
                temp.add(array[j]);
            }
            int[] sortTemp = new int[temp.size()];
            for(int j = 0; j < temp.size(); j++){
                sortTemp[j] = temp.get(j);
            }
            Arrays.sort(sortTemp);

            answer[i] = sortTemp[n];
        }

        return answer;
    }
}

class Main_260430 {
    public static void main(String[] args) {
        int[] array = new int[]{1,5,2,6,3,7,4};
        int[][] commands = new int[][]{{2,5,3}, {4,4,1}, {1,7,3}};

        Example1_260430 sol = new Example1_260430();
        System.out.println(Arrays.toString(sol.example(array, commands)));
    }
}