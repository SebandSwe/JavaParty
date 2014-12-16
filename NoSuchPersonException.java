class NoSuchPersonException extends Exception{

	public NoSuchPersonException(){
		super("Personen kunde inte hittas.");
	}
}