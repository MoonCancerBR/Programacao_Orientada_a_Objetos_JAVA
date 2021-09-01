import java.util.Scanner;
public class calendario 
	{
		public static void main(String[] args) 
			{	
				Scanner scanner = new Scanner(System.in);
				System.out.println("Digite uma data separado por /");
				String data = scanner.next();
				System.out.println("Dia: " + data.split("/")[0]);
				System.out.println("Mês: " + data.split("/")[1]);
				System.out.println("Ano: " + data.split("/")[2]);
			}
	}
