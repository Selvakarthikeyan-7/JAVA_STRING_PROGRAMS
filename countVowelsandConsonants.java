public class countVowelsandConsonants {
    public static void main(String[] args) {
       String word="aeif ouu";
       int vow_count=0;
       int consonant_count=0;
   for(int i=0;i<word.length();i++){
    if(isVow(word.charAt(i))==true ){
        vow_count+=1; }
        else if (word.charAt(i)!=' ') {
            consonant_count+=1;
        }
    }
   System.out.println("The given word has " + vow_count + " vowels and " + consonant_count + " consonants");

    }

    

    public static boolean isVow (char ch){
        boolean a=false;
        ch=Character.toLowerCase(ch);
        if(Character.isLetter(ch)){
      char [] char_arr = {'a','e','i','o','u'};
     for(char vow:char_arr){
        if(ch==vow){
            a=true;
            break;
        }
        else{
            a=false;
        }
     }

    }
        return a;
    }
    
}
