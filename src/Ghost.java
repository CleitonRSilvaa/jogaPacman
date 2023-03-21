
import java.util.Random;

public final class Ghost extends GameObject implements Acao{

    private int Direction;

    public Ghost(int x, int y, int direcao) {
        super(x, y);

        if (this.Direction >= 0) {
            this.Direction = direcao;
        }
    }

    public void gerarDirecao() {
        Random random = new Random(4);
        int n = random.nextInt();
        if (n == 1) {
            this.Direction = 0;
        }
        if (n == 2) {
            this.Direction = 90;
        }
        if (n == 3) {
            this.Direction = 180;
        }
        if (n == 4) {
            this.Direction = 270;
        }
    }

    public int getDirection() {
        return Direction;
    }

    public void setDirection(int direction) {
        if (direction >= 0)
            this.Direction = direction;
        serMover();
    }

    public int removerVida(){
        return 1;
    }

    @Override
    public boolean podeSeMover() {
        if(this.Direction ==0){
            if(getX()> getScreenSize()) return false;
        }
        if(this.Direction ==90){
            if(getY()>getScreenSize()) return false;
        }

        if(this.Direction ==180){
            if(getY()>getScreenSize()) return false;
        }

        if(this.Direction ==270){
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
