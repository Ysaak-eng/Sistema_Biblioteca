package Sistema;

public class Pessoa {
    private String name;
    private String Ender;
    private int Tele;
    private String Email;

    public Pessoa(String name, String Ender, int Tele, String Email) {
        setName(name);
        setEnder(Ender);
        setTele(Tele);
        setEmail(Email);

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnder() {
        return this.Ender;
    }

    public void setEnder(String Ender) {
        this.Ender = Ender;
    }

    public int getTele() {
        return this.Tele;
    }

    public void setTele(int Tele) {
        this.Tele = Tele;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}