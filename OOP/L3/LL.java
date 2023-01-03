import java.util.Iterator;

public class LL<U> implements Chained<U>, Iterable<U>{
    private class Zveno<U>{

        private U content;
        private Zveno<U> next;
        private Zveno<U> prev;
        public Zveno(U content, Zveno<U> prev, Zveno<U> next) {
            this.content = content;
            this.prev = prev;
            this.next = next;
        }

        public U getContent() { return content; }

        public Zveno<U> getNext() { return next; }
        public Zveno<U> getPrev() { return prev; }
        public void setContent(U content) { this.content = content; }

        public void setNext(Zveno<U> next) {  this.next = next; }
        public void setPrev(Zveno<U> prev) { this.prev = prev; }
    }
    @Override
    public Iterator<U> iterator() {
        return new Iterator<U>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index<size;
            }
            @Override
            public U next() {
                return get(index++);
            }
        };
    }
    private Zveno<U> first;
    private Zveno<U> last;
    private int size = 0;
    public LL() {
        last = new Zveno<U>(null, first,null);
        first = new Zveno<U>(null, null, last);
        size=0;
    }

    @Override
    public void addLast(U u) {
        Zveno<U> element = last;
        element.setContent(u);
        last = new Zveno<>(null, element,null);
        element.setNext(last);
        size++;
    }

    @Override
    public void addFirst(U u) {
        Zveno<U> element = first;
        element.setContent(u);
        first = new Zveno<>(null, null,element);
        element.setPrev(first);
        size++;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public U get(int counter) {
        Zveno<U> bingo = first.getNext();
        for (int i = 0; i < counter; i++)
            bingo=getNextZveno(bingo);
        return bingo.getContent();
    }

    private Zveno<U> getNextZveno(Zveno<U> curr) { return curr.getNext();}


}

