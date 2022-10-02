package followPreCourse.Week1.Model;

public class Computer {
	private int computerNumber;
	public Computer() {
		while(!isNumberSuitable(this.computerNumber)) {
			this.computerNumber = (int) (Math.random() * 899) + 101;
			System.out.println(this.computerNumber); // 출력되는 코드를 확인한다
		}
	}
	
	private boolean isNumberSuitable(int computerNumber) {
		int hundred = this.computerNumber / 100;
		int ten = (this.computerNumber / 10) % 10;
		int one = this.computerNumber % 10;
		
		return (hundred == ten || hundred == one || ten == one) ? false : true;
//		return !(hundred == ten || hundred == one || ten == one); // 한눈에 들어오는 코드가 더 중요할까
	}
}
