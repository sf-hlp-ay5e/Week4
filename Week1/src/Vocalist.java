public class Vocalist extends Performer {
	private MusicalKey key;
	
	public Vocalist(int id, MusicalKey key) {
		super.id = id;
		this.key = key;
	}
	
	public void perform () {
		System.out.println("I sing in the key of - " + key + " - " + id);
	}
	
	public void perform (int volume) {
		System.out.println("I sing in the key of - " + key + " - at the volume " + volume + " - " + id);
	}
}
