package model;

public class Usuario {
    private int id;
    private String NomedeUsuario;
    private String SenhadeUsuario;
    private String EmaildeUsuario;
    private String CREUsuario;

    public Usuario(String NomedeUsuario, String SenhadeUsuario, String EmaildeUsuario, String CREUsuario) {
        this.NomedeUsuario = NomedeUsuario;
        this.SenhadeUsuario = SenhadeUsuario;
        this.EmaildeUsuario = EmaildeUsuario;
        this.CREUsuario = CREUsuario;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomedeUsuario() {
        return NomedeUsuario;
    }

    public void setNomedeUsuario(String NomedeUsuario) {
        this.NomedeUsuario = NomedeUsuario;
    }

    public String getSenhadeUsuario() {
        return SenhadeUsuario;
    }

    public void setSenhadeUsuario(String SenhadeUsuario) {
        this.SenhadeUsuario = SenhadeUsuario;
    }

    public String getEmaildeUsuario() {
        return EmaildeUsuario;
    }

    public void setEmaildeUsuario(String EmaildeUsuario) {
        this.EmaildeUsuario = EmaildeUsuario;
    }

    public String getCREUsuario() {
        return CREUsuario;
    }

    public void setCREUsuario(String CREUsuario) {
        this.CREUsuario = CREUsuario;
    }

}
