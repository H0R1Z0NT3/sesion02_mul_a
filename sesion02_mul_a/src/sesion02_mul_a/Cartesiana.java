
package sesion02_mul_a;

public class Cartesiana {
    private float x, y;

    public Cartesiana(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Cartesiana(){
    }

    public Cartesiana polar_cartesiano (float radio, float angulo){
        float x = radio * (float)Math.cos(angulo);
        float y = radio * (float)Math.sin(angulo);
        return new Cartesiana(x, y);
    }
    
     public Polar cartesiana_polar (float radio, float angulo){
        float x = radio * (float)Math.cos(angulo);
        float y = radio * (float)Math.sin(angulo);
        return new Polar(x, y);
    }
    
    public float getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
