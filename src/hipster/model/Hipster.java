package hipster.model;

/**
 * Creates the hipster project.
 * @author Kiani Ellingson
 *@version 1.2 11/21/13 Added getter/setter
 */

public class Hipster
{
	/**
	 * Name of the hipster
	 */
	private String name;
	/**
	 * Type of the hipster.
	 */
	private String hipsterType;
	/**
	 * Hipster's phrase.
	 */
	private String hipsterPhrase;
	/**
	 * Collection of the hipster books.
	 */
	private String [] hipsterBooks;
		
	/**
	 * Creates a hipster object with values based on myself.
	 */
	public Hipster()
	{
		hipsterBooks = new String[5];
		name = "Kiani";
		hipsterType = "Hipster Girl";
		hipsterPhrase = "Rachet";
		
		fillTheBooks();
	}
	
	/**
	 * Creates a Hipster Object with the specified parameters to fill the component data members. 
	 * @param name: the name of the Hipster
	 * @param hipsterType: type of hipster
	 * @param hipsterPhrase: a hipster phrase
	 * @param HipsterBooks: array of hipster books
	 */
	public Hipster(String name, String hipsterType, String hipsterPhrase, String [] HipsterBooks)
	{
		this.name = name;
		this.hipsterBooks = HipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;
	}

	/**
	 * Getter method to get that name. 
	 * @return The name of the Hipster. 
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Getter method to get that hipster type.
	 * @return The type of Hipster.
	 */
	public String getHipsterType()
	{
		return hipsterPhrase;
		
	}
	/**
	 * Getter method for the hipster phrase
	 * @return The Hipster phrase.
	 */
	public String getHipsterPhrase()
	{
		return hipsterPhrase;
		
	}
	/**
	 * Getter method for the hipster books.
	 * @return The hipster books. 
	 */
	public String[] getHipsterBooks()
	{
		return hipsterBooks;
		
	}
	
	/**
	 * setter method to change the name of the hipster.
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * setter method the change the type of the hipster. 
	 * @param hipsterType: New hipster type
	 */
	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}
	/**
	 * Setter method to change the phrase of the Hipster
	 * @param hipsterPhrase: New hipster phrase
	 */
	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}
	/**
	 * Setter method for the array of books for the hipster.
	 * @param hipsterBooks: New array of books for the hipster.
	 */
	public void setHipsterBooks(String [] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}
	/**
	 * Helper method to fill the book array for the hipster. 
	 */
	private void fillTheBooks()
	{
		hipsterBooks[0] = "Oxford Dictionary";
		hipsterBooks[1] = "Brave New World";
		hipsterBooks[2] = "1984";
		hipsterBooks[3] = "Infinite Jest";
		hipsterBooks[4] = "V for Vendetta";
		
	}
	

}
