//package level1;
//
//public class Example1_260420 {
//    public String[] Example1_260420(String[] strings, int n) {
//
//        char[] chars = new char[strings.length];
//        int[] sumvalues = new int[strings.length];
//        for (int i = 0; i < strings.length; i++) {
//            String[] s = strings[i].split("");
//            chars[i] = s[n].charAt(0);
//            for (int j = 0; j < s.length; j++) {
//                sumvalues[i] += (int)s[j].charAt(0);
//            }
//        }
//
//        for (int i = 0; i < strings.length; i++) {
//            for (int j = i+1; j < strings.length; j++) {
//                if((int)chars[i]>(int)chars[j]){
//                    char chartemp = chars[i];
//                    String stringtemp = strings[i];
//                    chars[i] = chars[j];
//                    strings[i] = strings[j];
//                    chars[j] = chartemp;
//                    strings[j] = stringtemp;
//                }
//                if((int)chars[i] == (int)chars[j]){
//                    int sumtemp = chars[i];
//                    String stringtemp = strings[i];
//                    sumvalues[i] = sumvalues[j];
//                    strings[i] = strings[j];
//                    sumvalues[j] = sumtemp;
//                    strings[j] = stringtemp;
//                }
//            }
//        }
//
//        String[] answer = strings;
//        return answer;
//    }
//}
//
//class Main{
//    public static void main(String[] args) {
//        Example1_260420 ex = new Example1_260420();
//        String[] strings = {"sun","bed","car"};
//        System.out.println(ex.Example1_260420(strings, 1));
//    }
//}
//틀림!!!

//문제 링크
//https://school.programmers.co.kr/learn/courses/30/lessons/12915?language=java
