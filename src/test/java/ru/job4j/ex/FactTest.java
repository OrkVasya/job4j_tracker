package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FactTest {
    @Test
    public void whenCorrect() {
        Fact fact = new Fact();
        int rsl = fact.calc(3);
        assertThat(rsl).isEqualTo(6);
    }

    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Fact fact = new Fact();
                    fact.calc(-1);
                }
        );
        assertThat(exception.getMessage()).isEqualTo("N could not be less than 0");
    }
}