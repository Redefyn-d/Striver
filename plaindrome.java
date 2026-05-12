//Palindrome
public class Main{
    static boolean Palindrome(int i,String s){
        if(i>=s.length()/2) return true;
        else if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return Palindrome(i+1,s);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(Palindrome(0,str)?"Palindrome":"Not a Palindrome");
    }
}
