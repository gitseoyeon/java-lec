package lec17.codingtest;

public class Easy1 {
    public static int getFullPageCount(int itemsCount, int itemsPerPage) {
        return itemsCount / itemsPerPage;
    }

    public static void main(String[] args) {
        System.out.println(getFullPageCount(10, 5));
        System.out.println(getFullPageCount(7, 2));
    }
}
