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
