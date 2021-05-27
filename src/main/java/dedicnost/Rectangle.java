package dedicnost;

public class Rectangle extends ShapeParent {
    private final float aS;
    private final float bS;

    public Rectangle(float a, float b){
        this.bS = b;
        this.aS = a;
    }
    public float obsah() {
        return (int) (aS * bS);
    }
    public float obvod(){
        return (int) (2 * (aS + bS));
    }

}
