public class Dancer extends Performer {

	private DanceStyle style;
	
	public Dancer (int id, DanceStyle style) {
		super.id = id;
		this.style = style;
	}
	
	public void perform () {
		System.out.println(style + " - " + id + " - dancer");
	}
}
