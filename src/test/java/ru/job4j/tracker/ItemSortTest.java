package ru.job4j.tracker;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ItemSortTest {
    @Test
    public void whenItemSortAscByName() {
        Item first = new Item("first");
        Item last = new Item("last");
        Item a = new Item("a");

        var items = Arrays.asList(first, last, a);
        var expected = Arrays.asList(a, first, last);

        items.sort(new ItemAscByName());
        assertThat(items.equals(expected)).isTrue();
    }

    @Test
    public void whenItemSortDescByName() {
        Item first = new Item("first");
        Item last = new Item("last");
        Item a = new Item("a");

        var items = Arrays.asList(first, last, a);
        var expected = Arrays.asList(last, first, a);

        items.sort(new ItemDescByName());
        assertThat(items.equals(expected)).isTrue();
    }
}
