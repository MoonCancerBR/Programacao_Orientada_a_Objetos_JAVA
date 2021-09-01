package projeto_poo;
public class Contato {
    private String nome;
    private String telefone;
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    public Contato(String nome) {
        this.nome = nome;
        this.telefone = " ";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public boolean equals(Contato c){
        
        if(this.nome.trim().equalsIgnoreCase(c.getNome().trim())){
            return true;
        }
        
        return false;
        
    }
    @Override
    public String toString() {
        return "nome = " + nome + ", telefone = " + telefone;
    }
}
