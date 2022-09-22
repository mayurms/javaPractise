import java.util.Scanner;

public class GradeMarks {
    public static void main(String[] args) {
        float num;
        Scanner sc =new Scanner(System.in);
        System.out.println("Entre Your Marks: ");
        num =sc.nextFloat();

        if(num>=70 && num <=100){
            System.out.println("Congratulations!, Your grade is A+");
        }
        else if (num>=50 && num<=69) {
            System.out.println("You are passed , grade B+");
        }
        else if (num>=35 && num<=49) {
            System.out.println("You are passed , grade C");
        }
        else{
            System.out.println("Your are failed");
        }
        System.out.println("Program run successfully!");
    }
}
