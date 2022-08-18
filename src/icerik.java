import java.util.Locale;
import java.util.Scanner;

public class icerik {
    public static void main(String[] args){


        //ekranı okuma ve Locale belirleme okuduğunu bastırma



        /*
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Bir  sayı giriniz: ");
        double a = sc.nextDouble();
        System.out.println("a değişkeninin değeri " + a);
        */



        //ekranı okuma kullanıcı girişi ve şifre kontrolü



        /*String userName = "Erbil Can Keleş";
        String password = "Erbil1234!";
        Scanner scan = new Scanner(System.in);

        System.out.println("Kullanıcı adını giriniz: ");
        String userNameUserLogin = scan.nextLine();

        System.out.println("Şifre Giriniz:");
        String passwordUserLogin = scan.nextLine();

        if(userName.equals(userNameUserLogin)){
            if (password.equals(passwordUserLogin)){
                System.out.println("Kullanıcı adı ve şifre doğru - Sisteme giriş yaptınız");
            }
            else{
                System.out.println("Şifreniz yanlış");
            }
        }
        else{
            System.out.println("Kullanıcı girişi yanlış");
        }*/

        //Switch case örneği





        /*
        Scanner scan = new Scanner(System.in);
        int bakiye = 16000;

        System.out.println("11: Bakiye Görüntüleme");
        System.out.println("12: Para Yatırma");
        System.out.println("13: Para Çekme");
        System.out.println("14: Sistemden Çıkış");
        int islem = scan.nextInt();
        int gunlukSinir = 5000;

        switch (islem){
            case 11:
                System.out.println("Güncel Bakiyeniz:" + bakiye);
                break;

            case 12:
                System.out.println("Ne Kadar Para Yatırmak İstersiniz?");
                int sayi = scan.nextInt();
                if(bakiye>sayi){
                    bakiye += sayi;
                    System.out.println("Güncel Bakiyeniz: "+bakiye);
                }
                else{
                    System.out.println("Yeterli Bakiyeniz Bulunmamaktadır!");
                }
                break;

            case 13:
                System.out.println("Ne Kadar Para Çekmek İstersiniz?");
                sayi = scan.nextInt();
                if (gunlukSinir <= sayi){
                    bakiye -= sayi;
                    System.out.println("Güncel Bakiyeniz: "+bakiye);
                }

                break;

            case 14:
                System.out.println("Sistemden Çıkış Yaptınız!!");

            default:
                System.out.println("Geçersiz işlem Yaptınız!");
                break;
        }*/

        //while döngü örneğiii





        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoriyeli Hesaplanacak Sayıyı Giriniz: ");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;

        while (sayi >=1) {
            faktoriyel = faktoriyel * sayi;
            sayi--;
        }
        System.out.println("faktoriyeli= "+ faktoriyel);

        */


        //Do-While döngüsü

        /*
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir Sayı giriniz:" );
        int sayi = scan.nextInt();
        int toplam = 0;

        do{
            toplam += sayi %10 ;

            sayi = sayi / 10;
            System.out.println("Sayının rakamları toplamı: "+toplam+" Sayımız: "+sayi);
        }
        while (sayi > 0 );{
            System.out.println(toplam);

        }
        */





    }
}
