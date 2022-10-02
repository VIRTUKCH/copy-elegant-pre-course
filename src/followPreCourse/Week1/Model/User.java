package followPreCourse.Week1.Model;

import java.util.Scanner;

import followPreCourse.Week1.View.UI;

public class User {
	private int guessNumberOfComputer;
	public User() {}
	public void setGuessNumberOfComputer(int guessNumberOfComputer) {
		this.guessNumberOfComputer = guessNumberOfComputer;
	}
	public void setGuessNumberOfComputer() {
		Scanner sc = new Scanner(System.in);
		this.guessNumberOfComputer = sc.nextInt();
		while(!isInputValid(this.guessNumberOfComputer)) {
			this.guessNumberOfComputer = sc.nextInt();
		}
		sc.close();
		
		System.out.println(); // 확인차 만들어 봄
		System.out.println("<확인차 출력> - User의 입력값 : " + guessNumberOfComputer);
	}
	private boolean isInputValid(int nextInt) {
		if(nextInt < 100 || nextInt > 999) {
			UI.inputIsNotValidMent();
			return false;
		}
		return true;
	}
}
