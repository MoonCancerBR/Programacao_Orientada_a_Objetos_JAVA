package projeto_poo;
public class Agenda {
    //Atributos
    private Contato[] contatos;
    //Construtores
    public Agenda() {
        this.contatos = new Contato[10];
    }
    public Agenda(int tamanho) {
        this.contatos = new Contato[tamanho]; //tamanho que nos queremos
    }
    //Metodos
    /**
     * Adiciona um contato para agenda
     */
    public void adicionarContato(Contato c) {
        if (agendaCheia()) { //Indico se agenda esta ou não cheia
            System.out.println("Agenda esta cheia, não se pode inserir mais contatos\n");
        } else if (existeContato(c)) { //Indico se existe o contato
            System.out.println("O contato com esse nome ou telefone já está cadastrado\n");
        } else {
            boolean encontrado = false;
            for (int i = 0; i < contatos.length && !encontrado; i++) {
                if (contatos[i] == null) { //controlo os nulos
                    contatos[i] = c; //Insiro o contato 
                    encontrado = true; //Indico que foi encontrado
                }
            }
            if (encontrado) {
                System.out.println("Foi adicionado com sucesso\n");
            } else {
                System.out.println("Não se pode ser adicionado\n");
            }
        }
    }
    /* Indica se existe um contato */
    public boolean existeContato(Contato c) {
        for (int i = 0; i < contatos.length; i++) {
            //Controlo os nulos e indico se o contato é o mesmo
            if (contatos[i] != null && c.equals(contatos[i])) {
                return true;
            }
        }
        return false;
    }
    /**
     * Lista dos contatos da agenda
     */
    public void listarContatos() {
        if (vagasLivre() == contatos.length) {
            System.out.println("Não ha contatos há serem mostrados\n");
        } else {
            for (int i = 0; i < contatos.length; i++) {
                if (contatos[i] != null) { //Controlo os nulos
                    System.out.println(contatos[i]);
                }
            }
        }
    }
    /**
     * Busca um contato por seu nome
     */
    public void buscarPorNome(String nome) {
        boolean encontrado = false;
        for (int i = 0; i < contatos.length && !encontrado; i++) {
            
            //Controlo os nulos e comprovo que e o contato buscado
            
            if (contatos[i] != null && contatos[i].getNome().trim().equalsIgnoreCase(nome.trim())) {
                System.out.println(" Seu telefone é " + contatos[i].getTelefone()+ "\n"); //mostro telefone
                encontrado = true; //Indico que foi encontrado
            }
        }
        if (!encontrado) {
            System.out.println(" Contato não encontrado\n");
        }
    }
    /**
     * Indica se agenda esta cheia ou não.
     */
    public boolean agendaCheia() {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) { //Controlo os nulos
                return false; //indico que não esta cheia
            }
        }
        return true; //Está cheia
    }
    /**
     * Elimina o contato
     */
    public void eliminarContato(Contato c) {

        boolean encontrado = false;
        for (int i = 0; i < contatos.length && !encontrado; i++) {
            if (contatos[i] != null && contatos[i].equals(c)) {
                contatos[i] = null; //Controlo os nulos
                encontrado = true; //Indico que nao foi encontrado
            }
        }
        if (encontrado) {
            System.out.println(" O contato foi deletado!\n");
        } else {
            System.out.println(" O contato não existe!\n");
        }
    }
    /**
     * Indica quantos contatos a mais podemos inserir
     * @return 
     */
    public int vagasLivre() {
        int contadorLivres = 0;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) { //Controlo os nulos
                contadorLivres++; //Acumulo
            }
        }
        return contadorLivres;
    }
    public void editarNome (Contato c, String oldname, String newname){
        if(existeContato(c)){
            int pos = 0;
            while(contatos.length >= pos){
                if(oldname.equals(contatos[pos].getNome())) break;
                else pos++;
            }
            contatos[pos].setNome(newname);
            System.out.println("Contato editado com sucesso!\n");
        }
        else System.out.println("O contato que está tentando editar, não existe!\n");
        
    }
    public void editarTelefone (Contato c, String oldname, String newtelefone){
        if(existeContato(c)){
            int pos = 0;
            while(contatos.length >= pos){
                if(oldname.equals(contatos[pos].getNome())) break;
                else pos++;
            }
            contatos[pos].setTelefone(newtelefone);
            System.out.println("O numero do contato foi editado com sucesso!\n");
        }
        else System.out.println("O contato não existe!\n");
    }
}
