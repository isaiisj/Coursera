class Circle extends Shape {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double areaOfCircle = Math.PI * Math.pow(this.radius, 2);
        System.out.println("Area of Circle: " + areaOfCircle);
    }
}
