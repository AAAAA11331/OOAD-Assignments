import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Abstract class representing a shape.
 */
abstract class CShape {
    private static int shapeCounter = 0;
    private int shapeId;

    /**
     * Constructor for a shape.
     */
    public CShape() {
        this.shapeId = ++shapeCounter;
    }

    /**
     * Get the shape ID.
     *
     * @return The shape ID.
     */
    public int getShapeId() {
        return shapeId;
    }

    /**
     * Abstract method to get the shape's dimensions as a string.
     *
     * @return Dimensions as a string.
     */
    public abstract String getDimensionsAsString();
}

/**
 * Class representing an oval, a specific type of shape.
 */
class COval extends CShape {
    protected int horizontalRadius;
    protected int verticalRadius;

    /**
     * HorizontalRadius getter
     * 
     * @return horizontalRadius  (int)
     */
    public int getHorizontalRadius(){
        return this.horizontalRadius;
    }

    /**
     * HorizontalRadius stetter
     * 
     * @param horizontalRadius  (int)
     */
    public void setHorizontalRadius(int HorizontalRadius){
        this.horizontalRadius=HorizontalRadius;
    }

    /**
     * verticalRadius getter
     * 
     * @return verticalRadius (int)
     */
    public int getverticalRadius(){
        return this.verticalRadius;
    }

    /**
     * verticalRadius stetter
     * 
     * @param verticalRadius  (int)
     */
    public void setverticalRadius(int verticalRadius){
        this.verticalRadius=verticalRadius;
    }

    /**
     * Constructor for an oval.
     *
     * @param horizontalRadius The horizontal radius of the oval.
     * @param verticalRadius   The vertical radius of the oval.
     */
    public COval(int horizontalRadius, int verticalRadius) {
        super();
        this.horizontalRadius = horizontalRadius;
        this.verticalRadius = verticalRadius;
    }

    /**
     * Get the oval's dimensions as a string.
     *
     * @return Dimensions as a string.
     */
    @Override
    public String getDimensionsAsString() {
        return "OVAL " + horizontalRadius + "x" + verticalRadius;
    }
}

/**
 * Class representing a circle, a specific type of oval.
 */
class CCircle extends COval {
    /**
     * Constructor for a circle.
     *
     * @param radius The radius of the circle.
     */
    public CCircle(int radius) {
        super(radius, radius);
    }

    /**
     * Get the circle's dimensions as a string.
     *
     * @return Dimensions as a string.
     */
    @Override
    public String getDimensionsAsString() {
        return "CIRCLE " + getRadius();
    }

    /**
     * Get the radius of the circle.
     *
     * @return The radius of the circle.
     */
    public int getRadius() {
        return super.horizontalRadius; // Assuming horizontalRadius represents the radius for the circle.
    }
}

/**
 * Class representing a rectangle, a specific type of shape.
 */
class CRectangle extends CShape {
    protected int length;
    protected int width;

    /**
     * Length getter
     * 
     * @return length  (int)
     */
    public int GetLength(){
        return length;
    }

    /**
     * Length setter
     * 
     * @param length  (int)
     */
    public void SetLength(int length){
        this.length=length;
    }

    /**
     * width getter
     * 
     * @return width  (int)
     */
    public int GetWidth(){
        return width;
    }

    /**
     * width setter
     * 
     * @param width  (int)
     */
    public void SetWidth(int width){
        this.width=width;
    }

    /**
     * Constructor for a rectangle.
     *
     * @param length The length of the rectangle.
     * @param width  The width of the rectangle.
     */
    public CRectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    /**
     * Get the rectangle's dimensions as a string.
     *
     * @return Dimensions as a string.
     */
    @Override
    public String getDimensionsAsString() {
        return "RECTANGLE " + length + "x" + width;
    }
}

/**
 * Class representing a square, a specific type of rectangle.
 */
class CSquare extends CRectangle {
    /**
     * Constructor for a square.
     *
     * @param sideLength The side length of the square.
     */
    public CSquare(int sideLength) {
        super(sideLength, sideLength);
    }

    /**
     * Get the square's dimensions as a string.
     *
     * @return Dimensions as a string.
     */
    @Override
    public String getDimensionsAsString() {
        return "SQUARE " + super.length + "x" + super.width;
    }
}

/**
 * Class representing a canvas, containing a list of shapes.
 */
class CCanvas {
    private List<CShape> shapes;

    /**
     * Constructor for a canvas.
     */
    public CCanvas() {
        this.shapes = new ArrayList<>();
        generateRandomShapes();
    }

    /**
     * Get the list of shapes on the canvas.
     *
     * @return List of shapes.
     */
    public List<CShape> getShapes() {
        return shapes;
    }

    /**
     * Generate 10 random non-duplicate shapes for the canvas.
     */
    private void generateRandomShapes() {
        Random random = new Random();

        while (shapes.size() < 10) {
            int shapeType = random.nextInt(4); // 0: Oval, 1: Circle, 2: Rectangle, 3: Square

            switch (shapeType) {
                case 0:
                    COval oval = new COval(random.nextInt(100) + 1, random.nextInt(100) + 1);
                    addShapeIfNotDuplicate(oval);
                    break;
                case 1:
                    CCircle circle = new CCircle(random.nextInt(100) + 1);
                    addShapeIfNotDuplicate(circle);
                    break;
                case 2:
                    CRectangle rectangle = new CRectangle(random.nextInt(100) + 1, random.nextInt(100) + 1);
                    addShapeIfNotDuplicate(rectangle);
                    break;
                case 3:
                    CSquare square = new CSquare(random.nextInt(100) + 1);
                    addShapeIfNotDuplicate(square);
                    break;
            }
        }
    }

    /**
     * Add a shape to the canvas if it's not a duplicate.
     *
     * @param shape The shape to be added.
     */
    private void addShapeIfNotDuplicate(CShape shape) {
        if (!shapes.contains(shape)) {
            shapes.add(shape);
        }
    }
}

/**
 * Main class to instantiate a canvas and display its contents.
 */
public class main {
    /**
     * Main method to run the program.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        CCanvas canvas = new CCanvas();

        System.out.println("Canvas has the following random shapes:\n");

        for (int i = 0; i < canvas.getShapes().size(); i++) {
            CShape shape = canvas.getShapes().get(i);
            System.out.println("Shape " + shape.getShapeId() + ": " + shape.getDimensionsAsString());
        }
    }
}
