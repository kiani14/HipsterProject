package hipster.view;

import hipster.controller.HipsterController;

import javax.swing.JFrame;

/**
 * Creates a JFrame for the project.
 * @author kell7444
 *
 */
public class HipsterFrame extends JFrame
{
	private HipsterController baseController;
	private HipsterPanel basePanel;
	/**
	 * This sets up the panel and frame
	 * @param baseController
	 */
	public HipsterFrame(HipsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * This sets the parameters and the visibility of the frame. 
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(450, 450);
		this.setVisible(true);
	}
}
