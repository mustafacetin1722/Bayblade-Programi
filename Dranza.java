public class Dranza extends Bayblade{
    private String kutsalCanavar;

    public Dranza(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar=kutsalCanavar;

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı: "+ kutsalCanavar);
    }

    @Override
    public void KutsalCanavariOrtayaCikar() {

        System.out.println(getBeybladeci()+""+kutsalCanavar+" Ortaya Çıkıyor...");
        System.out.println(getBeybladeci()+" ın Saldırısı : Alev Kılıcı...");


    }
}
