
public class Main {
	public static void main(String[] args) {
		int i = 3;
		int sum = 0;
		for(i = 5; i<=9; i+=2) {
			i--;
			sum+=i;
		}
		System.out.println(i);  // 10
		System.out.println(sum);  // 30
	}
}
