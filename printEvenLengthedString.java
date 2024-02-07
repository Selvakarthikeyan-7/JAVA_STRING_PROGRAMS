public class printEvenLengthedString {
    public static void main(String[] args) {
        String word="The word is given in notess";
        System.out.println(evenLength(word));
    }
    public static String evenLength(String word){
        String str="";
        String [] str_arr=word.split(" ");
        for(int i=0;i<str_arr.length;i++){
            if(str_arr[i].length()%2==0){
                str+=str_arr[i].concat(" ");
            }
        }
        return str;
    }
}
