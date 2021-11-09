package Model;

public class Cursos {
    private long idCurso;
    private String nomeCurso;
    private Users nomeUser;
    private boolean ativo;

    public Cursos() {
    }

    public Cursos(long idCurso, String nomeCurso, Users nomeUser, boolean ativo) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.nomeUser = nomeUser;
        this.ativo = ativo;
    }

    public long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Users getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(Users nomeUser) {
        this.nomeUser = nomeUser;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Model.Cursos{" +
                "idCurso=" + idCurso +
                ", nomeCurso='" + nomeCurso + '\'' +
                ", nomeUser=" + nomeUser +
                ", ativo=" + ativo +
                '}';
    }
}
