package level1;

public class Example1_260421_review {
    public String example(String s){

        int index = 0;
        String[] arr = new String[s.length()];
        for(int i=0; i<s.length(); i++){
            if(i!=0 && s.charAt(i-1)==' '){
                index=0;
            }

            if(index%2==0){
                arr[i]=String.valueOf(s.charAt(i)).toUpperCase();
                index++;
            }
            else if(index%2==1){
                arr[i]=String.valueOf(s.charAt(i)).toLowerCase();
                index++;
            }
        }
        s="";
        for(int i=0; i<arr.length; i++){
            s+=arr[i];
        }

        String answer = s;
        return answer;
    }
}

class Main_260421_review {
    public static void main(String[] args) {
        Example1_260421_review example = new Example1_260421_review();
        System.out.println(example.example("try hello world"));
    }
}
