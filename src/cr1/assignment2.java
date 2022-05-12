package cr1;

//while문 사용
public class assignment2 {

	public static void main(String[] args) {
		int i = 1; //변수 i 초기화
		int sum = 0; //합계를 담을 변수 sum 초기화
		while (i<=100) { //조건식->7번의 i가 100보다 작거나 같으므로 true(i가 100이 될 때까지 반복)
			System.out.println(i); //true이므로 1이 출력->100까지 반복 출력, 101이 되면 false이므로 탈출
			i++; //변수 i의 값이 1씩 증가
			if (i%3 == 0) { //i는 3의 배수
				sum += i; //1부터 100까지의 수 중에서 3의 배수를 누적해서 더하기
			}
		}
		System.out.println("3의 배수의 합 = "+sum);
	}
}