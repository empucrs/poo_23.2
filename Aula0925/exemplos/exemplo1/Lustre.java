public class Lustre implements Controlavel {
    private Lampada[] lampadas;
    public boolean ligado;

    public Lustre(int numeroLampadas) {
        lampadas = new Lampada[numeroLampadas];
        for (int i = 0; i < numeroLampadas; i++) {
            lampadas[i] = new Lampada();
        }
        ligado = false;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando lustre...");
        if (!ligado) {
            for (int i = 0; i < lampadas.length; i++) {
                lampadas[i].ligar();
                System.out.println("  Lampada "+i+" ligada");
            }
            ligado = true;
        }
    }

    @Override
    public void desligar() {
        System.out.println("Desligando lustre...");
        if (ligado) {
            for (int i = 0; i < lampadas.length; i++) {
                lampadas[i].desligar();
            }
            ligado = false;
        }
    }

    @Override
    public boolean isLigada() {
        return false;
    }
}
