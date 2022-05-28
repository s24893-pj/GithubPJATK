package z2;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1,1);
        System.out.println(movablePoint.toString());

        movablePoint.moveDown();
        System.out.println(movablePoint.toString());

        movablePoint.moveUp();
        System.out.println(movablePoint.toString());

        movablePoint.moveRight();
        System.out.println(movablePoint.toString());

        movablePoint.moveLeft();
        System.out.println(movablePoint.toString());
    }
}
