import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        //Üçgenin Hipotenüsünü Hesaplama

        double a,b,c;

        System.out.println("Lütfen üçgenin kısa kenarını 'a' giriniz= ");
        a= inp.nextDouble();
        System.out.println("Lütfen üçgenin uzun 'b' kenarını giriniz= ");
        b= inp.nextDouble();

        c=Math.sqrt(a*a+b*b);
        System.out.println("Hipotenüs= "+ c);
        System.out.println("Ucgenin Hipotenüsü a2+b2=c2 : "+c);
    }
}