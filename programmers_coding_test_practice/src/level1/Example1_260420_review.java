package level1;

public class Example1_260420_review {
    public String[] Example1_260420_review(String[] strings, int n) {

        char[] chars = new char[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String[] s = strings[i].split("");
            chars[i] = s[n].charAt(0);
        }

        for (int i = 0; i < strings.length; i++) {
            for (int j = i+1; j < strings.length; j++) {
                if(chars[i]>chars[j]) {
                    char chartemp = chars[i];
                    String stringtemp = strings[i];
                    chars[i] = chars[j];
                    strings[i] = strings[j];
                    chars[j] = chartemp;
                    strings[j] = stringtemp;
                }
                if (chars[i]==chars[j]) {
                    if( 0 < strings[i].compareTo(strings[j])){
                        char chartemp = chars[i];
                        String stringtemp = strings[i];
                        chars[i] = chars[j];
                        strings[i] = strings[j];
                        chars[j] = chartemp;
                        strings[j] = stringtemp;
                    }
                }
            }
        }

        String[] answer = strings.clone();
        return answer;
    }
}

class Main260420_review {
    public static void main(String[] args) {
        Example1_260420_review ex = new Example1_260420_review();
        String[] strings = {"abce","abcd","cdx"};
        String[] answer = ex.Example1_260420_review(strings, 2);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}