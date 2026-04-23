package level1;

import java.util.Scanner;

public class Example1_260421 {
    public String example(String s) {
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            String[] Alphabet = strings[i].split("");
            String A = "";
            for (int j = 0; j < Alphabet.length; j++) {
                if(j==0){
                    Alphabet[j] = Alphabet[j].toUpperCase();
                }
                else if (j%2==0){
                    Alphabet[j] = Alphabet[j].toUpperCase();
                }
                else if (j%2==1){
                    Alphabet[j] = Alphabet[j].toLowerCase();
                }
                A += Alphabet[j];
            }
            strings[i] = A;
        }

        String answer = "";
        for (int i = 0; i < strings.length; i++) {
            answer = answer + strings[i];
            if(i!=strings.length-1){
                answer = answer+" ";
            }
        }
        return answer;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Example1_260421 obj = new Example1_260421();
        String result = obj.example(s);
        System.out.println(result);
    }
}

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12930