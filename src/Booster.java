public final class Booster extends Item {

    private float duracao;

    public Booster() {
    }

    public Booster(int x, int y) {
        super(x, y);
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(Float duracao) {
        this.duracao = duracao;
    }

}
