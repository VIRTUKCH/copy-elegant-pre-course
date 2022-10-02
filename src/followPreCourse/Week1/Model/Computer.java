package followPreCourse.Week1.Model;

public class Computer {
	private int numberOfComputer;
	public Computer() {
		while(!isNumberSuitable(this.numberOfComputer)) {
			this.numberOfComputer = (int) (Math.random() * 899) + 101;
		}
	}
	
	private boolean isNumberSuitable(int computerNumber) {
		int hundred = this.numberOfComputer / 100;
		int ten = (this.numberOfComputer / 10) % 10;
		int one = this.numberOfComputer % 10;
		
		return (hundred == ten || hundred == one || ten == one) ? false : true;
//		return !(hundred == ten || hundred == one || ten == one); // 한눈에 들어오는 코드가 더 중요할까
	}
}
