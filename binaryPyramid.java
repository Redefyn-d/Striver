public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int flg=1;
            for(int i = 0;i<=n;i++){
                for(int j = 0;j<i;j++){
                    System.out.print(flg);
                    flg = (flg ==1)?0:1;
                }
                System.out.println();
                if(i % 2==0){
                    flg = 1;
                }else{
                    flg = 0;
                }
            }
        }
}
