<<<<<<<< HEAD:src/main/java/Circus/stuff/Equipment.java
package Circus.stuff;

import Circus.Asset;
========
package circus.stuff;

import circus.Asset;
>>>>>>>> upstream/main:src/main/java/circus/stuff/Equipment.java

public abstract class Equipment implements Asset {
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
