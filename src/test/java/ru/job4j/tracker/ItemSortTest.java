package ru.job4j.tracker;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ItemSortTest {
    @Test
    public void whenItemSortAscByName() {
        Item first = new Item("first");
        Item last = new Item("last");
        Item a = new Item("a");

        var items = new ArrayList<Item>();
        items.add(first);
        items.add(last);
        items.add(a);

        var expected = new ArrayList<Item>();
        expected.add(a);
        expected.add(first);
        expected.add(last);

        items.sort(new ItemAscByName());
        assertThat(items.equals(expected)).isTrue();
    }

    @Test
    public void whenItemSortDescByName() {
        Item first = new Item("first");
        Item last = new Item("last");
        Item a = new Item("a");

        var items = new ArrayList<Item>();
        items.add(first);
        items.add(last);
        items.add(a);

        var expected = new ArrayList<Item>();
        expected.add(last);
        expected.add(first);
        expected.add(a);

        items.sort(new ItemDescByName());
        assertThat(items.equals(expected)).isTrue();
    }
}
