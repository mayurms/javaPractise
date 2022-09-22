import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        int i,n,m;
        Scanner sc =new Scanner(System.in);
        System.out.println("Entre the number: ");
        n=sc.nextInt();
        i=2;
        m=0
        while (i<=n/2){
            if(n%i==0){
                m++;
                break;
            }
            i++;
        }
        if (m==0 || n!=1){
            System.out.print(n + " ");
        }
    }
}
