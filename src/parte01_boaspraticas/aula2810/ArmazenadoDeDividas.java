package parte01_boaspraticas.aula2810;

public interface ArmazenadoDeDividas {
    void salva(Divida divida);

    Divida carrega(Documento documentoCredor);
}
