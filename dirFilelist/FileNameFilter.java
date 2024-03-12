import java.io.File;
import java.io.FilenameFilter;

public class FileNameFilter implements FilenameFilter{
	 String parameter;
	
	 public	FileNameFilter() { }
   
	 public	FileNameFilter(String parameter){
        this.parameter= parameter;
	}
	public boolean accept(File dir , String name)	{

      return name.equals(  parameter  );

	}

}