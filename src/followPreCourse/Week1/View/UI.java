/*
 * 1. Model은 Controller와 View에 의존해서는 안된다.
 * 2. View는 Model에만 의존해야 하며, Controller에 의존하면 안된다. - Controller의 코드가 있으면 안된다.
 * 3. View가 Model로부터 데이터를 받을 때에는, 사용자마다 다르게 보여주어야 하는 데이터만 받아야 한다.
 * 4. View가 Model로부터 데이터를 받을 때, 반드시 Controller에서 받아야 한다.
 */
package followPreCourse.Week1.View;

public class UI {
	public static void introduceGame() {
		printStar();
		System.out.println("숫자 야구를 시작합니다.");
		System.out.println("상대방의 숫자는 랜덤으로 만들었습니다.");
	}
	public static void printStar() {
		System.out.println("*********************************");
	}
	public static void enterGuessingNumber() {
		System.out.print("예측하는 상대방의 숫자를 입력해 주세요 : ");
	}
	public static void inputIsNotValidMent() {
		System.out.print("입력하신 숫자의 형식이 잘못되었습니다. 세 자리 숫자의 자연수를 입력해주세요 : ");
	}
}
