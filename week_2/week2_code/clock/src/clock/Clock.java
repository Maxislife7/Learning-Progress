package clock;

public class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display second = new Display(60);
	
	public Clock(int a, int b, int c) {
		hour.value = a;
		minute.value = b;
		second.value = c;
		
	}
	
	public void tick() {
		second.increase();
		if (second.getValue()==0) {
			minute.increase();
			if (minute.getValue()==0) {
				hour.increase();
			}
		}
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d",hour.getValue(),minute.getValue(),second.getValue());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
