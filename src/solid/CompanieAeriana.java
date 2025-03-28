package solid;

interface GestionareZbor {
    void planificaZbor();
    void anuleazaZbor();
}

interface GestionarePasageri {
    void adaugaPasager();
    void stergePasager();
}

interface GestionareBilet {
    void emiteBilet();
    void anuleazaBilet();
}

interface GestionareBagaje {
    void incarcaBagaje();
    void descarcaBagaje();
}

class Pilot implements GestionareZbor {
    private String nume;
    private int oreZbor;
    
    public Pilot(String nume, int oreZbor) {
        this.nume = nume;
        this.oreZbor = oreZbor;
    }
    
    @Override
    public void planificaZbor() {
        System.out.println("Pilotul " + nume + " planifică traseul zborului");
    }
    
    @Override
    public void anuleazaZbor() {
        System.out.println("Pilotul " + nume + " anulează zborul din motive de siguranță");
    }
    
    public void verificaInstrumete() {
        System.out.println("Pilotul verifică instrumentele de zbor");
    }
}

class Steward implements GestionarePasageri, GestionareBagaje {
    @Override
    public void adaugaPasager() {
        System.out.println("Stewardul înregistrează un nou pasager");
    }
    
    @Override
    public void stergePasager() {
        System.out.println("Stewardul elimină un pasager din listă");
    }
    
    @Override
    public void incarcaBagaje() {
        System.out.println("Stewardul încarcă bagajele în avion");
    }
    
    @Override
    public void descarcaBagaje() {
        System.out.println("Stewardul descarcă bagajele la destinație");
    }
}

class AgentCheckIn implements GestionareBilet {
    @Override
    public void emiteBilet() {
        System.out.println("Agentul emite biletul pentru pasager");
    }
    
    @Override
    public void anuleazaBilet() {
        System.out.println("Agentul anulează biletul la cererea pasagerului");
    }
}

// ========== Servicii (DIP) ==========
interface ServiciuRaportZbor {
    void genereazaRaport();
}

class ServiciuRaportPilot implements ServiciuRaportZbor {
    private Pilot pilot;
    
    public ServiciuRaportPilot(Pilot pilot) {
        this.pilot = pilot;
    }
    
    @Override
    public void genereazaRaport() {
        System.out.println("Raport pilot: " + pilot.toString());
    }
}

class Servicii {
    public static ServiciuRaportZbor creazaServiciu(GestionareZbor GestionareZbor) {
        if (GestionareZbor instanceof Pilot) {
            return new ServiciuRaportPilot((Pilot)GestionareZbor);
        }
        throw new IllegalArgumentException("Tip necunoscut pentru raport");
    }
}

class ControllerZbor {
    private final ServiciuRaportZbor serviciuRaport;
    
    public ControllerZbor(ServiciuRaportZbor serviciuRaport) {
        this.serviciuRaport = serviciuRaport;
    }
    
    public void executaOperatiuni(GestionareZbor GestionareZbor) {
        GestionareZbor.planificaZbor();
        serviciuRaport.genereazaRaport();
    }
}

public class CompanieAeriana {
    public static void main(String[] args) {

        //S
        Pilot pilot = new Pilot("Ionescu", 1500);
        Steward steward = new Steward();
        AgentCheckIn agent = new AgentCheckIn();

        //O
        ServiciuRaportZbor serviciuPilot = Servicii.creazaServiciu(pilot);
        pilot.verificaInstrumete();
        agent.anuleazaBilet();

        //L
        ControllerZbor controller = new ControllerZbor(serviciuPilot);
        controller.executaOperatiuni(pilot);

        //I
        steward.adaugaPasager();
        steward.incarcaBagaje();

        //D
        agent.emiteBilet();

    }
}