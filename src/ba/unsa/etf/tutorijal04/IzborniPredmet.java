package ba.unsa.etf.tutorijal04;

public class IzborniPredmet extends Predmet {
    private String nazivPredmeta="";
    private int ETCSbodovi;
    private int brojStudenata;
    private final int maxBr;
    private Student [] upisaniStudenti=null;

    public String getNazivPredmeta ( ) {
        return nazivPredmeta;
    }

    public void setNazivPredmeta (String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getETCSbodovi ( ) {
        return ETCSbodovi;
    }

    public void setETCSbodovi (int ETCSbodovi) {
        this.ETCSbodovi = ETCSbodovi;
    }

    public IzborniPredmet (String nazivPredmeta, int ETCSbodovi, int maxBr) {
        this.nazivPredmeta = nazivPredmeta;
        this.ETCSbodovi = ETCSbodovi;
        this.brojStudenata = 0;
        this.maxBr = maxBr;
        upisaniStudenti=new Student[50];
    }
    public void upisiStudenta(Student s){
        return;
    }
    @Override
    public String ispisi(){
        return null;
    }

}
