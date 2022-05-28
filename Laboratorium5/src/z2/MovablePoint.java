package z2;

public class MovablePoint implements Movable{
    int x;
    int y;

    MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void moveDown() {
        this.y--;
    }

    public void moveLeft() {
        this.x--;
    }

    public void moveRight() {
        this.x++;
    }

    public void moveUp() {
        this.y++;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
