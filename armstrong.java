public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),temp=n;
        int sum = 0;
        while(temp!=0){
            sum += Math.pow((temp%10),String.valueOf(n).length());
            temp/=10;
        }
        System.out.print(sum==n?"Palindrome":"Not a Palindrome");
    }
}
