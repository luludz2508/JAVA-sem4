package week1;

public class ex7 {
    public static void main(String[] args) {
        System.out.printf("   %s\t\t%s\t||\t\t%s\t\t%s\n","Miles","Kilometers","Miles","Kilometers");

        for (int i = 1; i <= 10; i ++){
            double Kilometers = i * 1.609;
            System.out.printf("\t%d\t\t\t%5.2f\t\t||\t\t %d\t\t\t %5.2f\n",i,Kilometers,20+(i-1)*5,(20+(i-1)*5)*1.069);
        }




    }
}
