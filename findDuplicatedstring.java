public class findDuplicatedstring {
    public static void main(String[] args) {
        String word="abcde";
        String status="false";
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1)){
                status="true";
                break;
                
                
            }
            else if (word.charAt(i)!=word.charAt(i+1)){
               
                continue;
            }
            
            
        }
        System.out.println(status);
    }
    
}
