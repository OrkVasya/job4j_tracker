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
        var len = evenElements.size();
        for (var i = 0; i < len; i += 2) {
            result.append(evenElements.pollFirst());
            evenElements.pollFirst();
        }
        return result.toString();
    }

    private String getDescendingElements() {
        var result = new StringBuilder();
        var len = descendingElements.size();
        for (var i = 0; i < len; i++) {
            result.append(descendingElements.pollLast());
        }
        return result.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
