public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),cnt=0;
        for(int i = 1 ; i<Math.sqrt(n);i++){
            if(n%i==0){
                cnt++;
                if(n/i!=i){
                    cnt++;
                }
            }
        }
        System.out.print(cnt==2?"Prime Number":"Not a Prime Number");
    }
}
