import java.util.Scanner;

public class Max_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n ; i++){

            int number = Integer.parseInt(scan.nextLine());
            if(number > max){
                max = number;
            }
        }
        System.out.println(max);
    }
}


