package lec12.inner;

class Outer2 {
    private class HiddenInner {
        void secret() {
            System.out.println("This is private");
        }
    }

    public void reveal() {
        HiddenInner hiddenInner = new HiddenInner();
        hiddenInner.secret();
    }
}

public class Hidden {
}
