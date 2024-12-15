import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JPanel;

import utils.Utils;

public class LoaderCustom extends JPanel implements Runnable, KeyListener {
	private static final long serialVersionUID = 6657893917149977972L;

	public static void main(String[] args) throws URISyntaxException {
		Utils.jar_folder = (getJarDirectory().toString());
		Utils.save_folder = Utils.jar_folder + "/" + "dr_save";
		File directory = new File(Utils.save_folder);
		if (!directory.exists()) {
			directory.mkdir();
		}
		if (directory.exists() == false) {
			System.exit(0);
		}
		new LoaderCustom();
	}

	private static Path getJarDirectory() throws URISyntaxException {
		Path jarPath = Paths.get(LoaderCustom.class.getProtectionDomain().getCodeSource().getLocation().toURI())
				.toAbsolutePath();
		return jarPath.getParent();
	}

	GloftDIRU gloftDIRU;

	public Dimension getPreferredSize() {
		return new Dimension(Utils.WIDTH * Utils.SCALE, (Utils.HEIGHT * Utils.SCALE));
	}

	public LoaderCustom() {
		gloftDIRU = new GloftDIRU();
		gloftDIRU.startApp();
		JFrame frame = new JFrame();
		frame.setTitle("DiamondRush_s40v3a_N6233");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		frame.addKeyListener(this);
		frame.add(this);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		while (true) {
			try {
				repaint();
				Thread.sleep(16);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static BufferedImage canvas;

	public void paint(Graphics g) {
		if (gloftDIRU.a_i == null) {
			System.exit(0);
		}
		g.drawImage(canvas, 0, 0, canvas.getWidth() * Utils.SCALE, canvas.getHeight() * Utils.SCALE, null);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			gloftDIRU.a_i.keyPressed(52);
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			gloftDIRU.a_i.keyPressed(54);
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			gloftDIRU.a_i.keyPressed(50);
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			gloftDIRU.a_i.keyPressed(56);
		} else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			gloftDIRU.a_i.keyPressed(53);
		} else if (e.getKeyCode() == KeyEvent.VK_Q) {
			gloftDIRU.a_i.keyPressed(6);
		} else if (e.getKeyCode() == KeyEvent.VK_W) {
			gloftDIRU.a_i.keyPressed(7);
		} else if (e.getKeyCode() == 106) {
			gloftDIRU.a_i.keyPressed(42);
		}
//		System.out.println(e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			gloftDIRU.a_i.keyReleased(52);
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			gloftDIRU.a_i.keyReleased(54);
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			gloftDIRU.a_i.keyReleased(50);
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			gloftDIRU.a_i.keyReleased(56);
		} else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			gloftDIRU.a_i.keyReleased(53);
		} else if (e.getKeyCode() == KeyEvent.VK_Q) {
			gloftDIRU.a_i.keyReleased(6);
		} else if (e.getKeyCode() == KeyEvent.VK_W) {
			gloftDIRU.a_i.keyReleased(7);
		} else if (e.getKeyCode() == 106) {
			gloftDIRU.a_i.keyReleased(42);
		}
	}

}
