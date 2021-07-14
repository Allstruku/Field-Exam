
public class Field {
	public static void main(String[] args) {
		FieldExam c1 = new FieldExam();
		// FieldExam이라는 클래스를 data type으로 이용, 참조변수명, new keyword는 다음에 나오는 것이 생성자임을 알림 - 객체를 메모리에 만들어라(instance)
		FieldExam c2 = new FieldExam();	
		// 객체(instance)를 2개 만들었다
		
// 속성에 값을 넣기 - 변수명.참조변수가 참조한 객체의 속성 사용
		c1.name = "Ferrari";
		c1.number = 1234;

		c2.name = "Hyundai";
		c2.number = 1111;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		
		System.out.println(c2.name);
		System.out.println(c2.number);
	}
}
