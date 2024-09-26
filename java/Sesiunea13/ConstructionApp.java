package Sesiunea13;
//Create class design (classes, interfaces, fields, whatever you need) to build the OOP concept of an application that
// can be used by the constructor engineer and project manager to track the construction of a building,
// from start to finish, with following requirements:
//Roles
//      Admin - can bring changes to the application
//      User - manager or constructor engineer who can observe the progress of the construction or interact with the data
//      The manager can see all company’s employee, available construction resources and needed resources
//      The application should take into account the fact that all the employees are working in teams, and each team has a leader;
//      The manager should be able to see each team structure (members and team lead) and he should be able to change the team structure
//      The manager can change employee position (from team member to team lead)
//      The application should be able to send emails to the employees with company announcements

import java.util.ArrayList;
import java.util.List;

public class ConstructionApp {
    public static void main(String... args) {
        Angajat angajat1 = new Angajat("Maria", "Inginer");
        Angajat angajat2 = new Angajat("Ioan", "Sofer buldoescavator");
        Angajat angajat3 = new Angajat("Vasile", "Manager de santier");

        Echipa echipa1 = new Echipa(angajat3);
        echipa1.adaugaMembru(angajat1);
        echipa1.adaugaMembru(angajat2);
        echipa1.adaugaMembru(angajat3);

        List<Angajat> angajati = new ArrayList<>();
        angajati.add(angajat1);
        angajati.add(angajat2);
        angajati.add(angajat3);

        List<Echipa> echipe= new ArrayList<>();
        echipe.add(echipa1);

        Manager manager = new Manager(angajati, echipe);
        manager.veziStructuraEchipelor();
        manager.veziTotiAngajati();
        manager.schimbaPozitiaAngajatului(angajat1, "Inginer senior");
        manager.schimbaStructuraEchipei(echipa1,angajat1);
        manager.veziStructuraEchipelor();
        manager.trimiteAnunt("Structura echipelor sa schimbat!");

    }

}
// clasa Angajat
class Angajat{
    private String nume;
    private String pozitie;

    public Angajat(String nume, String pozitie){
        this.nume = nume;
        this.pozitie = pozitie;
    }

    public String getNume() {
        return nume;
    }

    public String getPozitie() {
        return pozitie;
    }

    public void setPozitie(String pozitie) {
        this.pozitie = pozitie;
    }
}
// clasa Echipa
class Echipa{
    private Angajat lider;
    private List<Angajat> membri;

    public Echipa(Angajat lider){
        this.lider = lider;
        this.membri = new ArrayList<>();
    }
    public void adaugaMembru(Angajat membru){
        membri.add(membru);
    }
    public void eliminaMembru(Angajat membru){
        membri.remove(membru);
    }

    public void setLider(Angajat lider) {
        this.lider = lider;
    }

    public Angajat getLider() {
        return lider;
    }

    public List<Angajat> getMembri() {
        return membri;
    }
}
// clasa Administrator
class Administrator{
    public void modificaAplicatia(){
        System.out.println("Administratorul modifica aplicatia!");
    }
}
// clasa Utilizator
class Utilizator{
    public void observaProgresul(){
        System.out.println("Utilizatorul observa progresul constructiei.");
    }
    public void interactioneazaCuDatele(){
        System.out.println("Utilizatorul interactioneaza cu datele constructiei.");
    }
}
// clasa Manager
class Manager extends Utilizator{
    private List<Angajat> angajati;
    private List<Echipa> echipe;

    public Manager(List<Angajat> angajati, List<Echipa> echipe){
        this.angajati = angajati;
        this.echipe = echipe;
    }
    public void veziTotiAngajati(){
        System.out.println("Managerul poate vedea lista cu angajati:");
        for (Angajat angajat : angajati){
            System.out.println(angajat.getNume() + " - " + angajat.getPozitie() + ".");
        }
    }
    public void veziStructuraEchipelor(){
        for (Echipa echipa : echipe){
            System.out.println("Liderul exhipei este: " + echipa.getLider().getNume());
            System.out.println("Membrii echipei sunt: ");
            for (Angajat membru : echipa.getMembri()){
                System.out.println(" - " + membru.getNume());
            }
        }
    }
    public void schimbaStructuraEchipei(Echipa echipa, Angajat nouLider){
        echipa.setLider(nouLider);
        System.out.println("Structura echipei a fost schimbata! Noul lider este: " + nouLider.getNume());
    }
    public void schimbaPozitiaAngajatului(Angajat angajat, String nouaPozitie){
        angajat.setPozitie(nouaPozitie);
        System.out.println(angajat.getNume() + " este acuma " + nouaPozitie);
    }
    public void trimiteAnunt(String mesaj){
        System.out.println("Trimiterea informatiilor pe email catre toti angajati firmei: " + mesaj);
    }
}
