public class CalculateTrianglePerimeter implements SolveTriangle {

    @Override
    public double calculate(Triangle triangle) {
        return triangle.a + triangle.b + triangle.c;
    }
    
}
