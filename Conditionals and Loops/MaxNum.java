import java.util.Scanner;

public class MaxNum {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        System.out.print("Enter the three numbers: ");
        int n1 = n.nextInt();
        int n2 = n.nextInt();
        int n3 = n.nextInt();

        //first method
        // int max = n1;
        // if(max < n2){
        //     max = n2;
        // } 

        // if (max < n3){
        //     max = n3;
        // } 

        // second method
        int max = 0;
        if(n1 < n2) {
            max = n2;
        } else{
            max = n1;
        }

        if (n3 > max){
            max = n3;
        }

        System.out.println("Max is : " + max);


    }
}