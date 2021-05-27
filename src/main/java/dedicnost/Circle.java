package dedicnost;

public class Circle extends ShapeParent{
    private final float rS;

    public Circle(float r){
        this.rS = r;
    }
    public float obsah(){
        return (int) (3.14 * (rS * rS));
    }
    public float obvod(){
        return (int) (2 * 3.14 * rS);
    }
    public float prumer(){
        return (int) (2 * rS);
    }
}
