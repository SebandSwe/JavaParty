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

    void addGuest(Person guest, boolean hasPaid) {
        guests.put(guest, hasPaid);
    }

    void pay(Person guest) {
        // Din kod här
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
        // Din kod här
    }
}
