public class SistemaLivros {

    public static void main(String[] args) {

        // Livro genérico
        Livro livro = new Livro();
        livro.setCodigo(1);
        livro.setTitulo("Codigo da Vinci");
        livro.setEditora("Editora Xyz");
        livro.setNrPaginas(100);
        livro.setEdicao(3);

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        // Livro da biblioteca
        LivroBiblioteca livroBiblioteca = new LivroBiblioteca();
        livroBiblioteca.setCodigo(11);
        livroBiblioteca.setTitulo("Cinderela");
        livroBiblioteca.setAutor("Autor Desconhecido");
        livroBiblioteca.setEditora("Editora 123");
        livroBiblioteca.setNrPaginas(200);
        livroBiblioteca.setEdicao(6);
        livroBiblioteca.setCategoria("Animação");
        livroBiblioteca.setPrazoEntrega(10);
        livroBiblioteca.setNomeQuemEmprestou("Marcelo Petri");

        livroBiblioteca.Ler();
        livroBiblioteca.Cadastrar();
        livroBiblioteca.Localizar();

        // Livro da livraria
        LivroLivraria livroLivraria = new LivroLivraria();
        livroLivraria.setCodigo(21);
        livroLivraria.setTitulo("Gato de Botas");
        livroLivraria.setAutor("Autor xxx");
        livroLivraria.setEditora("Editora 321");
        livroLivraria.setNrPaginas(50);
        livroLivraria.setEdicao(1);
        livroLivraria.setPreco(10.00);
        livroLivraria.setNovoUsado(false); // false = usado
        livroLivraria.setLocalPrateleira("Piso baixo 123");
        livroLivraria.setCategoria("Animação");

        livroLivraria.Ler();
        livroLivraria.Cadastrar();
        livroLivraria.Localizar();
        livroLivraria.vender();

        String mensagem = "\nCodigo: "+livro.getCodigo()+
                          "\nTitulo: "+livro.getTitulo()+
                          "\nEditora: "+livro.getEditora()+
                          "\nNúmero de Páginas: "+livro.getNrPaginas()+
                          "\nEdição: "+livro.getEdicao();

        mensagem = "\nCodigo: "+livroBiblioteca.getCodigo()+
                          "\nTitulo: "+livroBiblioteca.getTitulo()+
                          "\nAutor: "+livroBiblioteca.getAutor()+
                          "\nEditora: "+livroBiblioteca.getEditora()+
                          "\nNúmero de Páginas: "+livroBiblioteca.getNrPaginas()+
                          "\nEdição: "+livroBiblioteca.getEdicao()+
                          "\nCategoria: "+livroBiblioteca.getCategoria()+
                          "\nPrazo de Entrega: "+livroBiblioteca.getPrazoEntrega()+
                          "\nNome de quem emprestou: "+livroBiblioteca.getNomeQuemEmprestou();

        mensagem = "\nCodigo: "+livroLivraria.getCodigo()+
                          "\nTitulo: "+livroLivraria.getTitulo()+
                          "\nAutor: "+livroLivraria.getAutor()+
                          "\nEditora: "+livroLivraria.getEditora()+
                          "\nNúmero de Páginas: "+livroLivraria.getNrPaginas()+
                          "\nEdição: "+livroLivraria.getEdicao()+
                          "\nPreço: "+livroLivraria.getPreco()+
                          "\nNovo ou Usado: "+livroLivraria.getNovoUsado()+
                          "\nLocal na Prateleira: "+livroLivraria.getLocalPrateleira()+
                          "\nCategoria: "+livroLivraria.getCategoria();

       //Exemplo metodo construtor
        Livro novoLivro = new Livro();
        System.out.println("Novo livro: "+novoLivro.getTitulo());
        novoLivro.setTitulo("Novo título legal");
        System.out.println("Novo livro: "+novoLivro.getTitulo());

        //Metodo construtor com parametros
        Livro livro2 = new Livro(99, "Titanic");
        System.out.println("Livro 2: "+livro2.getTitulo());

        //Metodo construtor com todos os parametros
        Livro livro3 = new Livro(1,
                                 "A menina que roubava livros",
                                 "Andreisse",
                                 "Bosch",
                                 600,
                                 1
                                 );

        LivroBiblioteca livroBiblioteca2 = new LivroBiblioteca(2,
                                                               "Crepusculo",
                                                               "Vampiros",
                                                               "DUDAO SA",
                                                               20,
                                                               3,
                                                               "Andar 3",
                                                               "Romance",
                                                               5,
                                                               "Marcelo");

    }
}