import java.util.Arrays;
import java.util.Comparator;

public class Test {

	public static void main2(String[] args) {
		int iArr[] = {0};
		incInt(iArr);
		System.out.println(iArr[0]);
	}
	
	public static void incInt(int[] iArr) {
		iArr[0] = iArr[0] + 1;
	}

}
