package ba.unsa.etf.tutorijal04;

public class Semestar {
    private String naziv_Semestra;
    private Predmet[] predmeti= null;

    public Semestar(String naziv, ObavezniPredmet[] a){}
    public String ispisi(){
        return null;
    }

    public String getNaziv_Semestra ( ) {
        return naziv_Semestra;
    }

    public void setNaziv_Semestra (String naziv_Semestra) {
        this.naziv_Semestra = naziv_Semestra;
    }

    public void dodajIzborni(IzborniPredmet a){
        return;
    }

}