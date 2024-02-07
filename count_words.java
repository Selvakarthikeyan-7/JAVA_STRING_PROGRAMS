import java.util.Scanner;

public class count_words {
    public static void main(String[] args) {
        System.out.println("enter sentence with space to calculate word count");
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        System.out.println("word count in given sentence which is splitted by space is : " + count(word));
        sc.close();
    }
    public static int count(String word){
        int count=0;
        for(int i=0; i<word.length();i++){
            if(word.charAt(i)==' '){
            count+=1;
            }
        }

        return count+1;
    }
}
