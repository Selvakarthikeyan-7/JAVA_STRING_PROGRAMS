import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Enter word");
        Scanner sc= new Scanner(System.in);
        String word=sc.nextLine();
        if(palindrome(word)==true){
            System.out.println(word + " : is a palindrome ");
        } else{
            System.out.println(word + " : is not a palindrome ");
        }
        sc.close();
    }
    public static boolean palindrome (String word){
       boolean a=false;
       String orginal_word=word;
        String rev="";
        for(int i=word.length()-1;i>=0;i--){
            rev+=word.charAt(i);
        }
        if(orginal_word.equalsIgnoreCase(rev)){
            a=true;
        } else{
            a=false;
        }
        return a;
    }
}
