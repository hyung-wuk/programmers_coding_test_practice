package level1;

public class Example1_260428 {
    boolean example (String s){
        s = s.toLowerCase();
        int pcnt = 0;
        int ycnt = 0;
        for (String word : s.split("")) {
            if (word.equals("p")) {
                pcnt++;
            }
            if (word.equals("y")) {
                ycnt++;
            }
        }
        boolean answer = false;
        if (pcnt == ycnt) {
            answer = true;
        }
        else {
            answer = false;
        }

        return answer;
    }
}

class Main_260428 {
    public static void main(String[] args) {
        Example1_260428 example = new Example1_260428();
        String s = "Pyy";
        boolean answer = example.example(s);
        System.out.println(answer);
    }
}
