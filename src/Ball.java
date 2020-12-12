public class Ball {
    private double x = 0.0;
    private double y = 0.0;
    private String type = "Null";
    private int number = 0;
    public Ball(){}
    public Ball(int n,double x, double y, String t){
        this.x = x;
        this.y = y;
        this.type = t;
        this.number = n;
    }
    public double getX() { return x; }
    public double getY() { return y; }
    public String getType() { return type; }
    public int getNumber() {return number; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setType(String type) {this.type = type; }
    public void setNumber (int number) {this.number = number;}
    public void setXY(double x, double y){ this.x = x; this.y = y; }
    public void move( double xPos, double yPos){ x = y + xPos; y = y + yPos; }
    public String toString() { return "Ball: "+this.number+ " X: "+this.x+" Y: "+this.y+ " Type: "+this.type; }
}
