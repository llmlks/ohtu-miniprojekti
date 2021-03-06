package domain;

import tools.TextTools;


public class Blogi implements Lukuvinkki{
    
    private int id;
    private String otsikko;
    private String kirjoittaja;
    private String url;
    private boolean luettu;

    public Blogi(String otsikko, String kirjoittaja, String url) {
        this.otsikko = otsikko;
        this.kirjoittaja = kirjoittaja;
        this.url = url;
    }
    
    public Blogi(int id, String otsikko, String kirjoittaja, String url, boolean luettu) {
        this.id = id;
        this.otsikko = otsikko;
        this.kirjoittaja = kirjoittaja;
        this.url = url;
        this.luettu = luettu;
    }

    public String getOtsikko() {
        return otsikko;
    }

    public String getKirjoittaja() {
        return kirjoittaja;
    }

    public String getUrl() {
        return url;
    }

    public void setOtsikko(String otsikko) {
        this.otsikko = otsikko;
    }

    public void setKirjoittaja(String kirjoittaja) {
        this.kirjoittaja = kirjoittaja;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    @Override
    public String toString() {
        int maxLength = 20;
        String columnRepresentation = TextTools.fit(kirjoittaja, 20) + " | ";
        columnRepresentation += TextTools.fit(otsikko, 20) + " | ";
        columnRepresentation += TextTools.fit(url, 20) + " | ";
        if (luettu) {
            columnRepresentation += TextTools.fit("kyllä", 20);
        } else {
            columnRepresentation += TextTools.fit("ei", 20);
        }
        return columnRepresentation;
    }


    @Override
    public String getID() {
        return "B"+this.id;
    }

    @Override
    public Type getType() {
        return Type.BLOGI;
    }
    
    @Override
    public int getLuettu() {
        if (this.luettu){
            return 1;
        }
        return 0;
    }


}