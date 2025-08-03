interface Volume {
    float pi = 3.145f;
    float v();
}

class Circle {
    public float r;
    public Circle(float a) {
        r = a;
    }
}

class Mat extends Circle implements Volume {
    float area;
    public Mat(float a) {
        super(a);
    }
    public float v() {
        return (4.0f / 3) * r * r * r * pi;
    }
    public float shape() {
        area = 2 * pi * r * r;
        return area;
    }
}

public class Geo {
    public static void main(String[] args) {
        Mat m = new Mat(2);
        System.out.println("Volume: " + m.v());
        System.out.println("Area: " + m.shape());
    }}