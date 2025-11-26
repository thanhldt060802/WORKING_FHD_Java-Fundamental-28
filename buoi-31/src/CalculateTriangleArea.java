public class CalculateTriangleArea implements SolveTriangle {
    
    @Override
    public double calculate(Triangle triangle) {
        double p = (triangle.a + triangle.b + triangle.c) / 2.0;
        return Math.sqrt(p * (p - triangle.a) * (p - triangle.b) * (p - triangle.c));
    }

}
