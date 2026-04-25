package level1;

public class Example1_260422 {
    public String example(String s){
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j= i+1;j<arr.length;j++){
                if((int)arr[i] < (int)arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        s ="";
        for(int i=0;i<arr.length;i++){
            s += arr[i];
        }

        String answer = s;
        return answer;
    }
}

class Main_260422 {
    public static void main(String[] args) {
        Example1_260422 example = new Example1_260422();
        System.out.println(example.example("Zbcdefg"));
    }
}