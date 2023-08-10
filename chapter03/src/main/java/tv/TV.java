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
		if (up == true) {
				if(this.channel == 255) {
					this.channel = 1;
				}
				else {
					this.channel += 1;
				}
		}
	}

	// 오버 로딩x
	public void channel(int i) {
		if(i == 0) {
			this.channel = 255;
		}
		else {
			this.channel = i;
		}
	}

	public void volume(int i) {
		if(i > 100) {
			this.volume = 0;
		}
		else {
			this.volume = i;
		}
	}

	public void volume(boolean up) {
		if(up == false) {
			if(this.volume == 0) {
				this.volume = 100;
			}
			else {
				this.volume -= 1;
			}
		}

	}

	public void status() {
		System.out.println(
				"TV[power = " + (power ? "ON" : "OFF") + ", channel = " + channel + ", volume = " + volume + "]");
	}

}
