public class SoupCollection implements Collection{

	static final int MAX = 5;
    int items = 0;
    Soup[] Souplist;
  
    public SoupCollection()
    {
        Souplist = new Soup[MAX];
  
        // Let us add some dummy notifications
        addItem(1, "Hot and Corn Soup", 100);
        addItem(2, "Cicken Soup", 200);
        addItem(3, "Tomato Soup", 300);
        addItem(3, "Carrot Soup", 500);

    }
  
    public void addItem(int id, String str, int price)
    {
        Soup s = new Soup(id, str, price);
        if (items >= MAX)
            System.err.println("Full");
        else
        {
            Souplist[items] = s;
            items = items + 1;
        }
    }
 
	@Override
	public Iterator getIterator() {
		return new SoupIterator(Souplist);
	}

}
