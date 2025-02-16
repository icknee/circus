<<<<<<<< HEAD:src/main/java/Circus/stuff/Ladder.java
package Circus.stuff;

public class Ladder extends Equipment {
========
package circus.stuff;

import circus.Asset;

public class Ladder extends Equipment implements Asset {
>>>>>>>> upstream/main:src/main/java/circus/stuff/Ladder.java

    public Ladder(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 2;
    }
}
