public class printMiddleString {
    public static void main(String[] args) {
        String word="abcdef";
        System.out.println(middleString(word));
    }
    public static String middleString(String word){
        String midStr="";
        int length=word.length();
        if(length%2==0){
           midStr=Character.toString(word.charAt((length/2)-1)).concat(Character.toString(word.charAt(length/2)));
        }
        else{
            midStr=Character.toString(word.charAt((length)/2));
        }
        return midStr;
    }
}
