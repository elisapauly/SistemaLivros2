public class Livro {

    // Atributos
    private int codigo;
    private String titulo;
    private String autor;
    private String editora;
    private int nrPaginas;
    private int edicao;

    //metodo construtor (servem para construir seu obejto com valores default)
        Livro(){
        this.codigo = 0;
        this.titulo = "Nenhum Titulo";
        this.autor = "";
        this.editora = "";
        this.nrPaginas = 0;
        this.edicao = 0;
    }

    Livro(int codigo, String titulo){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = "";
        this.editora = "";
        this.nrPaginas = 0;
        this.edicao = 0;
    }

    Livro(int codigo, String titulo, String autor, String editora, int nrpaginas, int edicao){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.nrPaginas = nrpaginas;
        this.edicao = edicao;
    }

    // Métodos
    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
       this.codigo = codigo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getEditora(){
        return this.editora;
    }

    public void setEditora(String editora){
        this.editora = editora;
    }

    public int getNrPaginas(){
        return this.nrPaginas;
    }

    public void setNrPaginas(int nrPaginas){
        this.nrPaginas = nrPaginas;
    }

    public int getEdicao(){
        return this.edicao;
    }

    public void setEdicao(int edicao){
        this.edicao = edicao;
    }

      public void Localizar() {
        System.out.println("Estou localizando biblioteca..  " );
    }

       public void Ler() {
      System.out.println("Estou lendo...  ");
   }

   public void Cadastrar() {
      System.out.println("Estou cadastrando...  ");
   }
}

