import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        int scores[] = new int[5];
        double sum = 0.0, avg = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 test scores:");
        for (int i = 0; i < scores.length; i++){
            scores[i] = sc.nextInt();
        }
        for (int i = 0; i<scores.length; i++){
            sum = sum + scores[i];
            avg = sum / scores.length;

        }
        System.out.print("The average score of the class is: "+avg);

        
    }

}
