public class remove_vowels {
    public static void main(String[] args) {
      String s = "mye namEe is selva karthiI keEyan";
      System.out.println(removeVowel(s));
    }

    public static String removeVowel(String word){
        String str="";
        StringBuilder result = new StringBuilder(word);
        for(int i=0;i<result.length();){
            if(isvowel(result.charAt(i))==true){
                result.deleteCharAt(i);
            } else{
                i++;
            }
        }
        str= result.toString();
     
        return str;
    }

    public static boolean isvowel(char ch){
        boolean a=false;
    char [] vowel_arr={'a','e','i','o','u','A','E','I','O','U'};
    for(char vow:vowel_arr){
if(ch == vow){
    a=true;
    break;
    
}
else{
    a=false;
}
    }
   return a;
    }
    
}