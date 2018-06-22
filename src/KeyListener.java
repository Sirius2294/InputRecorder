import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class KeyListener extends JComponent {
	
	public boolean up = false;
	public boolean down = false;
	public boolean left = false;
	public boolean right = false;
	
	public KeyListener() {
		this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0, false), "up");
		this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0, true), "!up");
		
		this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0, false), "down");
		this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0, true), "!down");
		
		this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0, false), "left");
		this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0, true), "!left");
		
		this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0, false), "right");
		this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0, true), "!right");
		
		
		this.getActionMap().put("up", new upPressedAction());
		this.getActionMap().put("!up", new upReleasedAction());
		this.getActionMap().put("down", new downPressedAction());
		this.getActionMap().put("!down", new downReleasedAction());
		this.getActionMap().put("left", new leftPressedAction());
		this.getActionMap().put("!left", new leftReleasedAction());
		this.getActionMap().put("right", new rightPressedAction());
		this.getActionMap().put("!right", new rightReleasedAction());
	}
	
	private class upPressedAction extends AbstractAction {
		@Override
		public void actionPerformed(ActionEvent event) {
			up = true;
		}
	}
	
	private class upReleasedAction extends AbstractAction {
		@Override
		public void actionPerformed(ActionEvent event) {
			up = false;
		}
	}
	
	private class downPressedAction extends AbstractAction {
		@Override
		public void actionPerformed(ActionEvent event) {
			down = true;
		}
	}
	
	private class downReleasedAction extends AbstractAction {
		@Override
		public void actionPerformed(ActionEvent event) {
			down = false;
		}
	}
	
	private class leftPressedAction extends AbstractAction {
		@Override
		public void actionPerformed(ActionEvent event) {
			left = true;
		}
	}
	
	private class leftReleasedAction extends AbstractAction {
		@Override
		public void actionPerformed(ActionEvent event) {
			left = false;
		}
	}
	
	private class rightPressedAction extends AbstractAction {
		@Override
		public void actionPerformed(ActionEvent event) {
			right = true;
		}
	}
	
	private class rightReleasedAction extends AbstractAction {
		@Override
		public void actionPerformed(ActionEvent event) {
			right = false;
		}
	}

}
