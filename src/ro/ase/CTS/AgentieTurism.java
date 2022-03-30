package ro.ase.CTS;

import java.util.List;

public class AgentieTurism {
    private String locatie;
    private int nrAngajati;
    private String denumire;
    private List<Serviciu> servicii;
    private List<Client> clienti;
    private static AgentieTurism instance= null;

    public static synchronized AgentieTurism getInstance(String locatie, int
            nrAngajati,String denumire,List<Serviciu> servicii,List<Client> clienti){

        if(instance==null){
            try {
                instance = new AgentieTurism( locatie,  nrAngajati, denumire, servicii,clienti);
            } catch (InvalidInput e) {
                e.printStackTrace();
            }
        }
        return instance;
    }

    private AgentieTurism(String locatie, int nrAngajati, String denumire, List<Serviciu> servicii, List<Client> clienti) throws InvalidInput {
        if(locatie.length()>5){
            this.locatie = locatie;
        }else{
            throw new InvalidInput();
        }
        if(nrAngajati > 1){
            this.nrAngajati = nrAngajati;
        }else{
            throw new InvalidInput();
        }
        if(denumire.length()>5){
            this.denumire = denumire;
        }else{
            throw new InvalidInput();
        }
        this.servicii = servicii;
        this.clienti = clienti;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public List<Serviciu> getServicii() {
        return servicii;
    }

    public void setServicii(List<Serviciu> servicii) {
        this.servicii = servicii;
    }

    public List<Client> getClienti() {
        return clienti;
    }

    public void setClienti(List<Client> clienti) {
        this.clienti = clienti;
    }

    public List<Serviciu> adaugareServiciu(Serviciu serviciu){
        servicii.add(serviciu);
        return servicii;
    }

    public List<Client> adaugareClient(Client client){
        clienti.add(client);
        return clienti;
    }

}
