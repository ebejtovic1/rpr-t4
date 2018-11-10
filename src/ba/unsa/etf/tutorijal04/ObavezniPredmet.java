package ba.unsa.etf.tutorijal04;

public class ObavezniPredmet extends Predmet {
    private String nazivPredmeta="";
    private int ETCSbodovi;
    private int brojStudenata;
    private final int maxBr;
    private Student [] upisaniStudenti=null;

    @Override
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

    public ObavezniPredmet (String nazivPredmeta, int ETCSbodovi, int maxBr) {
        this.nazivPredmeta = nazivPredmeta;
        this.ETCSbodovi = ETCSbodovi;
        this.brojStudenata = 0;
        this.maxBr = maxBr;
        upisaniStudenti=new Student[50];
    }
    public void upisiStudenta(Student s){
        if(brojStudenata<maxBr){
            upisaniStudenti[brojStudenata]=s;
            brojStudenata++;
        }
        else {
            System.out.println("Predmet popunjen");
        }
    }
    @Override
    public String ispisi(){

        String s="";
        for(int i=0;i<brojStudenata;i++){

            s+= (i+1)+". " + upisaniStudenti[i].getPrezime() + " " + upisaniStudenti[i].getIme() + " (" + upisaniStudenti[i].getIndex() + ")" + "\n";
        }
        return s;
    }
}