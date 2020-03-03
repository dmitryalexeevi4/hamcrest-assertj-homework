package com.github.dmitryalexeevi4;

import org.slf4j.*;
import org.testng.annotations.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestTest {
    private static final Logger LOG = LoggerFactory.getLogger(HamcrestTest.class);

    List<String> sovietCars = Arrays.asList("Volga", "Moskvitch", "Lada");

    @Test
    public void hamcrestExample() {
        assertThat(sovietCars, hasSize(3));
        assertThat(sovietCars, hasItems("Volga", "Moskvitch"));
        assertThat(sovietCars, not(hasItem("Audi")));

        LOG.info("HamcrestTest complete!");
    }
}
