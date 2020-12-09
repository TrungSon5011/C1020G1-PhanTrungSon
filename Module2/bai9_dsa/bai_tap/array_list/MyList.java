package C1020G1.dsa.bai_tap.array_list;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements [] = new  Object[DEFAULT_CAPACITY];
    public MyList(){
    }
    public MyList(int capacity){
        Object elements [] = new Object[capacity];
        for(int i = 0; i < capacity;i++){
            add((E) elements[i]);
        }
    }
    public void add(E e) {
        if (size == elements.length) {
//            ensureCapacity();
        }
        elements[size++] = e;
    }
    public void add(int index, E element){
//        ensureCapacity();
        for (int i = size - 1; i >= index; i--){
            elements[i+1] = elements[i];
        }
        elements[index] = element;
//        size++;
//        data[i + 1] = data[i];
// Insert new element to data[index]
//        data[index] = e;
// Increase size by 1

    }
    public E remove(int index){
        E e = (E) elements[index];
        for (int j = index; j < size - 1; j++)
            elements[j] = elements[j + 1];
        elements[size - 1] = null;
        size--;
        return e;
    }
    public int size(){
        return size;
    }
    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i]))
                return true;
        return false;
    }
    public  int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) return i;
        }
        return -1;
    }
    public E get(int i ){
//        if (i < 0 || i >= size)
//            throw new IndexOutOfBoundsException
//                    ("index " + i + " out of bounds");
//        else {
            return (E) elements[i];
//        }
    }
    private void ensureCapacity() {
        if (size >= elements.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(elements, 0, newData, 0, size);
            elements = newData;
        }
    }
    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void display() {
        for(int i = 0; i < size;i++){
            System.out.println(elements[i]);
        }
    }
}
