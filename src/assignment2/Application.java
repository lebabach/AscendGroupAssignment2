package assignment2;

public class Application {
	public static void main(String[] str) {
		String string = "xyzABCDFzyx";// aXYZa
		System.out.println("result: " + backWards(0, string.length(), string.split("")));
	}

	public static String backWards(int index, int n, String[] str) {
		if (index <= (n - 1) / 2 && str[index].equals(str[n - 1 - index]) && n > 1 && !str[index].equals(str[index].toUpperCase())&& !str[n - 1 - index].equals(str[n - 1 - index].toUpperCase())) {
			return str[index] + backWards(index + 1, n, str);
		} else {
			return "";
		}
	}
}
