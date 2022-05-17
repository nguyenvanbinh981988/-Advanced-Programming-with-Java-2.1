package interface_Resizeable;

public class Square extends Rectangle {
    private double side;

    public Square(){
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filler){
        super(side,side,color,filler);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }

    @Override
    public String toString() {
        return "Square with side = " + getSide() + ", which is a subclass of Rectangle";
    }
    @Override
    public void resize(double percent) {
        setSide(getWidth()*percent);
    }



}