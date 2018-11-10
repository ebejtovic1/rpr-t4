package ba.unsa.etf.tutorijal04;

public class Semestar {
    private String naziv_Semestra;
    private Predmet[] predmeti= null;
    private int brojPredmeta;
    private final int maxBr;

    public Semestar(String naziv, ObavezniPredmet[] a, int maxBr){
        this.naziv_Semestra=naziv;
        this.maxBr=maxBr;
        predmeti=a.clone();
    }
    public String ispisi(){
        String s="";
        for(int i=0;i<brojPredmeta;i++){

            String pomocni=predmeti[i].getNazivPredmeta();
            s+= (i+1)+". " + pomocni + "\n";
        }
        return s;
        
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