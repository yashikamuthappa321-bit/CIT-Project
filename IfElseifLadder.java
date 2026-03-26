import java.util.Scanner;
public class IfElseifLadder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of the student:");
        int marks=sc.nextInt();
        System.out.println("Marks of the student is:"+marks);
        if(marks>=90)
            System.out.println("A grade");
        else if(marks>=70)
            System.out.println("B grade:");
        else
            System.out.println("fail");
    }
    
}
