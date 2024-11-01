class hello{
    private int radius;
    private int height;


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double volume(){
        return Math.PI*radius*height +Math.PI*radius*radius;
    }
    public double volume2(){
        return Math.PI*radius*radius*height;
    }
}
public class ps6{
    public static void main(String []args){
        // hello hey=new hello("san",100);
        hello hey=new hello();
        hey.setRadius(12);
        System.out.println(hey.getRadius());
        hey.setHeight(10);
        System.out.println(hey.getHeight());
        System.out.println(hey.volume());
        System.out.println(hey.volume2());
    }
}
