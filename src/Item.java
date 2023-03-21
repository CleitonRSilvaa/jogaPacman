public class Item extends GameObject{
    
    private boolean visivel;

    public Item() {
    }

    public Item(int x, int y) {
        super(x, y);
    }

    public boolean isVisivel() {
        return visivel;
    }

    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }

}
