package followPreCourse.Week1.Contorller;

import followPreCourse.Week1.Model.Computer; // public class라고 하더라도 같은 package가 아니면 import는 해줘야 한다.
import followPreCourse.Week1.Model.User;
import followPreCourse.Week1.View.UI;

public class NumberBaseball {
	public static void main(String[] args) { // main이 하나밖에 없으면 알아서 그 package에서 돌린다
		Computer computer = new Computer();
		UI.introduceGame();
		
		User user = new User();
		user.setGuessNumberOfComputer();
	}
}
