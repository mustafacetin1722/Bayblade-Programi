import java.util.Scanner;

public class BaybladeProgrami {
    public static void main(String[] args) {

        System.out.println("Beybalde Fabrikasına Hoşgeldiniz...");
        System.out.println("Çıkış için  q'ye basınız");
        System.out.println("Üretebilceğiniz Canavarlar: Dranza, Drayga, Draciel, Dragon");
        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.println("Lütfen bir canavar seçiniz");
            String islem=scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else{
                BeybladeFabrikası fabrikası=new BeybladeFabrikası();

                Bayblade bayblade=fabrikası.baybladeUret(islem);

                if (bayblade==null){
                    System.out.println("Lütfen Geçerli Bir İşlem Giriniz...");
                }
                else{
                    bayblade.bilgileriGoster();
                    bayblade.KutsalCanavariOrtayaCikar();
                    bayblade.saldir();
                }
            }
        }
    }
}