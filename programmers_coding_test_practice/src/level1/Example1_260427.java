package level1;

public class Example1_260427 {
    public int example(int n){
        String num = Integer.toString(n);
        String[] arr = num.split("");
        int[] numarr = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            numarr[i] = Integer.parseInt(arr[i]);
        }

        int answer = 0;
        for(int i=0;i<numarr.length;i++){
            answer += numarr[i];
        }

        return answer;
    }
}

class Main_260427{
    public static void main(String[] args) {
        Example1_260427 example = new Example1_260427();
        int n = 987;
        System.out.println(example.example(n));
    }
}
