import java.util.Scanner;

public class mayu {


    public static void main(String[] args) {
        int num ;
        Scanner sc =new Scanner(System.in);
        System.out.println("Entre the number: ");
        num = sc.nextInt();
        if (num <=18 ){
            System.out.println("You are not able to voting");
        }
        else{
            System.out.println("Congratualtion!, You can vote ");
        }
    }
}