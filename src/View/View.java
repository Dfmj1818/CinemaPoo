package View;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
	private Scanner scannerInt;
	private Scanner scannerString;

	public View() {
		scannerInt=new Scanner(System.in);
		scannerString=new Scanner(System.in);
	}

	public void showMessage(String message) {
		System.out.println(message);
	}

	public void showArrayList(ArrayList<String>cinemaChairs) {
		System.out.println(cinemaChairs);
	}

	public int readInt() {
		return scannerInt.nextInt();

	}

	public String readString() {
		return scannerString.nextLine();

	}

}
