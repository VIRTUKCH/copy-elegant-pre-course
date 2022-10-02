package followPreCourse.Week1.View;

public class UI {
	public static void introduceGame() {
		printStar();
		System.out.println("숫자 야구를 시작합니다.");
		System.out.println("상대방의 숫자는 랜덤으로 만들었습니다.");
		enterGuessNumberOfComputer();
	}
	public static void printStar() {
		System.out.println("*********************************");
	}
	public static void enterGuessNumberOfComputer() {
		System.out.print("예측하는 상대방의 숫자를 입력해 주세요 : ");
	}
	public static void inputIsNotValidMent() {
		System.out.print("입력하신 숫자의 형식이 잘못되었습니다. 세 자리 숫자의 자연수를 입력해주세요 : ");
	}
}
