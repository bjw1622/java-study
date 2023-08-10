package tv;

public class TV {
	private int channel; // 1 ~ 255 넘으면 rotate
	private int volume; // 0 ~ 100
	private boolean power;

	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void power(boolean on) {
		power = on;
	}

	public void channel(boolean up) {
		if(up == true) {
			
		}
	}

	// 오버 로딩x
	public void channel(int i) {

	}

	public void volume(int i) {

	}

	public void volume(boolean up) {

	}

	public void status() {
		System.out.println(
				"TV[power = " + (power ? "ON" : "OFF") + ", channel = " + channel + ", volume = " + volume + "]");
	}

}
