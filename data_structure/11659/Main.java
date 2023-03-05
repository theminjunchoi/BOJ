import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suNo = sc.nextInt();
        int quizNo = sc.nextInt();
        long[] S = new long[suNo+1];

        for(int i=1; i<=suNo; i++){
            S[i]=S[i-1]+sc.nextInt();
        } 

        for(int i=0; i<quizNo; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(S[y]-S[x-1]);
        }
    }
}