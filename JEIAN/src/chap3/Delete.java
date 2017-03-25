package chap3;

import java.io.File;

public class Delete {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.err.println("Usage: java Delete <file or directory>");
			System.exit(0);
		}
		
		try {
			delete(args[0]);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	public static void delete(String filename) {
		File f = new File(filename);
		if(!f.exists()) {
			System.out.println("Delete: no such file or directory: " + filename);
			return;
		}
		if(!f.canWrite()) {
			System.out.println("Delete: write protected: " + filename);
			return;
		}
		if (f.isDirectory()) {
			String [] files = f.list();
			if (files.length > 0) {
				System.out.println("Delete: directory not empty: "+filename);
				return;
			}
		}
		boolean success = f.delete();
		if(!success) {
			System.out.println("Delete: deletion failed");
			return;
		}
//		protected static fail(String msg) throws IllegalArgumentException {
//			throw new IllegalArgumentException(msg);
//		}
	}
}
