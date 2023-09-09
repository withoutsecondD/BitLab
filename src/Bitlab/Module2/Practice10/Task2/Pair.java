package Bitlab.Module2.Practice10.Task2;

public class Pair <A, B> {
    A first;
    B second;

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public Pair() {
    }

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }
}
