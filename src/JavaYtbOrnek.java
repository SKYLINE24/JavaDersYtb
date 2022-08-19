import java.util.Locale;
import java.util.Scanner;

public class JavaYtbOrnek {
    public static void main(String[] args){
        DortIslem.toplama(60,70);
        DortIslem.cıkartma(80,21);
        DortIslem.carpma(5,18);
        DortIslem.bolme(1230,10);

        localeOrnegi();
        sifreKontrolu();
        switchCaseOrnek();
        whileDongu();
        doWhileDongu();

    }

    private static void localeOrnegi() {
        //ekranı okuma ve Locale belirleme okuduğunu bastırma
        //scanner ve locale üzerine gelip Alt+Enter yaparsanız kütüphanete import işlemi ile uyarılar çözülür
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Bir  sayı giriniz: ");
        double a = sc.nextDouble();
        System.out.println("a değişkeninin değeri " + a);
    }

    private static void sifreKontrolu() {
        //ekranı okuma kullanıcı girişi ve şifre kontrolü

        String userName = "Erbil Can Keleş";
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
        }
    }

    private static void switchCaseOrnek() {
        //Switch case örneği

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
        }
    }

    private static void whileDongu() {
        //while döngü örneğiii
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoriyeli Hesaplanacak Sayıyı Giriniz: ");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;

        while (sayi >=1) {
            faktoriyel = faktoriyel * sayi;
            sayi--;
        }
        System.out.println("faktoriyeli= "+ faktoriyel);
    }

    private static void doWhileDongu() {
        //Do-While döngüsü

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
    }

}
