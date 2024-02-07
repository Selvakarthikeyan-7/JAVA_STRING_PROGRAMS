public class replaceNextchar {
    public static void main(String[] args) {
        String word="abcd";
        System.out.println(replace(word));
    }
    public static String replace(String word){
        String str="";
        for(int i=0;i<word.length();i++){
            str+=nextchar(word.charAt(i));
        }
        return str;
    }
    public static String nextchar(char ch){
        char nextch=(char) (ch+1);
      
        String nextcharact=Character.toString(nextch);
        return nextcharact;
    }
}
