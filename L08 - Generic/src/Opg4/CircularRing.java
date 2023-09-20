package Opg4;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class CircularRing<T> implements Ring<T> {
    private List<T> items; // En liste til at opbevare elementerne i ringen.
    private int currentIdx; // Indekset for den nuværende genstand.

    public CircularRing() {
        items = new ArrayList<>();
        currentIdx = -1; // Ingen nuværende genstand i en tom ring.
    }

    public void advance() {
        if (!isEmpty()) { // Kontroller om ringen ikke er tom.
            currentIdx = (currentIdx + 1) % size(); // Flyt til den næste genstand i ringen (cirkulært).
        }
    }


    public T getCurrentItem() {
        if (isEmpty()) {
            throw new EmptyRingException("Ring is empty. Cannot retrieve current item.");
        }
        return items.get(currentIdx);
    }

    public void add(T item) {
        if (isEmpty()) {
            // Hvis ringen er tom, skal den nye genstand være den eneste i ringen.
            currentIdx = 0;
        } else {
            // Hvis ringen ikke er tom, skal den nye genstand indsættes efter den nuværende genstand.
            currentIdx = (currentIdx + 1) % size(); // Flyt til det næste indeks (cirkulært).
        }
        items.add(currentIdx, item); // Tilføj den nye genstand på det beregnede indeks.
    }

    public boolean removeItem(T item) {
        if (isEmpty()) {
            return false; // Kan ikke fjerne noget fra en tom ring.
        }

        int indexToRemove = items.indexOf(item);
        if (indexToRemove != -1) {
            items.remove(indexToRemove);
            if (indexToRemove <= currentIdx) {
                // Hvis den fjernede genstand er før eller på den nuværende genstands position,
                // skal den nuværende position justeres.
                currentIdx = (currentIdx - 1 + size()) % size();
            }
            return true; // Elementet blev fjernet.
        }

        return false; // Elementet blev ikke fundet i ringen.
    }

    public T removeCurrentItem() {
        if (isEmpty()) {
            throw new EmptyRingException("Ring is empty. Cannot remove current item.");
        }

        T removedItem = items.remove(currentIdx);
        if (isEmpty()) {
            currentIdx = -1; // Hvis der ikke er nogen elementer tilbage, nulstil den nuværende position.
        } else {
            currentIdx = currentIdx % size(); // Juster den nuværende position efter fjernelsen (cirkulært).
        }

        return removedItem;
    }

    public int size() {
        return items.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}
