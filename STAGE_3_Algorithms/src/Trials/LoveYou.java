package Trials;

public class LoveYou {
    public static void main(String[] args) {
        for (int i=0; i<=5; i++){
            for (int j=0; j<=12; j++){
                if ((i ==0 && j%3!=0) || (i==1 && j%3==0) || (i-j==2) || (i+j==8)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}
