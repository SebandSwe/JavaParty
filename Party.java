import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

class Party {
    private String partyName;
    private int maxGuests;
    private Money entranceFee;
    private Map<Person, Boolean> guests;
    private Map<Sponsor, Money> sponsors;

    public static void main(String[] args) {
        Party party = new Party("IT-phesten",70,new Money(75));
        Student nils = new Student("Nils");
        party.addStudent(nils);
        party.addGuest(new Student("Hasse"));
        party.pay(nils);
        party.addGuest(new Student("Lotta"),true);
        party.addGuest(new Student("Lisa", new GuestToStudent("Hasse")));
        party.addSponsor(new Sponsor("carfox"),new Money(3000));
        party.addSponsor(new Sponsor("FRA"),new Money(6000));
        party.print();

    }

    Party(String partyName, int maxGuests, Money entranceFee) {
        this.partyName = partyName;
        this.maxGuests = maxGuests;
        this.entranceFee = entranceFee;
        this.guests = new HashMap<Person, Boolean>();
        this.sponsors = new HashMap<Sponsor, Money>();
    }
    
    void addGuest(Person guest) {
      addGuest(guest, false);
    }

    void addStudent(Student student){
    	addGuest(student);
    	addGuest(student.getGuest());
    }
    
    void addGuest(Person guest, boolean hasPaid) {
        guests.put(guest, hasPaid);
    }

    void pay(Person guest) {
        try{
        if(hasPaid(guest))
            System.out.println("Person already paid.");
        guests.put(guest,true);
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    boolean hasPaid(Person guest) throws NoSuchPersonException {
        if(guests.containsKey(guest)) {
            return guests.get(guest);
        } else {
            throw new NoSuchPersonException();
        }
    }

    void addSponsor(Sponsor sponsor, Money amount) {
        sponsors.put(sponsor, amount);
    }
    
    public void addSponsor(String name, double money)
    {
        this.addSponsor(new Sponsor(name), new Money(money));
    }
    
    public void print() {
        int counter = 0;
        System.out.print(partyName);
        System.out.print(" i samarbete med ");
        for(Entry<Sponsor,Money> e : sponsors.entrySet()){
            if(counter < 1){
                System.out.print(e.getKey());
                counter++;
            }
            else{
                System.out.print(" och ");
                System.out.print(e.getKey());
            }
        }
        System.out.println("\nPris " + entranceFee + " per gäst,");
        System.out.println("Max " + maxGuests + "gäster");
        System.out.println("Anmälda gäster: ");
        for(Entry<Person, Boolean> e : guests.entrySet()){
            if(e.getKey() != null){
            System.out.print(e.getKey());
            if(e.getValue())
                System.out.println(" (har betalat)");
            else
                 System.out.println(" (har inte betalat)");
        }
        }
    }
}
