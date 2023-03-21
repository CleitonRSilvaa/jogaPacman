
public final class Player extends GameObject implements Acao{

    private int Direction;
    private int life ;
    private boolean invencivel;

    public Player() {
    }

    public Player(int x, int y, int direcao) {
        super(x, y);

        if (this.Direction >= 0) {
            this.Direction = direcao;
        }
    }

    public int getDirection() {
        return Direction;
    }

    public void setDirection(int direcao) {
        if(direcao >= 0)this.Direction = direcao;
        serMover();
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isInvencivel() {
        return invencivel;
    }

    public void setInvencivel(boolean invencivel) {
        this.invencivel = invencivel;
    }


    @Override
    public boolean podeSeMover() {
        if(this.Direction==0){
            if(getX()> getScreenSize()) return false;
        }
        if(this.Direction==90){
            if(getY()>getScreenSize()) return false;
        }

        if(this.Direction==180){
            if(getY()>getScreenSize()) return false;
        }

        if(this.Direction==270){
            if(getX()> getScreenSize()) return false;

        }
        return true;

    }

    @Override
    public void serMover() {
        if (podeSeMover()){
            if (Direction==0) this.setY(getY()-10);
            if (Direction==90) this.setX(getX()+10);
            if (Direction==180) this.setY(getY()+10);
            if (Direction==270) this.setX(getX()-10);


        }
    }
}