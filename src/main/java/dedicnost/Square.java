package dedicnost;

public class Square extends ShapeParent{
    private final float aS;

    public Square(float a){
        this.aS = a;
    }

    public float obsah(){
        return (int) (aS * aS);
    }
    public float obvod(){
        return (int) (4 * aS);
    }

}
