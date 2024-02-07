import java.util.Scanner;

/**
 * stringEndswithgivenString
 */
public class stringEndswithgivenString {

    public static void main(String[] args) {
        System.out.println("enter word");
        Scanner sc= new Scanner(System.in);
        String word=sc.nextLine();
        String ending_String=sc.nextLine();
        
        if(endswith(word, ending_String)==true){
            System.out.println("yes. the given word is ending with given string");
        } else{
            System.out.println("no. the given word is not ending with given string");
        }
        sc.close();
    }
    public static boolean endswith( String word, String ending_String){
        boolean a=false;
        int count=0;
        String rev_word=rev(word);
        String rev_ending_String=rev(ending_String);
        for (int i=0;i<ending_String.length();i++){
        if(rev_word.charAt(i)==rev_ending_String.charAt(i)){
            count+=1;
        }
        }
        if(count==ending_String.length()){
            a=true;
        } else {
            a=false;
        }
            return a;
    }
    public static String rev (String word){
        String rev_str="";
        for(int i=word.length()-1;i>=0;i--){
            rev_str+=word.charAt(i);
        }
        return rev_str;
    }
}