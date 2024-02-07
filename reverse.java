import java.util.Scanner;

/**
 * reverse
 */
public class reverse {

    public static void main(String[] args) {
        System.out.println("Enter word");
        Scanner sc= new Scanner(System.in);
        String word=sc.nextLine();
        System.out.println(rev(word));
        sc.close();
    }
    public static String rev(String word){
        String rev_string="";
        for (int i= word.length()-1;i>=0;i--){
            rev_string+=word.charAt(i);
        }
      return rev_string;
    }
}