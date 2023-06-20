package Presenter;

import java.util.ArrayList;

import Model.Cinema;
import Model.Movie;
import Model.User;
import View.View;

public class Presenter {

	private View view;
	private Cinema cinema;
	private User user;
	private int digitedRow;
	private int digitedColumn;
	private int digitedOption;
	private Cinema superMarioCinemaHall;
	private Cinema carsCinemaHall;
	private Cinema fastAndFuriousCinemaHall;
	private String yesOrNotAnswer;

	public Presenter() {
		view=new View();
		cinema=new Cinema();
		user=new User();
		superMarioCinemaHall=new Cinema();
		carsCinemaHall=new Cinema();
		fastAndFuriousCinemaHall=new Cinema();

	}

	public void runMenu() {

		do {
			view.showMessage("Bienvenido a Royal Films");
			view.showMessage("A Continuacion te mostramos la cartelera de Peliculas\nElige la pelicula que quieras ver los Asientos");
			showMoviesBillboard();
			view.showMessage("4.Salir Del Programa");
			digitedOption=view.readInt();
			switch(digitedOption) {
			case 1:
				showCinemaChairs(fastAndFuriousCinemaHall);
				selectChair(fastAndFuriousCinemaHall);				
				break;
			case 2:
				showCinemaChairs(carsCinemaHall);
				selectChair(carsCinemaHall);				
				break;
			case 3:
				showCinemaChairs(superMarioCinemaHall);
				selectChair(superMarioCinemaHall);				
				break;
			case 4:
				view.showMessage("Saliendo Del Cine.....");
				System.exit(0);

			default:
				view.showMessage("La opcion numero "+digitedOption+" No Existe Por favor Vuelve a intentarlo,\n");
				break;

			}

		}while(digitedOption!=4);




	}


	public void addMoviesToList() {
		Movie fastAndFurious=new Movie(1,"Rapido y Furioso","Accion","02-2023",100);
		cinema.addMoviesToList(fastAndFurious);	
		Movie Cars=new Movie(2,"Cars","Infantil","08-2008",90);
		cinema.addMoviesToList(Cars);
		Movie superMario=new Movie(3,"Super Mario","Infantil","04-2023",80);
		cinema.addMoviesToList(superMario);
	}

	public void fillChairsToMoviesHall() {	 
		fastAndFuriousCinemaHall.addingChairsToCinema();		
		carsCinemaHall.addingChairsToCinema();	
		superMarioCinemaHall.addingChairsToCinema();

	}

	public void showMoviesBillboard() {
		cinema.showMovieBillboard();
	}

	public void showCinemaChairs(Cinema cinema){
		ArrayList<ArrayList<String>>currentCinemaHall=cinema.getCinemaHall();
		cinema.showChairs(currentCinemaHall);
	}


	public void selectChair(Cinema cinema) {	
			do {			
				view.showMessage("Digita la fila que deseas escoger ");
				digitedRow=view.readInt();
				view.showMessage("Digita La columna que deseas escoger");
				digitedColumn=view.readInt();
				cinema.selectChair(cinema, digitedColumn, digitedRow);
				view.showMessage("¿Deseas Elegir algun otro asiento?");
				yesOrNotAnswer=view.readString();

			} while(yesOrNotAnswer.equalsIgnoreCase("yes"));
			view.showMessage("La Eleccion de Tu Silla ha sido exitosa");
			showCinemaChairs(cinema);


		}
	






public static void main(String[]args) {
	Presenter presenter=new Presenter();
	presenter.addMoviesToList();
	presenter.fillChairsToMoviesHall();
	presenter.runMenu();

}

}
