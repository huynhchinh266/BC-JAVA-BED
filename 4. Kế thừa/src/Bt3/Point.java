package Bt3;

public class Point {
    private float x = 0f;
    private float y = 0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] result = new float[2];
        result[0] = this.x;
        result[1] = this.y;
        return result;
    }
    @Override
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
}
