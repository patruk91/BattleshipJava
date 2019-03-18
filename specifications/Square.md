### Square.java
## Basic element, which construct Ocean.

__Attributes__

* `shipName`: (default) `ocean`
    - data:String
    - description: indicator of being part of the ship or ocean

* `myStatus`
    - data: String
    - description: sign of ship, empty, hit
      S- ship, X - hit, # - sunk

* `oponentStatus`
    - data: String
    - description: sign if square was hit at oponent ocean.
                   " " - default, X - hit, # - sunk, O - miss

__Instance methods__

##### `Square()`

    Constructs a Square object

* `setShipName(String ship name)`

    Setter for the `shipName` field

* `setMyStatus(String status)`

    Setter for the `myStatus` field

* `setOponentStatus(String status)`

    Setter for the `oponentStatus` field

* `getShipName()`

    Getter for the `shipName` field

* `getMyStatus()`

    Getter for the `myStatus` field

* `getOponentStatus()`

    Getter for the `oponentStatus` field

* `toString`

    Returns staus

    Possible outputs:
    - `" "`
    - `"S"`
    - `"X"`
    - `"O"`
