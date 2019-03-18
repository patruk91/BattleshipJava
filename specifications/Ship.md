### Ship.java
## Definition of ship object.

__Attributes__

* `shipSquare`
    - data: List<Square>
    - description: list of reference to squares building ship

* `isSunk`
    - data: List<Square>
    - description: list of reference to squares building ship

__Instance methods__

##### `Ship(int x, int y, String direction, Ocean ocean, int length)`

    Constructs a Ship object

* `getShipSquares(int x, int y, Ocean ocean, String direction, int shipLength)`
    Add to `shipSquare` references to square objects building ship starting with
    square at position x,y

* `isShipSunk()`
    return boolean value true if ship is destroyed, false if is a float

