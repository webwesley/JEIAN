package chap3;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileViewer extends Frame implements ActionListener {
	String directory;
	TextArea textarea;

	public FileViewer() {
		this(null, null);
	}

	public FileViewer(String filename) {
		this(null, filename);
	}

	public FileViewer(String directory, String filename) {
		super();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		textarea = new TextArea("", 24, 80);
		textarea.setFont(new Font("MonoSpaced", Font.PLAIN, 12));
		textarea.setEditable(false);
		this.add("Center", textarea);

		Panel p = new Panel();
		p.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 5));
		this.add(p, "South");

		Font font = new Font("SansSerif", Font.BOLD, 14);
		Button openfile = new Button("Open File");
		Button close = new Button("Close");
		openfile.addActionListener(this);
		openfile.setActionCommand("open");
		openfile.setFont(font);
		close.addActionListener(this);
		close.setActionCommand("close");
		close.setFont(font);
		p.add(openfile);
		p.add(close);

		this.pack();

		if (directory == null) {
			File f;
			if ((filename != null) && (f = new File(filename)).isAbsolute()) {

				directory = f.getParent();
				filename = f.getName();
			} else {
				directory = System.getProperty("User.dir");
			}

			this.directory = directory;
			setFile(directory, filename);
		}
	}

	public void setFile(String directory, String filename) {
		if ((filename == null) || (filename.length() == 0)) {
			return;
		}
		File f;
		FileReader in = null;

		try {
			f = new File(directory, filename);
			in = new FileReader(f);
			char[] buffer = new char[4096];
			int len;
			textarea.setText("");
			while ((len = in.read(buffer)) != -1) {
				String s = new String(buffer, 0, len);
				textarea.append(s);
			}
			this.setTitle("FileViewer: " + filename);
			textarea.setCaretPosition(0);
		} catch (IOException e) {
			textarea.setText(e.getClass().getName() + ": " + e.getMessage());
			this.setTitle("fileWiewer: " + filename + ":I/O Exception!");
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("open")) {
			FileDialog f = new FileDialog(this, "Open File", FileDialog.LOAD);
			f.setDirectory(directory);
			f.setVisible(true);
			directory = f.getDirectory();
			setFile(directory, f.getFile());
			f.dispose();
		} else if (cmd.equals("close")) {
			this.dispose();
		}
	}
	
	static public void main(String[] args) throws IOException {
		Frame f = new FileViewer((args.length == 1)?args[0]:null);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
	}

}