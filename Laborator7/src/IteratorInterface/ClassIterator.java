package IteratorInterface;

import org.apache.commons.lang3.ArrayUtils;

public class ClassIterator  implements OrderedIterator {///implements Iterator{
    private Card[] cards = new Card[13];
    private int size = 13;
    private int iterator = 1;

    public ClassIterator(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public boolean hasNext() {
        return (iterator < 11);
    }

    @Override
    public void remove() {
        if(size > 0) {
            cards = ArrayUtils.remove(cards, iterator);
            size--;
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            return cards[iterator++];
        }
        return null;
    }



    @Override
    public int put(Comparable comparable , Card card) {
       if( ArrayUtils.contains(cards , card))
           return 0;
       ArrayUtils.add(cards , card);
       size++;
       return size;
    }
}
