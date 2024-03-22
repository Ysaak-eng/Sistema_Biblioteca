package Sistema;

import java.util.Date;

import javax.swing.JOptionPane;

/*Título (String)
Autor (String)
Editora (String)
Ano de Publicação (int)
ISBN (String)
Quantidade disponível (int) */
public class Livro {
    private String Titulo;
    private String Autor;
    private String Editora;
    private Date anoPublic;

    public Livro(String Titulo, String Autor, String Editora, Date anoPublic, String Isbn, int Qunt) {
        setTitulo(Titulo);
        setAutor(Autor);
        setEditora(Editora);
        setAnoPublic(anoPublic);
        setIsbn(Isbn);
        setQunt(Qunt);
    }

    public String getTitulo() {
        return this.Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return this.Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEditora() {
        return this.Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    public Date getAnoPublic() {
        return this.anoPublic;
    }

    public void setAnoPublic(Date anoPublic) {
        this.anoPublic = anoPublic;
    }

    public String getIsbn() {
        return this.Isbn;
    }

    public void setIsbn(String Isbn) {
        this.Isbn = Isbn;
    }

    public int getQunt() {
        return this.Qunt;
    }

    public void setQunt(int Qunt) {
        this.Qunt = Qunt;
    }

    private String Isbn;
    private int Qunt;

    //
    public Boolean LivroEmpresar() {
        if (this.Qunt <= 0) {
            JOptionPane.showMessageDialog(null, "Impossivel de empressatar livro");
            return false;
        } else {
            this.Qunt -= 1;
            JOptionPane.showMessageDialog(null, "Empressimo bem sucedido");
            return true;
        }

    }
}
