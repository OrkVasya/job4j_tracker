package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;
    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        var result = new StringBuilder();
        int i = 0;
        for (Character evenElement : evenElements) {
            if (i % 2 == 0) {
                result.append(evenElement);
            }
            i++;
        }
        return result.toString();
    }

    private String getDescendingElements() {
        var result = new StringBuilder();
        var iter = descendingElements.descendingIterator();
        while (iter.hasNext()) {
            result.append(iter.next());
        }
        return result.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
