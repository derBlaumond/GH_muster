public class HelloWorldApp {
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		
		System.out.println(6); //num
		System.out.println("six"); //str
		System.out.println("1111".length()); //.length 길이문자
		
		System.out.println(6 + 2);
		System.out.println(6 - 4);
		System.out.println(6 * 2);
		System.out.println(6 / 2);
		
		System.out.println(Math.PI);
		System.out.println(Math.floor(Math.PI));
		System.out.println(Math.ceil(Math.PI));
		//Math 추가 자료 https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
		System.out.println("Hello World!!"); //" " str = Combination of Character 문자의 시작과 끝을 알려줌.
		System.out.println('H'); //' ' Character
		System.out.println("H"); //" " str, even though there is a word
		System.out.println("Hello "
				+ "World"); //"Hello World" 사이 공백에서 엔터치면 자동으로 코드에서만 줄바꿈해줌
		System.out.println("Hello \nWorld"); // \n: 출력에서 자리바꿈.
		System.out.println("Hello \"World\""); // escape of " in  print
		
		System.out.println("Hello World!!".length()); //만약 저 문자역이 엄청 길다면?
		System.out.println("Hello, [[name]] alsdkjfosvoqowejföqowkejfokasjkjyxcv and bye.".replace("[[name]]", "Drake"));
		//String 추가자료 https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
		
		int a = 1;		
		double b =1.1; //real number in Java
		String c = "Hello World";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);		
		//왜 변수를 선언해야할까? 자바와 같은 언어들은 음료수의 용기와 같아서 그 안에 들어 있는 것이 어떤 음료수라는 확신이 있어서
		//그에 맞게 바로바로 오퍼레이팅 할 수 있다.
		//굳이 a,b,c가 int 인지, double 인지 string인지 점검해볼 필요가 없다.
		
		String name = "egoing";
		System.out.println("Hello, "+name+" ... "+name+" ... "+name+"  ... bye");
		
		double VAT = 10.0;
		System.out.println(VAT);
		
		//Casting : 데이터 타입을 다른 데이터 타입으로 컨버
		double d = 1;
		System.out.println(d); //double형이기 때문에 자동으로 1.0으로 컨버팅된다.d.h. 잃어버린 값이 없다. (반대는 안됨)
				
		int e = (int) 1.1; //1.1은 더블이기 때문에 인트로 굳이 쓰고 싶다면 괄호에 인트를 넣어서 한번더 변수 e를 명시적으로 선언함.
				//왜?? 1.1 -> 1.0 으로 값의 손실이 일어나기 때문이다.
		System.out.println(e);
		String f = Integer.toString(1); //string into int Casting
		System.out.println(f.getClass()); //.getClass()
	}
}