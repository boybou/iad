package ding;

public class Lijst
{
    private Entry header; 
    private Entry tail;
    
    private int size;

	
	public Lijst ()
	{
		header = null;
        tail = null;
        size = 0;
	}
	
	public Iterator iterator ()
	{
		return (new LijstIterator());
	}
	
	public void addFirst (Object o)
	{
		size++;
        header = new Entry(o,header);
		if(header.next == null){
			tail = header;
		}
	}
	
	public Object removeFirst ()
	{
		Object tempObject = null;
		if(size != 0){
			size--;
			if(header.next == null){
				tempObject = header.element;
				header = null;
				tail = null;

				return tempObject;
			}
			tempObject = header.element;
			header = header.next;

			return tempObject;
		}
		return tempObject;

	}

	public Object getFirst ()
	{
        Iterator it = iterator();
		if(!it.hasNext()){
			return null;
		}
		else{
			return it.next();
		}

	}
	

    public void addLast (Object o)
    {
    	size++;
    	if(tail != null){
			Entry temp = tail;
			temp.next = new Entry(o,null);
			tail = temp.next;
		}
		else{

    		tail = new Entry(o,null);
    		header = tail;
		}

    }
	
	public Object removeLast ()
    {
		Entry tempTail = header;
    	Object tempObj;
    	int tempSize = size;
		if(size == 1){
    		tempObj = header.element;
    		header = null;
    		tail = null;
		}
		else if(size == 2){
			tempObj = header.next.element;
    		tail = header;
    		header.next = null;
		}
		else if(size > 2){
			while(tempSize > 2){
				tempTail = tempTail.next;
				tempSize--;
			}
			tempObj = tempTail.next.element;
			tempTail.next = null;
			tail = tempTail;
		}
		else{
			return null;
		}

		this.size--;
		return tempObj;

    }


	public int getSize() {
		return size;
	}

	public Object getLast ()
    {
    	if(tail!= null){
			return tail.element;
		}
		return null;

    }
	
	
	// inwendige klasse LijstIterator
	private class LijstIterator implements Iterator
	{
	    Entry pos = header; // pos houdt de huidige positie bij in een lijstobject
		
		public boolean hasNext()
		{
			return (pos != null);
		}
		public Object next()
		{
			Entry temp = pos;
			pos = temp.next;
			return (temp.element);
		}	
	}

	// inwendige klasse Entry
	private class Entry
	{
		Object element;
		Entry next;
		
		Entry (Object element, Entry next)
		{
			this.element = element;
			this.next = next;
		}
	}
}
