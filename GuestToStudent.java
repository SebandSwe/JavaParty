class GuestToStudent extends Person{
	Student host;
	public GuestToStudentStuff(String name){
		super(name);
	}
	public void setHost(Student host){
		this.host = host;
	}
}