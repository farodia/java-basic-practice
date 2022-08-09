package com.example.basic_practice.vo;

//*The Fishnet is immutable*/

import lombok.Getter;

@Getter
public class Fishnet {

    private final int salmon;
    private final int tuna;
    private final int sardine;

    public Fishnet(int salmon, int tuna, int sardine) {
        this.salmon = salmon;
        this.tuna = tuna;
        this.sardine = sardine;
    }

    /**
     * @param     otherFishnet a new fishnet will be added
     * @return   A sum fishnet add the new fishnet
     */
    public Fishnet add(Fishnet otherFishnet) {
        return new Fishnet(this.salmon + otherFishnet.salmon,
                this.tuna + otherFishnet.tuna,
                this.sardine + otherFishnet.sardine);
    }
}
