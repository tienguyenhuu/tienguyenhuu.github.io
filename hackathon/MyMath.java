class MyMath {
    public boolean isTriangLe(double a, double b, double c) {
        return ((a + b > c) && (b + c > a) && (a + c > b));
    }

}