package followPreCourse.Week1.View;

public class UI {
	public static void introduceGame() {
		printStar(); // 같은 클래스 소속의 static 메서드라서 클래스 이름을 앞에 붙여주지 않아도 된다.
		System.out.println("숫자 야구를 시작합니다.");
		System.out.println("상대방의 숫자는 랜덤으로 만들었습니다.");
	}
	public static void printStar() {
		System.out.println("*********************************");
	}
}
