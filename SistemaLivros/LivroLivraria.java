public class LivroLivraria extends Livro {

    // Atributos adicionais
    double preco;
    boolean novoUsado; // false = novo, true = usado
    String localPrateleira;
    String categoria;
    
    // Métodos

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public boolean getNovoUsado() {
      return this.novoUsado;
   }

   public void setNovoUsado(boolean var1) {
      this.novoUsado = var1;
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


    public void vender() {
        System.out.println("Estou vendendo ");
    }
    
        @Override
      public void Localizar() {
        System.out.println("Estou localizando livraria..  " );
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