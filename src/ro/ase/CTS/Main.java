package ro.ase.CTS;

public class Main {
    public static void main(String[] args){
        AgentieTurism agentie = AgentieTurism.getInstance("Bucuresti",3,
                "Travel now",null,null);
        System.out.println("Agentie 1: "+agentie.getNrAngajati());

        AgentieTurism agentie2 = AgentieTurism.getInstance("Constanta",10,
                "Travel",null,null);
        System.out.println("Agentie 2: "+agentie2.getNrAngajati());

    }
}

