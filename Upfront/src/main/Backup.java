package main;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;

public class Backup {
	File dir, bcdir;
	 Path fileDir;
	
	
	public static void main(String[] args) {
		Backup bc = new Backup();
		
		bc.dir = new File("D:/Documents/Coding/workspace/");
		bc.bcdir = new File("H:/workspace_backup");
		
		try {
			System.out.println("Running backup...");
			FileUtils.copyDirectory(bc.dir, bc.bcdir);
		} catch (IOException e1) {
			System.out.println("Unable to copy directories.");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.exit(0);
		}
		System.out.println("Finished.");
		//here is a comment
	}
}



