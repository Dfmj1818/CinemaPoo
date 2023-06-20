package Model;

import java.util.ArrayList;
import java.util.Iterator;

import View.View;

public class Cinema {
	private ArrayList<ArrayList<String>>cinemaHall;
	private ArrayList<Movie> moviesList;
	private View view;
	private User user;
	private String listAsString;

	public Cinema() {
		cinemaHall= new ArrayList<>();	
		view=new View();
		user=new User();
		moviesList=new ArrayList<Movie>();

	}

	public void setCinemaHall(ArrayList<ArrayList<String>>cinemaHall) {
		this.cinemaHall=cinemaHall;
	}

	public ArrayList<ArrayList<String>> getCinemaHall(){
		return cinemaHall;
	}

	public void addingChairsToCinema() {

		ArrayList<String>row1=new ArrayList<String>();
		cinemaHall.add(row1);
		row1.add("[0-0]");
		row1.add("[0-1]");
		row1.add("[0-2]");
		row1.add("[0-3]");
		row1.add("[0-4]");
		row1.add("[0-5]");

		ArrayList<String>row2=new ArrayList<String>();
		cinemaHall.add(row2);
		row2.add("[1-0]");
		row2.add("[1-1]");
		row2.add("[1-2]");
		row2.add("[1-3]");
		row2.add("[1-4]");
		row2.add("[1-5]");

		ArrayList<String>row3=new ArrayList<String>();
		cinemaHall.add(row3);
		row3.add("[2-0]");
		row3.add("[2-1]");
		row3.add("[2-2]");
		row3.add("[2-3]");
		row3.add("[2-4]");
		row3.add("[2-5]");

		ArrayList<String>row4=new ArrayList<String>();
		cinemaHall.add(row4);
		row4.add("[3-0]");
		row4.add("[3-1]");
		row4.add("[3-2]");
		row4.add("[3-3]");
		row4.add("[3-4]");
		row4.add("[3-5]");

		ArrayList<String>row5=new ArrayList<String>();
		cinemaHall.add(row5);
		row5.add("[4-0]");
		row5.add("[4-1]");
		row5.add("[4-2]");
		row5.add("[4-3]");
		row5.add("[4-4]");
		row5.add("[4-5]");
		;
	}


	public void selectChair(Cinema cinemaHall, int selectedColumn,int selectedRow) {
			

		String selectedChair=cinemaHall.getCinemaHall().get(selectedRow).get(selectedColumn);	
		if(selectedChair.contains("[X]")) {
			view.showMessage("Esta silla esta Ocupada,Por favor selecciona otra silla");
			
		}
		else {		
			view.showMessage("Haz Seleccionado La silla numero"+selectedChair);
			cinemaHall.getCinemaHall().get(selectedRow).set(selectedColumn, "[X]");
			view.showMessage("Asiento Asignado correctamente");	
		}



	}

	public void addMoviesToList(Movie movie) {
		moviesList.add(movie);
	}

	public void showMovieBillboard() {
		for(int i=0;i<moviesList.size();i++) {
			Movie currentMovie=moviesList.get(i);
			listAsString=currentMovie.getMovieId()+" Nombre: "+currentMovie.getMovieName()+" --Duracion: "+currentMovie.getMovieDuration()+" Min.";
			view.showMessage(listAsString);
		}
	}


	public void showChairs(ArrayList<ArrayList<String>>currentCinemaHaLL) {
		for(int i=0;i<currentCinemaHaLL.size();i++) {
			ArrayList<String>currentCinemaHallRow=currentCinemaHaLL.get(i);
			view.showArrayList(currentCinemaHallRow);
		}

		//for(int i=0;i<cinemaHall.size();i++) {
		//ArrayList<String>cinemaHallArrayList=cinemaHall.get(i);
		//view.showArrayList(cinemaHallArrayList);

		//}
	}



}
