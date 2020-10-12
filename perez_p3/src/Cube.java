public class Cube extends Shape3D {

    private double side_length;

    Cube(double side_length){
        this.side_length = side_length;
    }

    @Override
    public String getName(){
        return "cube";
    }

    @Override
    public double getArea(){
        return (6*side_length*side_length);
    }

    @Override
    public double getVolume(){
        return (side_length*side_length*side_length);
    }
}
