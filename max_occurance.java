import java.util.Scanner;

public class max_occurance {
    public static void main(String[] args) {
        System.out.println("enter word");
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine();
        max_occur(word);
        sc.close();
    }
    public static void max_occur(String word){
        int [] arr = new int[256];
        for(int i=0;i<word.length();i++){
            arr[(int) word.charAt(i)]++;
        }
        int max=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>arr[max]){
                max=j;
            }
        }
        System.out.println((char)max);

    }
}
