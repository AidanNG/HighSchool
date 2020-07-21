/*
 * Name: Aidan Gow
 * Block: B8
 * MyList Assignment
 *
 */

import java.util.*;
import static java.lang.System.*;

public class MyList
{
    private Object[] list;
    private int size; //num objects and next avail slot

    public MyList()
    {
        list = new Object[0];
    }

    public MyList(Object[] list) {
        this.list = list;
    }

    public MyList(int cap)
    {
        list= new Object[cap];
        size = 0;
    }
    //public MyList()this.list = list;
    //public Object get (int index){}
    public boolean add(Object o)
    {

        list = Arrays.copyOf(list, list.length+1);
        list[list.length-1] = o;
        size++;
        return true;
    }


    public boolean add(int index, Object o)
    {

        Object[] list2 = new Object[list.length+1];
        for (int i = 0; i< index; i++) list2[i] = list[i];
        list2[index] = o;
        for (int i = index; i < list.length; i++) list2[i+1] = list[i];
        list = list2;
        size++;
       return true;

    }

    public boolean contains(Object o){
    for(int i = 0; i < list.length-1; i++) if(list[i].equals(o)) return true;
    return false;
}

    public int indexOf(Object o){
    for(int i = 0; i < list.length-1; i++) if(list[i].equals(o)) return i;
    return -1;
}


    /*public boolean addAll(Object[] o)
    {

    }

    //optional bonus
    public boolean addAll(int index, Object[] o)
    {

    }
*/
    public MyList clone()
    {
        /*MyList list2 = new MyList(list.length);
        for(int i = 0; i < list.length-1; i++) list2.add(list[i]);
        return list2;*/
        return new MyList(list.clone());

    }

    public int capacity()
    {
        return list.length;
    }

    public void clear()
    {
        Arrays.fill(list,null);
    }

    private void expand()
    {
        list = Arrays.copyOf(list, list.length*2);
    }

    public int size()
    {
        return size;
    }
    public Object get(int number){
        for(int i = 0; i < list.length-1; i++){
            if (i==number) return list[i];
        }
        return null;
    }
    public boolean isEmpty(){
        if(size == 0) {
            return true;
        }else {return false;}
    }
    public Object set(int index, Object o){
        Object hi;
        Object[] fun = new Object[size];
        for(int i = 0;i<index;i++)
        {
            fun[i]=list[i];
        }
        hi = list[index];
        fun[index] = o;
        for(int i = index+1;i<size;i++)
        {
            fun[i]=list[i];
        }
        list = fun;
        return hi;

    }
    public void ensureCapacity(int minCapacity)
    {
        Object[] crap = new Object[minCapacity];
        for(int i = 0;i<size;i++)
        {
            crap[i]=list[i];
        }
        list = crap;
    }
    public boolean remove(Object o)
    {
        for(int i = 0;i<size;i++)
        {
            if(o.equals(list[i]))
            {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public Object[] toArray(){
        return list;
    }
    public ListIterator<Object> iterator(){
        return new MyIterator();
    }
    public String toString()
    {
    	
		ListIterator it = this.iterator();
        String fin = "[" +it.next();
        while(it.hasNext()){
        	fin += ", " + it.next();
        }
        fin += "]";
        //return Arrays.toString(list);
        return fin;
    }



    private class MyIterator implements ListIterator{
        private int nxt;
        @Override
        public boolean hasNext() {
            return nxt < size -1;
        }
        @Override
        public boolean hasPrevious() {
            return nxt -1 > -1;
        }

        @Override
        public Object next() {
            return MyList.this.get(nxt++);
        }
        @Override
        public Object previous(){
            return MyList.this.get(nxt--);

        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {
            MyList.this.remove(nxt);
            nxt--;

        }

        @Override
        public void set(Object o) {
            MyList.this.set(nxt,o);
        }


        @Override
        public void add(Object o) {
            MyList.this.add(o);
            nxt++;

        }
    }
}