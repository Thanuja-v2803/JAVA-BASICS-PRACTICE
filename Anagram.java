public class Anagram {
    public static void main(String args[]){
        String s1="care";
        String s2="race";
        if(s1.length()!=s2.length()){
            System.out.println("not anagram");
            return;
        }
        int count=0;
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        if(count==s1.length())
            System.out.println("ANAGRAM");
        else
            System.out.println("not an ANAGRAM");

    }
}
