package Day11_06;

public class MethodEx01 {

	public static void main(String[] args) {
		// 메소드 호출문
		choki(); // 비스듬히 누우면 메소드호출되었다는 뜻
		choongyo();
		chool();
		System.out.println(chool());

	}// main - end

	private static int chool() {
		System.out.println("결과출력");
		return 0;
	}// chool() 정의문 - end

	private static void choongyo() {
		System.out.println("3의 배수 구하기");
	} // choongyo() 정의문 - end

	// 메소드 정의문
	private static void choki() {
		System.out.println("초기치는 자리는 여기라는~~");
	}// choki() 정의문 - end

}// class - end
