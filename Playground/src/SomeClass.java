
public class SomeClass {
	private String color;
	private boolean isBordered;
	
	public SomeClass(String color, boolean isBordered) {
		setColor(color);
		setBordered(isBordered);
	}
	public SomeClass(String color) {
		this(color, true);
		if (color == null) {
			this.color = "Pink";
		}
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isBordered() {
		return isBordered;
	}
	public void setBordered(boolean isBordered) {
		this.isBordered = isBordered;
	}
}
