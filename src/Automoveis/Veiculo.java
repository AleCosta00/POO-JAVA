package src.Automoveis;

public abstract class Veiculo {
    private String chassi;
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getChassi() {
        return chassi;
    }
    public abstract void ligar();
}
