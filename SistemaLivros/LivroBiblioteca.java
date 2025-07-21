public class LivroBiblioteca extends Livro {

    //Atributos
   private int prazoEntrega;
   private String nomeQuemEmprestou;
   private String categoria;
   private String localPrateleira;

    //Metodo construtor FILHO
    LivroBiblioteca(){}
    //Metodo construtor FILHO com parametros
    LivroBiblioteca(int codigo,
                    String titulo,
                    String autor,
                    String editora,
                    int nrpaginas,
                    int edicao,
                    String localPrateleira,
                    String categoria,
                    int prazoEntrega,
                    String nomeQuemEmprestou){
        //Acesso ao Metodo construtor PAI (Livro)
        super(codigo, titulo, autor, editora, nrpaginas, edicao); //Super envia informações do método construtor pai
        this.localPrateleira = localPrateleira;
        this.categoria = categoria;
        this.prazoEntrega = prazoEntrega;
        this.nomeQuemEmprestou = nomeQuemEmprestou;
    }

   public int getPrazoEntrega() {
      return this.prazoEntrega;
   }

   public void setPrazoEntrega(int var1) {
      this.prazoEntrega = var1;
   }

   public String getNomeQuemEmprestou() {
      return this.nomeQuemEmprestou;
   }

   public void setNomeQuemEmprestou(String var1) {
      this.nomeQuemEmprestou = var1;
   }

   public String getLocalPrateleira() {
      return this.localPrateleira;
   }

   public void setLocalPrateleira(String var1) {
      this.localPrateleira = var1;
   }

      public String getCategoria(){
    return this.categoria;
   }


   public void setCategoria(String var1){
    this.categoria = var1;
   }

    //Metodos
    public void Alugar(){
        System.out.println("Estou alugando...");
    }
    public void Devolver(){
        System.out.println("Estou devolvendo...");
    } 

@Override
      public void Localizar() {
        System.out.println("Estou localizando biblioteca..  " );
    }
@Override
       public void Ler() {
      System.out.println("Estou lendo...  ");
   }
@Override
   public void Cadastrar() {
      System.out.println("Estou cadastrando...  ");
   }
}