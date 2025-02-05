package GUI.StoneGUI;

import Board.StoneColor;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class StoneGUI extends Circle {
    private int x;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private int y;
    public StoneGUI(StoneColor color, double x, double y, double radius, int posX, int posY){
        setFill(Color.TRANSPARENT);
        setStroke(Color.BLACK);

        this.x = posX;
        this.y = posY;
        this.setVisible(true);
        this.setCenterX(x);
        this.setCenterY(y);
        this.setRadius(radius);
    }
}
