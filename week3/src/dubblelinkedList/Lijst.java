package dubblelinkedList;

import java.util.*;

public class Lijst 
{
  private Entry header;
  private int size;

  // Constructor voor een lege lijst
  public Lijst() 
  {
    header = new Entry( null, null, null );
    header.next = header;
    header.previous = header;
  }

  // Object vooraan toevoegen
  public void addFirst( Object o ) 
  {
    addBefore( o, header.next );
  }

  // Object vooraan opvragen
  public Object getFirst() 
  {
    if(header.next.element != null){
      return header.next.element;
    }
    return null;
  }

  // Object vooraan verwijderen
  public Object removeFirst() 
  {
    Object tempObject = null;
    if(header.next.element != null){
      tempObject = header.next.element;
      header.next.next.previous = header;
      header.next = header.next.next;

      if(size ==1){
        header.previous = header;
      }
      size--;
    }
    return tempObject;

  }

  public void addLast(Object o){
    Entry newEntry = new Entry(0,header,header.previous);
    header.previous = newEntry;
    if(header.next.element == null){
      header.next = newEntry;
    }
  }

  public Object getLast(){
    return header.previous;
  }

  public Object removeLast(){
    Object tempObject = null;
    if(header.previous.element != null){
      tempObject = header.previous.element;
      header.previous = header.previous.previous;
      if(size == 1){
        header.next =header;
      }
      size--;
    }

    return tempObject;
  }


  // Aantal objecten in de lijst afleveren
  public int size() 
  {
    return size;
  }

  // De lijst leegmaken
  public void clear() 
  {
    header = new Entry( null, null, null );
    header.next = header;
    header.previous = header;
    size= 0;
  }

  // Lever een iterator voor de lijst
  public Iterator iterator() 
  {
    return new LItr();
  }

  // private methoden

  private void addBefore( Object o, Entry e ) 
  {
    Entry newEntry = new Entry(o, e, e.previous);
    newEntry.previous.next = newEntry;
    newEntry.next.previous = newEntry;
    size++;
  }

  private void remove( Entry e ) 
  {
    if( e == header )
      throw new NoSuchElementException( 
        "Kan Entry niet verwijderen: is header" );

    e.previous.next = e.next;
    e.next.previous = e.previous;
    size--;
  }

  // Inwendige klasse LItr
  private class LItr implements Iterator 
  {
    private Entry pos = header;

    public boolean hasNext() 
    {
      return pos.next != header;
    }

    public Object next() 
    {
      pos = pos.next;
      return pos.element;
    }

    public boolean hasPrevious() 
    {
      return pos.previous != header;
    }

    public Object previous() 
    {
      pos = pos.previous;
      return pos.element;
    }
  } // Einde inwendige klasse LItr


  // Inwendige klasse Entry
  private class Entry 
  {
    Object element;
    Entry next;
    Entry previous;

    Entry( Object element, Entry next, Entry previous ) 
    {
      this.element = element;
      this.next = next;
      this.previous = previous;
    }
  } // Einde inwendige klasse Entry

} // Einde klasse Lijst
	
