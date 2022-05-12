package cr1;

//for문 사용
public class assignment1 {

	public static void main(String[] args) {
		int sum = 0; //합계를 담을 변수 sum 초기화
		for(int i=1; i<=100; i++) { //변수 i 초기화; 조건식->i가 100보다 작거나 같음; 변수 i 값이 1씩 증가
			System.out.println(i); //true이므로 1이 출력->100까지 반복 출력, 101이 되면 false이므로 탈출
			if (i%3 == 0) { //i는 3의 배수
				sum += i; //1부터 100까지의 수 중에서 3의 배수를 누적해서 더하기
			
		
			}
		}
		System.out.println("3의 배수의 합 = "+sum); //3의 배수의 합 출력
	}
}
