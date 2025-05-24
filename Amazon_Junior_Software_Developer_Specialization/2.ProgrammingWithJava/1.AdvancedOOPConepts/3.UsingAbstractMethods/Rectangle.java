class Rectangle extends Shape {
    private int width, height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void area() {
        int areaOfRectangle = this.width * this.height;
        System.out.println("Area of rectangle: " + areaOfRectangle);
    }
}
