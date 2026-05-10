//V pattern 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(j+1);
            }
            for(int k = (n-i-1)*2;k>0;k--){
                System.out.print(" ");
            }
            for(int l = i ; l>=0;l--){
                System.out.print(l+1);
            }
            System.out.println();
        }
    }
}
