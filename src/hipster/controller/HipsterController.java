package hipster.controller;

import javax.swing.JOptionPane;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;

/**
 * This is the controller for the project.
 * @author kell7444
 * @version 1.2 11/21/13
 */
public class HipsterController
{
	private HipsterFrame appFrame;
	private Hipster selfHipster;
	private Hipster [] classHipsters;
	private int hipsterCount;
	
	public HipsterController()
	{
		selfHipster = new Hipster();
		classHipsters = new Hipster[50];
		hipsterCount = 0;
	}
	/**
	 * Starts the application for the Hipster representing myself.
	 */
	public void start()
	{
		appFrame = new HipsterFrame(this);
	}
	
	public Hipster [] getClassHipster() 
	{
		return classHipsters;
		
	}
	
	public Hipster getMyHipster()
	{
		return selfHipster;
		
	}
	
	public Hipster getSelfHipster()
	{
		return selfHipster;
		
	}
	
	/**
	 * Setter method to establish the myself as a hipster. 
	 * @param selfHipster
	 */
	public void setSelfHipster(Hipster selfHipster)
	{
		this.selfHipster = selfHipster;
	}
	
	/**
	 * Choses a specific hipster from an array.
	 * @param position 
	 * @return A specific hipster
	 */
	public Hipster getSpecifiedHipster(int position)
	{
		Hipster currentHipster = null;
		if(position < classHipsters.length && position >= 0)
		{
			currentHipster = classHipsters[position];
			
		}
		return currentHipster;
	}
	
	/**
	 * Creates and adds a Hipster to the array of class Hipsters from the specified values. 
	 * @param books
	 * @param name
	 * @param type
	 * @param phrase
	 */
	public void addHipster(String [] books, String name, String type, String phrase)
	{
		if(hipsterCount < classHipsters.length)
		{
			Hipster tempHipster = new Hipster(name, type, phrase, books);
			classHipsters[hipsterCount] = tempHipster;
			hipsterCount++;
		}
		else
		{
			JOptionPane.showMessageDialog(appFrame, "The class is complete");
		}
	}

	/**
	 * Used to retrieve a random Hipster object from the array of class Hipsters.
	 * @return A random hipster.
	 */
	public Hipster getRandomHipster()
	{
		Hipster currentHipster = null;
		
		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int) (random * classHipsters.length);
		currentHipster = classHipsters[randomIndex];
		
		return currentHipster;
	}
	

}
