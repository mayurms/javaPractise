import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        int num,i,mul;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the number: ");
        num=sc.nextInt();
        for(i=0;i<11;i++){
            mul=num*i;
            System.out.println(mul);

        }
    }
}
