//Pyramid
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ;i<=n;i++){
            for(int j = n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k = 1 ;k<i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//Reverse Pyramid
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ;i<=n;i++){
            for(int j = 1;j<i;j++){
                System.out.print(" ");
            }
            for(int k = n-i ;k>=0;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//Diff Pyramid 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k = 0;k<2*i+1;k++){
                System.out.print("*");
            }
            for(int l = 0;l<n-i-1;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

//Reverse Diff Pyramid 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n;i>0;i--){
            for(int k = 0;k<n-i;k++){
                System.out.print(" ");
            }
            for(int j = 0;j<2*i-1;j++){
                System.out.print("*");
            }
            for(int l = 0;l<n-i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

