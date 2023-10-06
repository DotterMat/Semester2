package Opg1;

public class TestObserver {
    public static void main(String[] args) {
       ObservableBag observarableBag = new ObservableBag();
        ObserverBag observerBag = new ObserverBag() {
            @Override
            public void elementAdded(String element, int count) {
                System.out.println("Added: " + element + " count: " + count);
            }
            @Override
            public void elementRemove(String element, int count) {
                System.out.println("Removed " + element + " count: " + count);
            }
        };
        observarableBag.setObserver(observerBag);
        observarableBag.add("apple");
        observarableBag.add("banana");
        observarableBag.add("apple");
        observarableBag.add("orange");

        // Removing elements
        observarableBag.remove("apple");
        observarableBag.remove("banana");

        // Getting count for an element
        int count = observarableBag.getCount("orange");
        System.out.println("Count of orange: " + count);

        System.out.println("Elements: ");
        for (String element : observarableBag.getElements().keySet()) {
            System.out.println(element);
        }
    }
}
