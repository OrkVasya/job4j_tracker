package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenComparatorDescByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorAscByName() {
        Comparator<Job> cmpAscByNamePriority = new JobAscByName();
        int rsl = cmpAscByNamePriority.compare(
                new Job("Relaxing", 1),
                new Job("Do nothing", 0)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> cmpDescByNamePriority = new JobDescByName();
        int rsl = cmpDescByNamePriority.compare(
                new Job("Relaxing", 1),
                new Job("Do nothing", 0)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByPriority() {
        Comparator<Job> cmpAscByNamePriority = new JobAscByPriority();
        int rsl = cmpAscByNamePriority.compare(
                new Job("Relaxing", 1),
                new Job("Do nothing", 0)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> cmpDescByNamePriority = new JobDescByPriority();
        int rsl = cmpDescByNamePriority.compare(
                new Job("Relaxing", 1),
                new Job("Do nothing", 0)
        );
        assertThat(rsl).isLessThan(0);
    }

    
}