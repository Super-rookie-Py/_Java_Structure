import java.util.Scanner;
import java.io.*;
//201613365 박건우 윤년 구하기 실습

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
				
				// Date클래스에 Year, Month, Day 값을 공백으로 분리하여 값을 할당함.
				input = line.split(" ");
				input_date = new Date(Integer.parseInt(input[0]),Integer.parseInt(input[1]),Integer.parseInt(input[2]));
				if(input_date.isLeap()) {
					System.out.printf("%d년 %d월 %d일은 윤년입니다.\n" ,input_date.getYear(),input_date.getMonth(),input_date.getDay());
				}else{
					System.out.printf("%d년 %d월 %d일은 윤년이 아닙니다.\n", input_date.getYear(),input_date.getMonth(), input_date.getDay());
					}
			}

	}catch(FileNotFoundException e){
		System.out.println("Error opening the file");
	}

	}

}
