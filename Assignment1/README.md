# OOAD-Assignments
# Shape Generator

This Java program demonstrates object-oriented programming (OOP) concepts such as inheritance and composition by implementing a system for generating and displaying random shapes on a canvas.

## Classes

1. **CShape:**
    - Abstract class representing a generic shape.
    - All shapes have a unique ID and a method to get their dimensions as a string.

2. **COval:**
    - Subclass of CShape representing an oval.
    - Has horizontal and vertical radii.

3. **CCircle:**
    - Subclass of COval representing a circle.
    - Inherits from COval and provides a specific implementation for circles.

4. **CRectangle:**
    - Subclass of CShape representing a rectangle.
    - Has length and width.

5. **CSquare:**
    - Subclass of CRectangle representing a square.
    - Inherits from CRectangle and provides a specific implementation for squares.

6. **CCanvas:**
    - Class representing a canvas that contains a list of shapes.
    - Generates 10 random non-duplicate shapes upon instantiation.

## Running the Program

To run the program, follow these steps:

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/AAAAA11331/OOAD-Assignments.git

2. **Run the program**
   ```bash
   java -jar OOAD-Assignments/Assignment1/Assignment1.jar

Example Output
After running the program, you should see output similar to the following:

Canvas has the following random shapes:
Shape 1: CIRCLE 32
Shape 2: SQUARE 46x46
Shape 3: RECTANGLE 4x18
Shape 4: RECTANGLE 71x89
Shape 5: OVAL 91x82
Shape 6: CIRCLE 78
Shape 7: OVAL 2x76
Shape 8: OVAL 8x36
Shape 9: RECTANGLE 82x69
Shape 10: RECTANGLE 63x94
