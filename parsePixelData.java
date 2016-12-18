//Uses the machineLrnFinalTrainSubset.txt found under the master and is loaded into args[0]

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class parsePixelData {
	public static void main(String []args) throws FileNotFoundException{
		Scanner infile;
		String data[];
		infile=new Scanner(new File(args[0]));
		ArrayList<Integer> pixelList=new ArrayList<Integer>(100);
		while(infile.hasNextLine()){
			data=infile.nextLine().split("\\s+");
			pixelList=getNextRow(data);
			for(int a=0;a<pixelList.size();a++){
				System.out.print(pixelList.get(a)+",");
			}
			System.out.println("");
		}
		infile.close();
	}
	public static ArrayList<Integer> getNextRow(String pixels[]){
		ArrayList<Integer> tempRow=new ArrayList<Integer>(785);
		for(int a=0;a<785;a++){
			tempRow.add(Integer.parseInt(pixels[a]));
		}
		return tempRow;
	}
}
