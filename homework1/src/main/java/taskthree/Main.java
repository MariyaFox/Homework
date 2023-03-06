package taskthree;

class Main {
    public static void main(String[] args) {
        Forms xTriangle = new Triangle();  //  создание объекта Triangle
        Forms xCircle = new Circle();  // создание объекта Circle
        Forms xSquare = new Square();  // создание объекта Square
        xTriangle.shapearea();

        xCircle.shapearea();

        xSquare.shapearea();


    }
}
