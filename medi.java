import java.util.Scanner;

public class medi
{
    public static void main(String args[])
    {
        int n;
        double media, contador=0;
        double vet[] = new double[50];
        try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Quantidade de Notas");
			n = scan.nextInt();
			
			for(int i = 0; i < n; i++)
			{
				System.out.print("Insira a nota(" + (i + 1) + "):");
			    vet[i] = scan.nextDouble(); 
			    contador = contador + vet[i];
			}
		}
		
        media = contador/n;
		
        System.out.print("Média = " + media);
    }
}
