import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ExtractingDataFromCSV {
	
	public List<String[]> getData(String filename) {
		String line = "";  
		String splitBy = ",";
		String[] warehouse = null;
		List<String[]> data=new LinkedList<String[]>();
		try   
		{   
		BufferedReader br = new BufferedReader(new FileReader("..//"+filename));  
		while ((line = br.readLine()) != null)    
		{  
		warehouse = line.split(splitBy);
	    data.add(warehouse);
		}  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();  
		} 
		return data;
	}
	/*
	 * public static void main(String[] args) { List<String[]> result =
	 * getData("Example.csv"); for(int i=1;i<result.size();i++) {
	 * System.out.println(result.get(i)[1]); } }
	 */
	 
}
