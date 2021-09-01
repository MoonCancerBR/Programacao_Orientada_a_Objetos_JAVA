import java.util.Scanner;

public class idade
{
    public static void main(String args[])
    {
        int n, maiores = 0, menores = 0;
        int vet[] = new int[50];
        try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Quantidade de Pessoas: ");
			n = scan.nextInt();
			
			for(int i = 0; i < n; i++)
			{
				System.out.print("Insira a idade da pessoa(" + (i + 1) + "): ");
			    vet[i] = scan.nextInt();
			    if(vet[i]<18)
			    	menores = menores + 1;
			    else
			    	maiores = maiores + 1;
			}
		}
        System.out.println("Maiores que 18 = " + maiores);
        System.out.println("Maiores que 18 = " + menores);
    }
}
