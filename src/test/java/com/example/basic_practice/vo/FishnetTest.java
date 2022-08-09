package com.example.basic_practice.vo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FishnetTest {

    @Test
    void should_return_20_salmon_21_tuna_22_sardine_when_add_fishnets() {
        Fishnet firstFishnet = new Fishnet(7, 10, 12);
        Fishnet secondFishnet = new Fishnet(13, 11, 10);
        Fishnet allFishnets = firstFishnet.add(secondFishnet);

        Assertions.assertEquals(20, allFishnets.getSalmon());
        Assertions.assertEquals(21, allFishnets.getTuna());
        Assertions.assertEquals(22, allFishnets.getSardine());
    }

}