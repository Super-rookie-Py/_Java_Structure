import java.util.Scanner;
import java.io.*;
//201613365 �ڰǿ� ���� ���ϱ� �ǽ�

public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		String[] input;
		Date input_date;
		try {
			Scanner infile = new Scanner(new File("input.txt"));
			while(infile.hasNextLine()) {
				line = infile.nextLine();
				
				// DateŬ������ Year, Month, Day ���� �������� �и��Ͽ� ���� �Ҵ���.
				input = line.split(" ");
				input_date = new Date(Integer.parseInt(input[0]),Integer.parseInt(input[1]),Integer.parseInt(input[2]));
				if(input_date.isLeap()) {
					System.out.printf("%d�� %d�� %d���� �����Դϴ�.\n" ,input_date.getYear(),input_date.getMonth(),input_date.getDay());
				}else{
					System.out.printf("%d�� %d�� %d���� ������ �ƴմϴ�.\n", input_date.getYear(),input_date.getMonth(), input_date.getDay());
					}
			}

	}catch(FileNotFoundException e){
		System.out.println("Error opening the file");
	}

	}

}
