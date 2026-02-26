package hu.szamalk.modell;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public abstract class EsemenyModell {
    private String esemenyAzon;
    private String kapcsolatTarto;
    private LocalDate datum;
    private LocalTime kezdesOraPerc;
    private  LocalTime vegeOraPerc;
    private int teremSzama;
    private int resztvevokSzama;
    private String statusz;
    private boolean tipus;
    private boolean szekKellE;
    private int szekekSzama;
    private boolean asztalKellE;
    private int asztalokSzama;


    protected EsemenyModell(String esemenyAzon) {
        this.esemenyAzon = Objects.requireNonNull(esemenyAzon, "esemenyAzon nem lehet null");
    }

    public abstract String getTipusNev();
    public abstract boolean isSzinpados();


    public String getEsemenyAzon() {
        return esemenyAzon;
    }
    public String getKapcsolatTarto() {
        return kapcsolatTarto;
    }
    public LocalDate getDatum() {
        return datum;
    }
    public LocalTime getKezdesOraPerc() {
        return kezdesOraPerc;
    }
    public LocalTime getVegeOraPerc() {
        return vegeOraPerc;
    }
    public int getTeremSzama() {
        return teremSzama;
    }
    public int getResztvevokSzama() {
        return resztvevokSzama;
    }
    public String getStatusz() {
        return statusz;
    }
    public int getSzekekSzama() {
        return szekekSzama;
    }
    public int getAsztalokSzama() {
        return asztalokSzama;
    }



    public void setKapcsolatTarto(String kapcsolatTarto) {
        this.kapcsolatTarto = kapcsolatTarto;
    }
    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }
    public void setKezdesOraPerc(LocalTime kezdesOraPerc) {
        this.kezdesOraPerc = kezdesOraPerc;
    }
    public void setVegeOraPerc(LocalTime vegeOraPerc) {
        this.vegeOraPerc = vegeOraPerc;
    }
    public void setTeremSzama(int teremSzama) {
        this.teremSzama = teremSzama;
    }
    public void setResztvevokSzama(int resztvevokSzama) {
        this.resztvevokSzama = resztvevokSzama;
    }
    public void setStatusz(String statusz) {
        this.statusz = statusz;
    }
    public void setTipus(boolean tipus) {
        this.tipus = tipus;
    }
    public void setSzekKellE(boolean szekKellE) {
        this.szekKellE = szekKellE;
    }
    public void setSzekekSzama(int szekekSzama) {
        this.szekekSzama = szekekSzama;
    }
    public void setAsztalKellE(boolean asztalKellE) {
        this.asztalKellE = asztalKellE;
    }
    public void setAsztalokSzama(int asztalokSzama) {
        this.asztalokSzama = asztalokSzama;
    }


    public boolean isTipus() {
        return tipus;
    }
    public boolean isSzekKellE() {
        return szekKellE;
    }
    public boolean isAsztalKellE() {
        return asztalKellE;
    }


    @Override
    public String toString() {
        return "EsemenyModell{" +
                "esemenyAzon='" + esemenyAzon + '\'' +
                ", kapcsolatTarto='" + kapcsolatTarto + '\'' +
                ", datum=" + datum +
                ", kezdesOraPerc=" + kezdesOraPerc +
                ", vegeOraPerc=" + vegeOraPerc +
                ", teremSzama=" + teremSzama +
                ", resztvevokSzama=" + resztvevokSzama +
                ", statusz='" + statusz + '\'' +
                ", tipus=" + tipus +
                ", szekKellE=" + szekKellE +
                ", szekekSzama=" + szekekSzama +
                ", asztalKellE=" + asztalKellE +
                ", asztalokSzama=" + asztalokSzama +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EsemenyModell)) return false;
        EsemenyModell that = (EsemenyModell) o;
        return Objects.equals(esemenyAzon, that.esemenyAzon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(esemenyAzon);
    }







}
