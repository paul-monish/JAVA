class Volume {
	int getVolume(int l, int h, int b) {
		return l * h * b;
	}
}

class Room {
	int l, b, h;

	public Room(int l, int h, int b) {
		this.l = l;
		this.h = h;
		this.b = b;
	}

	int volume(Volume v) {
		return v.getVolume(l, h, b);
	}

}

class RoomDemo extends Room {

	public RoomDemo(int l, int h, int b) {
		super(l, h, b);
	}

}

public class Assignment7A {

	public static void main(String[] args) {
		System.out.println("Volume= " + new RoomDemo(2, 3, 4).volume(new Volume()));
	}

}
