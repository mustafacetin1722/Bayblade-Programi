public class Dragon extends Bayblade{
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String kutsalCanavar, String gizliYetenek, String beybladeci, int donusHizi, int saldiriGucu) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı: "+kutsalCanavar);
        System.out.println("Gizli Yetenek:"+gizliYetenek);
    }

    @Override
    public void KutsalCanavariOrtayaCikar() {
        System.out.println(getBeybladeci()+" "+kutsalCanavar+" Ortaya Çıkıyor...");
        System.out.println(getBeybladeci()+" ın Saldırısı : Hayalet kasırgası...");

    }
}
