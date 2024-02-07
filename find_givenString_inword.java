import java.util.Scanner;

public class find_givenString_inword {
    public static void main(String[] args) {
        System.out.println("enter word");
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine();
        System.out.println("enter word to be search in word");
        String given_word=sc.nextLine();
        if(find(word, given_word)==true){
            System.out.println(given_word + " is there in word");
        } else{
            System.out.println(given_word + " is not there in word");
        }
        sc.close();
    }

    public static boolean find(String word,String given_word){
        boolean a=false;
String[] arr=word.split(" ");
for (int i=0;i<arr.length;i++){
    if(arr[i].equals(given_word)){
        a=true;
        break;
    }
    
}

        return a;
    }
}
