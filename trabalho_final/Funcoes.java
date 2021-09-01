package projeto_poo;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Funcoes {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        boolean sair = false;
        int opcao; //Guarda a opção escolhida pelo usuario.
        Agenda agendaTelefonica = new Agenda(100);
        String nome, newname, telefone, newtelefone;
        Contato c;
        while (!sair) {
            System.out.println("0. Adicionar contato");
            System.out.println("1. Listar contatos");
            System.out.println("2. Buscar contato");
            System.out.println("3. Existe contato");
            System.out.println("4. Deletar contato");
            System.out.println("5. Editar nome");
            System.out.println("6. Editar numero do contato");
            System.out.println("7. Contatos disponiveis");
            System.out.println("8. Agenda cheia");
            System.out.println("9. Sair");
            try {
                System.out.println("Digite uma das opcoes:");
                opcao = sn.nextInt();
                switch (opcao) {
                    case 0:

                        //Peco valores
                        
                        System.out.println("Escreva um nome:");
                        nome = sn.next();
                        System.out.println("Escreva um telefone:");
                        telefone = sn.next();

                        //Crio o contato
                        
                        c = new Contato(nome, telefone);
                        agendaTelefonica.adicionarContato(c);
                        break;
                    case 1:
                        agendaTelefonica.listarContatos();
                        break;
                    case 2:

                        //Pede o nome
                        
                        System.out.println("Escreva um nome:");
                        nome = sn.next();
                        agendaTelefonica.buscarPorNome(nome);
                        break;
                    case 3:

                        //Pede o nome
                        
                        System.out.println("Escreva o nome do contato que quer verificar:");
                        nome = sn.next();
                        //Crio o contato auxiliar
                        
                        c = new Contato(nome);

                        if (agendaTelefonica.existeContato(c)) {
                            System.out.println("Existe o contato!\n");
                        } else {
                            System.out.println("O contato não existe!\n");
                        }

                        break;
                    case 4:

                        //peco o nome
                        System.out.println("Escreva um nome do contato que deseja deletar:");
                        nome = sn.next();

                        //Crio o contato auxiliar
                        
                        c = new Contato(nome);
                        agendaTelefonica.eliminarContato(c);
                        break;
                        
                    case 5: 
                        
                        //editar nome
                        
                        agendaTelefonica.listarContatos();
                        System.out.println("Escolha o contato a ter o nome editado:");
                        nome = sn.next();
                        System.out.println("Digite um novo nome:");
                        newname = sn.next();
                        c = new Contato(nome);
                        agendaTelefonica.editarNome(c, nome, newname);
                        break;
                    case 6: 

                        //editar numero
                        
                        agendaTelefonica.listarContatos();
                        System.out.println("Escolha o contato a ter o telefone editado");
                        nome = sn.next();
                        System.out.println("Digite um novo numero do contato:");
                        newtelefone = sn.next();
                        c = new Contato(nome);
                        agendaTelefonica.editarTelefone(c, nome, newtelefone);
                        break;
                        
                    case 7:
                        System.out.println("Há " + agendaTelefonica.vagasLivre() + " contatos livre!");
                        break;
                    case 8:
                        
                        //como devolve um booleano, o metodo em um if
                        
                        if (agendaTelefonica.agendaCheia()) {
                            System.out.println("Agenda esta cheia\n");
                        } else {
                            System.out.println("Ainda pode inserir contatos\n");
                        }
                        break;
                    case 9:
                        sair = true;
                        break;
                    default:
                        System.out.println("Somente números entre 0 e 9!\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Você deve inserir um número!\n");
                sn.next();
            }
        }
    }
}
