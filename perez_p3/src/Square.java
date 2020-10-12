public class Square extends Shape2D {

    private double side_length;

    Square(double side_length) {
        this.side_length = side_length;
    }


    @Override
    public String getName() {
        return "square";
    }

    @Override
    public double getArea() {
        return (side_length*side_length);
    }
}

