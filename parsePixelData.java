import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class parsePixelData {
	public static void main(String []args) throws FileNotFoundException{
		Scanner infile;
		String data[];
		int countLines=0;
		int countNumbers=0;
		infile=new Scanner(new File(args[0]));
		ArrayList pixelList=new ArrayList(100);
		while(infile.hasNextLine()){
			data=infile.nextLine().split("\\s+");
			pixelList=getNextRow(data);
			for(int a=0;a<pixelList.size();a++){
				System.out.print(pixelList.get(a)+",");
			}
			
			System.out.println(""); 
		/*	countLines++;
			for(int a=0;a<785;a++){
				data=infile.nextInt();
				System.out.print(data+",");
				countNumbers++;
			}
			infile.nextLine();
			System.out.println("\n"+countNumbers);
			countNumbers=0; */
		}
	//	System.out.println(countLines);	
			
		infile.close();
	}
	public static ArrayList getNextRow(String pixels[]){
		ArrayList tempRow=new ArrayList(785);
		for(int a=0;a<785;a++){
			tempRow.add(Integer.parseInt(pixels[a]));
		}
		return tempRow;
	}
}
