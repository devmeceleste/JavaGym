
package model;


public class Aluno {
    private int id;
    private String nome;
    private String usuario;
    private String senha;
    private String confsenha;

    public Aluno(int id, String nome, String usuario, String senha, String confsenha) {
        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.confsenha = confsenha;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }  
    
     public String getConfsenha() {
        return confsenha;
    }

    public void setConfsenha(String confsenha) {
        this.confsenha = confsenha;
    }
    
    
    public boolean verificarCredenciais(String usuario, String senha) {
    return this.usuario.equals(usuario) && this.senha.equals(senha);
}
    
}
