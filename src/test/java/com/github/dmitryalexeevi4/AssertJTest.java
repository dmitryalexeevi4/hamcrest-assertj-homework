package com.github.dmitryalexeevi4;

import org.slf4j.*;
import org.testng.annotations.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJTest {
    private static final Logger LOG = LoggerFactory.getLogger(AssertJTest.class);

    List<String> sovietCars = Arrays.asList("Volga", "Moskvitch", "Lada");

    @Test
    public void assertJExample() {
        assertThat(sovietCars)
                .hasSize(3)
                .contains("Volga", "Moskvitch")
                .doesNotContain("Audi");

        LOG.info("AssertJTest complete!");
    }
}
