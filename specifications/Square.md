### Square.java
## Basic element, which construct Ocean.

__Attributes__

* `x`
    - data: int
    - description: x index of row in Array[][]

* `y`
    - data: int
    - description: y index of column in Array[][]

* `shipName`: (default) `ocean`
    - data:String
    - description: indicator of being part of the ship or ocean

* `status`
    - data: String
    - description: sign of ship, empty, hit


__Instance methods__

##### `Square(int x, int y)`

    Constructs a Square object

* `setShipName(String ship name)`

    Setter for the `shipName` field

* `setStatus(String status)`

    Setter for the `status` field

* `getX()`

    Getter for the `x` field

* `getY()`

    Getter for the `y` field

* `getShipName()`

    Getter for the `shipName` field

* `getStatus()`

    Getter for the `shipName` field

* `toString`

    Returns staus

    Possible outputs:
    - `" "`
    - `"S"`
    - `"X"`
    - `"O"`
