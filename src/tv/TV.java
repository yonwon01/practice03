package tv;

public class TV {

	int channel;
	int volume;
	boolean power;

	public TV(int ch, int vol, boolean po) {
		this.channel = ch;
		this.volume = vol;
		this.power = po;

	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public void power(boolean on) {
		if (on) {
			power = true;
		} else {
			power = false;// 꺼짐
		}
	}

	public void channel(int ch) {
		if (ch >= 1 && ch <= 255)
			this.channel = ch;
		else if (ch < 1) {
			this.channel = 1;// 1번 이하는 1번체널로 고정
		} else if (ch > 255) {
			this.channel = 255;// 255번 이상은 255번 체널로 고정
		} else {
			System.out.println("잘 못 누르셨습니다.");
			this.channel = 1;// 1
		}
	}

	public void channel(boolean ch) {
		if (ch) {
			this.channel++;// true이면 체널 1 위로
		} else if (ch == false) {
			this.channel--;// false이면 체널 1 밑으로
		}
	}

	public void volume(int vol) {
		if (vol >= 0 && vol <= 100)
			this.volume = vol;
		else if (vol < 1) {
			this.volume = 0;// 0밑으로는 0 유지
		} else if (vol > 100) {
			this.volume = 100;// 100 이상은 100유지
		} else {
			System.out.println("잘 못 누르셨습니다.");
			this.volume = 1;// 1
		}
	}

	public void volume(boolean vol) {
		if (vol) {
			this.volume++;// true이면 볼륨 1 위로
		} else if (vol == false) {
			this.volume--;// false이면 볼륨 1 밑으로
		}
	}

	void status() {
		if (power) {
			System.out.println("Tv가 켜져있고 현재 체널은" + channel + "이고" + "volume은" + volume + "입니다.");
		}
		if (power == false)
			System.out.println("tv를 종료합니다.");
	}
}
