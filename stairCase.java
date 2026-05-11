public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ;i<n;i++){
            for(int j = 0 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Pattern 13
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<i;j++){
                System.out.print(val);
                val++;
            }
            System.out.println();
        }
    }
}
