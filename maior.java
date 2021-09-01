import java.util.Scanner;
public class maior {
  public static void main(String args[]) {
	  int v[] = new int[5];
	  try (Scanner scan = new Scanner(System.in)) { 
	  for (int i=0; i<5; i++) {
		  System.out.println("Digite o numero "+(i+1)+":");
		  v[i] = scan.nextInt(); ;
	  }
	  }
    maior bs = new maior();
    bs.ordenar(v);
      System.out.print(v[4] + " é o maior");
  }
  public void ordenar(int[] v) {
    for(int i = 0; i < v.length - 1; i++) {
      for(int j = 0; j < v.length - 1 - i; j++) {
        if(v[j] > v[j + 1]) {
          int aux = v[j];
          v[j] = v[j + 1];
          v[j + 1] = aux;
        }
      }
    }
  }
}
