import java.util.Scanner;

public class quadrado
{
    public static void main(String args[])
    {
        int vet[] = new int[50];
        try (Scanner scan = new Scanner(System.in)) {
			for(int i = 0; i < 5; i++)
			{
				System.out.print("Insira valor(" + (i + 1) + "):");
			    vet[i] = scan.nextInt(); 
			    System.out.println("Quadrado:" + vet[i]*vet[i]);
			}
		}
    }
}
