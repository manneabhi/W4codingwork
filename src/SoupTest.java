

public class SoupTest {

	public static void main(String args[])
    {
	
	 SoupCollection soup = new SoupCollection() ;
	 SoupIterator iterator = (SoupIterator) soup.getIterator();
     System.out.println("Id "+"Name "+  "       Price ");

     while (iterator.hasnext())
     {
         Soup s = (Soup)iterator.next();
         System.out.println(s.getId()+ "  "+s.getName()+  " "+s.getPrice());
     }
}
}
