package com.orange.ccmd.dojo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreeterShould {

    @Test
    void greetCorrectly() {
        assertThat(new Greeter().greet("Julien"))
                .isEqualTo("Hello, Julien");
    }
}