package IteratorInterface;

import java.util.Arrays;

public class Card implements Comparable<Card>{
    private char [] book;
    private int number;

    public Card(char[] book, int number) {
        this.book = book;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char[] getBook() {
        return book;
    }

    public void setBook(char[] book) {
        this.book = book;
    }

    @Override
    public int compareTo(Card o) {
        if(o.getNumber() == this.number)
            return 0;
        return (o.getNumber() > this.number) ? -1 : 1;
    }

    @Override
    public String toString() {
        return "Card{" +
                "book=" + Arrays.toString(book) +
                '}';
    }
}
