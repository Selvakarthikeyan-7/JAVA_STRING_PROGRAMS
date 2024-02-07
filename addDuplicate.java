public class addDuplicate {
    public static void main(String[] args) {
        String word="asbc";
        System.out.println(addDup(word));
    }

    public static String addDup(String word){
        String str="";
        for(int i=0;i<word.length();i++){
            str+=word.charAt(i);
            str+=word.charAt(i);
        }
        return str;
    }
}
