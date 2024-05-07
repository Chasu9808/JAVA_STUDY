package ex_240426;

public class CallByRefMethodArrayTest {

	// pdf_ 37 소스 코드 복붙 내용.
	// 공백 -> 콤마
	static void replaceSpace(char a[]) {
		for (int i = 0; i < a.length; i++)
			if (a[i] == ' ')
				a[i] = ',';
	}

	// 배열 출력용 메서드
	static void printCharArray(char a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}

	public static void main(String args[]) {
		char[] charArray = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		// c : 참조형 변수 , c 임의 메모리 위치 주소값 : 0x100
		printCharArray(charArray);
		replaceSpace(charArray);
		printCharArray(charArray);
	}

}
