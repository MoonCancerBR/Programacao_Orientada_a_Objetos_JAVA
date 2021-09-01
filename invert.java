import java.util.Scanner;
public class invert 
	{
		public static String inverter (String a) 
			{
				String temp = "";
				for (int i = a.length() - 1; i >= 0; i--)
					temp += a.charAt(i);
				return temp;
			}
		public static void main(String[] args) 
			{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite uma palavra para inverter");
			String palavra = scanner.next();
			System.out.println(invert.inverter(palavra));
			}
	}
