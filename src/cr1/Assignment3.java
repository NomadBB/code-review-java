package cr1;

public class Assignment3 {

   public static void main(String[] args) {
      int[] arr = new int[10]; //배열은 선언 및 int 타입의 값 10개를 저장할 배열 생성
      int negSum = 0; //음수의 합 초기화
      int posSum = 0; //양수의 합 초기화
      System.out.print("배열 : "); //배열 : 이라는 문자 출력
      
      //length는 배열의 길이
      for (int i=0; i<arr.length; i++) {//i가 0일때 array[0]의 값, i가 1일때 array[1]의 값~
    	 
    	 //math.random->범위를 지정한 난수 생성(-10~10까지의 랜덤값을 배열에 저장) 
    	 //math클래스의 random()함수의 리턴값은 double이므로
         //int 타입으로 형변환을 해줘야 한다.
         arr[i] = (int)(Math.random()*21)-10;

         if (arr[i] < 0) //if문->만약 배열이 0보다 작다면
            negSum += arr[i]; //음수 배열의 합
         else //아니라면
            posSum += arr[i]; //양수 배열의 합
         System.out.print(arr[i] + " "); //배열 출력->줄바꿈을 하지 않을 것이므로 print사용
      }
      System.out.println();
      System.out.println("음수합 : " + negSum); //음수합 출력
      System.out.println("양수합 : " + posSum); //양수합 출력
   }

}