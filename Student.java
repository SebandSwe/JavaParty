class Student extends Person{
	Person guest;
	Student(String name){
		super(name);
	}
	Student(String name, GuestToStudent guest){
		super(name);
		this.guest = guest;
		guest.setHost(this);
	}
	public Person getGuest(){
		return guest;
	}
}