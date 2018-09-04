package hbacak07.example.com.muhasebe.Data;

public class Item {
    int id;
    String tur;//giyim ,fatura,kira
    String tip;// gelir->1 , gider->2 , borc->3 , alacak->4
    int tarih;
    int miktar;
    String not;

    public Item(int id, String tur, String tip, int tarih, int miktar, String not) {
        this.id = id;
        this.tur = tur;
        this.tip = tip;
        this.tarih = tarih;
        this.miktar = miktar;
        this.not = not;
    }
    public Item() {
        this.id = id;
        this.tur = tur;
        this.tip = tip;
        this.tarih = tarih;
        this.miktar = miktar;
        this.not = not;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getTarih() {
        return tarih;
    }

    public void setTarih(int tarih) {
        this.tarih = tarih;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }
}
