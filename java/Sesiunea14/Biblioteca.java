package Sesiunea14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Item> items;
    private List<Imprumut> imprumuturi;

    public Biblioteca(List<Item> items, List<Imprumut> imprumuturi) {
        this.items = new ArrayList<>();
        this.imprumuturi = new ArrayList<>();
    }

    public void adaugaItem(Item item) {
        items.add(item);
    }

    public void eliminaItem(Item item) {
        items.remove(item);
    }
}

abstract class Item {
    private String titlu;
    private int anPublicare;

    public Item(String titlu, int anPublicare) {
        this.titlu = titlu;
        this.anPublicare = anPublicare;
    }

    public String getTitlu() {
        return titlu;
    }

    public int getAnPublicare() {
        return anPublicare;
    }

    abstract String getDetalii();
}

interface Imprumutabil {
    void imprumuta();

    void returneaza();

    boolean esteDisponibil();
}

class Carte extends Item implements Imprumutabil {
    private String autor;
    private boolean disponibil;
    private String numeCititor;
    private LocalDate dataReturnare;

    public Carte(String titlu, int anPublicare, String autor) {
        super(titlu, anPublicare);
        this.autor = autor;
        this.disponibil = true;
    }

    @Override
    String getDetalii() {
        return "";
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public void imprumuta() {

    }

    @Override
    public void returneaza() {

    }

    @Override
    public boolean esteDisponibil() {
        return true;
    }
}

class Revista extends Item implements Imprumutabil {
    private int numarEditie;
    private boolean disponibil;
    private String numeCitiror;
    private LocalDate dataReturnare;

    public Revista(String titlu, int anPublicare, String numeCitiror) {
        super(titlu, anPublicare);
        this.numeCitiror = numeCitiror;
        this.disponibil = true;
    }

    @Override
    String getDetalii() {
        return "";
    }

    public int getNumarEditie() {
        return numarEditie;
    }

    @Override
    public void imprumuta() {

    }

    @Override
    public void returneaza() {

    }

    @Override
    public boolean esteDisponibil() {
        return false;
    }
}

class Imprumut implements Imprumutabil {
    private Imprumutabil item;
    private String numeCitiror;
    private LocalDate dataImprumut;
    private LocalDate dataReturnare;

    public Imprumut(Imprumutabil item, String numeCitiror, LocalDate dataImprumut, LocalDate dataReturnare) {
        this.dataImprumut = dataImprumut;
        this.dataReturnare = dataReturnare;
        this.numeCitiror = numeCitiror;
        this.item = item;
    }

    public LocalDate getDataImprumut() {
        return dataImprumut;
    }

    public LocalDate getDataReturnare() {
        return dataReturnare;
    }

    public Imprumutabil getItem() {
        return item;
    }

    public String getNumeCitiror() {
        return numeCitiror;
    }

    @Override
    public String toString() {
        return "A fost imprumutata: " + ((Item) item).getTitlu()
                + " de catre " + numeCitiror + " la datat de " + dataImprumut + " si returnata la data de " + dataReturnare + ".";
    }

    @Override
    public void imprumuta() {

    }

    @Override
    public void returneaza() {

    }

    @Override
    public boolean esteDisponibil() {
        return false;
    }
}




