package Landtrack;
import java.awt.Rectangle;

public class LandTract 
{
    private double length;
    private double width;
    
    public LandTract(double len, double wid) {
        this.length = len; 
        this.width = wid;
    }
    
    public LandTract(LandTract land) {
        this.length = land.getLength();
        this.width = land.getWidth();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getArea() {
        return this.length * this.width;
    }
}
