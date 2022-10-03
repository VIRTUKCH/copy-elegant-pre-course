/*
 * Model과 MVC패턴
 * 1. Model은 Controller와 View에 의존해서는 안된다. - import 금지
 * 2. View는 Model에만 의존해야 하며, Controller에는 의존하면 안된다.
 * 3. View가 Model로부터 데이터를 받을 때에는, 사용자마다 다르게 보여주어야 하는 데이터만 받아야 한다.
 * 4. View가 Model로부터 데이터를 받을 때, 반드시 Controller에서 받아야 한다.
 */
package followPreCourse.Week1.Model;

public class User {
	private int guessingNumber;
	public User(int guessingNumber) {
		this.guessingNumber = guessingNumber;
		System.out.println("시험 출력 : " + this.guessingNumber);
	}
	public User() {}
	public void setGuessNumberOfComputer(int guessingNumber) {
		this.guessingNumber = guessingNumber;
	}
}
