/*
 * Controller와 MVC 패턴
 * 1. Controller 내에는 Model과 View의 코드가 있어도 된다.
 * 2. View가 Model로부터 데이터를 받을 때, 반드시 Controller에서 받아야 한다.
 */
package followPreCourse.Week1.Contorller;

import java.util.InputMismatchException;
import java.util.Scanner;

import followPreCourse.Week1.Model.Computer; // public class라고 하더라도 같은 package가 아니면 import는 해줘야 한다.
import followPreCourse.Week1.Model.User;
import followPreCourse.Week1.View.UI;

public class NumberBaseball {
	public static void main(String[] args) { // main이 하나밖에 없으면 알아서 그 package에서 돌린다
		Computer computer = new Computer();
		UI.introduceGame();
		
		initGuessingNumber();
	}

	private static void initGuessingNumber() {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		UI.enterGuessingNumber(); // 예측하는 상대방의 숫자를 입력해 주세요 :
		
		// 예외처리를 반복적으로 할 수 있는 방법에 대해 생각해보자.
		int inputInThisTime = 0;
		try {
			inputInThisTime = sc.nextInt();
		} catch (InputMismatchException e) {
			UI.inputIsNotValidMent();
			inputInThisTime = sc.nextInt();
		}
		while(!isInputValid(inputInThisTime)) { // User의 숫자 입력이 정상이지 않은 동안에 + 
			inputInThisTime = sc.nextInt();
			user.setGuessNumberOfComputer(inputInThisTime);
		}
		
//		System.out.println();
//		System.out.println("확인차 출력 : inputInThisTime : " + inputInThisTime);
	}

	private static boolean isInputValid(int nextInt) {
		if(nextInt < 100 || nextInt > 999) {
			UI.inputIsNotValidMent();
			return false;
		}
		return true;
	}
}
