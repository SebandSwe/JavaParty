class GuestToStudent extends Person{
	Student host;
	public GuestToStudent(String name){
		super(name);
	}
	public void setHost(Student host){
		this.host = host;
	}
}