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
		ArrayList<Double> pixelList=new ArrayList<Double>(785);
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
	public static ArrayList<Double> getNextRow(String pixels[]){
		double num; 
		ArrayList<Double> tempRow=new ArrayList<Double>(785);
		double max=-1;
		for(int a=0;a<785;a++){ //this for loop fills the arrayList from the txt file
			num=Integer.parseInt(pixels[a]);
			if(num>max) max=num; //checks if the current added value is a max value
			tempRow.add(num);
		}
		for(int a=1;a<785;a++){ //this for loop normalizes all the indexes
			tempRow.set(a, tempRow.get(a)/max);
		}
		//System.out.println(max);
		return tempRow;
	}
	public int findMax(ArrayList<Integer> list){
		int max=0;
		return max;
	}
}
