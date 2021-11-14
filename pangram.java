package practiceassignment3;

public class pangram {

    public boolean ispangram(String str){
        boolean [] flag = new boolean[26];
        int index = 0;
        for(int i = 0; i<str.length(); i++){
            if(('A' <= str.charAt(i)) && ('Z' >= str.charAt(i)))
                index = str.charAt(i) - 'A';
            else if(('a' <= str.charAt(i)) && ('z' >= str.charAt(i)))
                index = str.charAt(i) - 'a';
            else
                continue;
            flag[index] = true;
        }

        for(boolean f : flag){
            if(!f)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        pangram pangram = new pangram();
        System.out.println(pangram.ispangram("The quick brown fox jumps over the lazy dog"));
    }

}
