//divisor
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList();
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        System.out.print(arr);
    }
}
