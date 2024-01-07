public class Drayga extends Bayblade{
    private String kutsalCanavar;
    public Drayga(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCnavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar=kutsalCnavar;

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı: "+kutsalCanavar);
    }

    @Override
    public void KutsalCanavariOrtayaCikar() {
        System.out.println(getBeybladeci()+""+kutsalCanavar+" Ortaya Çıkıyor...");
        System.out.println(getBeybladeci()+" ın Saldırısı : Kaplan Pençesi...");

    }

}
