package lec12.inner;

public class OuterInMemory {
    private String data = "Outer data";

    class Inner {
        void printData() {
            System.out.println(data);
        }
    }

    public Inner createInner() {
        return new Inner();
    }
    public static void main(String[] args) {
        OuterInMemory outerInMemory = new OuterInMemory();
        OuterInMemory.Inner inner = outerInMemory.createInner();

        inner.printData();

        outerInMemory = null;
        inner.printData();

        inner = null;
        inner.printData(); // inner를 비우고 나면 참조할 대상이 비어있음
    }
}
