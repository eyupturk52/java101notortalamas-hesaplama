//scanner sınıfını import ettik
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        // degişkenleri tanımladık
        float turkce,matematık,fizik,kimya,müzik,tarih;
        float toplam;
        float ortalama;
        Scanner input=new Scanner(System.in);
        System.out.print("turkce dersinin notunu giriniz:");
        turkce=input.nextFloat();
        System.out.print("matematik dersinin notunu giriniz:");
        matematık=input.nextFloat();
        System.out.print("muzik dersinin notunu giriniz:");
        müzik=input.nextFloat();
        System.out.print("fizik dersinin notunu giriniz:");
        fizik=input.nextFloat();
        System.out.print("kimya dersinin notunu giriniz:");
        kimya=input.nextFloat();
        System.out.print("tarih dersinin notunu giriniz:");
        tarih=input.nextFloat();

        toplam=turkce+tarih+fizik+kimya+matematık+müzik;
        ortalama=toplam/6;

        boolean notsonucu= ortalama > 60;
        String sonuc= (notsonucu) ? "Sınıfı geçti" : "Sınıfta Kaldı";

        System.out.println("genel ortalamanız:"+ortalama);
        System.out.println(sonuc);





    }
}
