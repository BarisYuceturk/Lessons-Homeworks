package toyCar;

public class ToyCar {
	
	
	private int batteryCapacity;
	public int distanceX;
	public int distanceY;

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	private void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getDistanceX() {
		return distanceX;
	}

	public void setDistanceX(int distanceX) {
		this.distanceX = distanceX;
	}

	public int getDistanceY() {
		return distanceY;
	}

	public void setDistanceY(int distanceY) {
		this.distanceY = distanceY;
	}

	public void moveOnX() {

		if (this.batteryCapacity == 0) {
			System.err.println("You run out of battery! Please recharge.");
		} else if (this.batteryCapacity > 0 && this.batteryCapacity <= 100) {
			this.distanceX = this.distanceX + 1;
			System.out.println("Your point on the coordinate system is: " + getDistanceX() + "," + getDistanceY());
			remainingBattery();
		}
	}

	public void moveOnY() {
		if (this.batteryCapacity == 0) {
			System.err.println("You run out of battery! Please recharge.");
		} else if (this.batteryCapacity > 0 && this.batteryCapacity <= 100) {
			this.distanceY = this.distanceY + 1;
			System.out.println("Your point on the coordinate system is: " + getDistanceX() + "," + getDistanceY());
			remainingBattery();
		}
	}

	private void remainingBattery() {

		this.batteryCapacity = this.batteryCapacity - 1;

	}

	public void rechargeBattery() {

		if (this.batteryCapacity == 100) {
			System.err.println("Your car is already fully charged! ");
		} else {
			setBatteryCapacity(100);
			System.out.println("You charged your car and it is now: " + getBatteryCapacity());
		}
	}

	
	public void showBattery() {
		System.out.println("Your remaining battery is: " +getBatteryCapacity());
		if(getBatteryCapacity() <= 25) {
			System.err.println("You should better charge your car!");
		}else {
			System.out.println("Everything seems fine for now!");
		}
		
	}
	
	public ToyCar() {
		super();
	}

	public ToyCar(int batteryCapacity, int distanceX, int distanceY) {
		super();
		this.batteryCapacity = batteryCapacity;
		this.distanceX = distanceX;
		this.distanceY = distanceY;
	}

	
}
