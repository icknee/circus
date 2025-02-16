<<<<<<<< HEAD:src/main/java/Circus/stuff/Cannon.java
package Circus.stuff;
========
package circus.stuff;
>>>>>>>> upstream/main:src/main/java/circus/stuff/Cannon.java

public class Cannon extends Equipment {

    public Cannon(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 3;
    }
}
