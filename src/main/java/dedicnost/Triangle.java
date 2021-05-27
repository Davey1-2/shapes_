package dedicnost;

public class Triangle extends ShapeParent{
    private final float aS;
    private final float bS;
    private final float cS;
    private final float heightS;

    public Triangle(float a, float b, float c, float height){
        this.aS = a;
        this.bS = b;
        this.cS = c;
        this.heightS = height;
    }

    public float obsah(){
        return (bS * heightS) / 2;
    }

    public float obvod(){
        return aS + bS + cS;
    }

}
