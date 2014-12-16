import java.util.Map;
import java.util.HashMap;

class Party {
    private String partyName;
    private int maxGuests;
    private Money entranceFee;
    private Map<Person, Boolean> guests;
    private Map<Sponsor, Money> sponsors;

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

    void pay(Person guest) throws NoSuchPersonException, Exception {
        if (guests.get(guest)==null)
            throw new NoSuchPersonException();
        if(hasPaid(guest))
            throw new Exception("Person already paid.");
        guests.put(guest,true);
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
        counter = 0;
        System.out.print(" Pris " + entranceFee + " per gäst,");
        System.out.print(", max " + maxGuests + "gäster");
        System.out.print(" Anmälda gäster: ");
        for(Entry<Person, Boolean> e : guests.entrySet()){
              if(counter < 1){
                System.out.print(e.getKey());
                if(e.getValue())
                    System.out.print("(har betalat)");
                else
                      System.err.print("(har inte betalat)");
                counter++;
            }
            else{
                System.out.print(", ");
                System.out.print(e.getKey());
                if(e.getValue())
                    System.out.print("(har betalat)");
                else
                      System.err.print("(har inte betalat)");
              }
        }
    }
}
