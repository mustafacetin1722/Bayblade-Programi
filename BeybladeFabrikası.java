public class BeybladeFabrikası {
    public Bayblade baybladeUret(String beybalde_turu){

        if (beybalde_turu.equals("Dragon")){
            return new Dragon("Mavi Ejderha", "Kutsal canavarla konuşma", "Takao", 800, 300);

        }
        else if (beybalde_turu.equals("Draciel")){
            return new Draciel("Kara Kaplumbağa", "Max", 1000, 400);

        }
        else if (beybalde_turu.equals("Drayga")){
            return new Drayga("Rei", 800, 250, "Beyaz Kaplan");

        }
        else if (beybalde_turu.equals("Dranza")){
            return new Dranza("Kai", 600, 400, "Kırmızı Anka Kuşu");
        }
        else {
            return null;

        }

    }
}
