package pacman;

public class pacman {

    int x = 1, y = 1;

    public void setKanan() {
        x = x + 1;
    }

    public void setKiri() {
        x = x - 1;
    }

    public void setAtas() {
        y = y - 1;
    }

    public void setBawah() {
        y = y + 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
