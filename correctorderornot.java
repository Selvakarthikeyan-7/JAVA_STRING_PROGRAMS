public class correctorderornot {
    public static void main(String[] args) {
        String word="yz";
        int count=0;
        for(int i=0;i<word.length()-1;i++){
            if(nextcharacter(word.charAt(i))==word.charAt(i+1)){
                count+=1;
            }
        }
        if(count==word.length()-1){
            System.out.println("given word has been ordered");
        }
        else{
            System.out.println("given word has not been ordered");
        }
    }

    public static char nextcharacter(char ch){
        char nxt_ch= (char) (ch+1);
       
        return nxt_ch;
    }
}
