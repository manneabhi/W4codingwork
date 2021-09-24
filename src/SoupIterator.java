public class SoupIterator implements Iterator {

	Soup[] lst;
	public int index = 0;
	
	public SoupIterator(Soup[] lst) {

		this.lst = lst;
	}

	@Override
	public boolean hasnext()
	{		
		if (index >=lst.length ||
	            lst[index] == null)
	            return false;
	        else
	            return true;
	 }

	@Override
	public Object next() {
		 Soup s = lst[index];
	        index += 1;
	        return s;
	}

}
