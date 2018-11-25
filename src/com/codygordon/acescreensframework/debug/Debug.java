package com.codygordon.acescreensframework.debug;

import java.awt.Color;
import java.awt.Graphics;

import com.codygordon.acescreensframework.controller.BaseScreenController;
import com.codygordon.acescreensframework.view.AceContainer;
import com.codygordon.acescreensframework.view.AceScreen;

public class Debug {

	public static void main(String[] args) {
		new Debug();
	}
	
	public Debug() {
		AceContainer container = new AceContainer();
		container.setSize(500, 500);
		
		TestScreen testScreen = new TestScreen();
		testScreen.setSize(500, 500);
		
		BaseScreenController controller = new BaseScreenController(container);
		controller.showScreen(testScreen);
	}
	
	public class TestScreen extends AceScreen {
	
		private static final long serialVersionUID = 1L;

		public TestScreen() {
			setBackground(Color.RED);
		}
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.setColor(Color.BLUE);
			g.fillOval(50, 50, 150, 150);
		}
	}
}