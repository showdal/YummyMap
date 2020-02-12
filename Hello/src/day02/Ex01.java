package day02;

public class Ex01 {
	public static void main(String[] args) {
		
		// 1. 밑변이 5이고 높이가 3인 삼각형의 넓이를 구해서 출력하세요.
		double width = 5;
		double height = 3;
		double soo = 0.5;
		double area1 = width * height * soo;
		
		
		// 2. 가로가5, 세로가 7인 사각형의 넓이를 구해서 출력하세요.
		// 변수 선언과 초기화
		int garo = 5;
		int sero = 7;
		int area2 = garo * sero;
		
		
		// 3. 반지름이 2인 원의 둘레를 구해서 출력하세요.
		// 변수 선언과 초기화
		int rad = 2;
		double pi = 3.14;
		double around = 2 * rad * pi;
		
		
		//주의 각각의 데이터는 변수를 만들고 변수를 연산해서 사용하세요.
	
		
		System.out.println("1. 밑변이 " + width + "이고 높이가 " + height + "인 삼각형의 면적은 " + area1 + "입니다.");
		System.out.println("2. 가로가 " + garo + "이고 세로가 " + sero + "인 사각형의 넓이는 " + area2 + "입니다.");
		System.out.println("3. 반지름이 " + rad + "인 원의 둘레는 " + sero + "인 원의 둘레는 " + around + "입니다.");
	}
}
