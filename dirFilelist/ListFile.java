import java.io.File;

public class ListFile{
	 
	public static void main( String args[])	{
		if (args.length < 2)
			System.out.println("Please type: java ListFile directory_name filename");
		File f = new File(args[0]);

		if (f.isDirectory() == false) { // if it is a file
          if (f.exists() == false) 
            System.out.println("There is no such directory!");
        else 
            System.out.println("That file is not a directory.");
		} else { 
      			displayFiles(f ,args[1]);
			}
		}
	
	
	public static void displayFiles(File f1 , String arg) {
		
		
			String fileList[] = f1.list(new FileNameFilter( arg));
			for (int i=0; i<fileList.length; i++) {
				File f = new File(f1, fileList[i]);
				if (f.isDirectory() == false) {
              System.out.println( "Found File \"" + fileList[i] + "\"");
				} else {
              displayFiles(f, arg);
					}
			
			}		
			
		
	}		
}