package Model;

public class Movie {
	private String movieName;
	private String movieGender;
	private String releaseDate;
	private int duration;
	private int moviedId;

	
	public Movie(int moviedId,String movieName,String movieGender,String releaseDate,int duration) {
		this.moviedId=moviedId;
		this.movieName=movieName;
		this.movieGender=movieGender;
		this.releaseDate=releaseDate;
		this.duration=duration;
	}
	
	public void setMoviedId(int movieId) {
		this.moviedId=movieId;
	}
	
	public int getMovieId() {
		return moviedId;
	}
	public void setMovieName(String movieName) {
		this.movieName=movieName;
	}
	
	public String getMovieName() {
		return movieName;
	}

    public void setMovieGender(String movieGender) {
    	this.movieGender=movieGender;
    }
    
    public String getMovieGender() {
    	return movieGender;
    }
    public void setReleaseDate(String releaseDate) {
    	this.releaseDate=releaseDate;
    }
    
    public String getReleaseDate() {
    	return releaseDate;
    }
    
    public void setMovieDuration(int duration) {
    	this.duration=duration;
    }
    
    public int getMovieDuration() {
    	return duration;
    }
    
}
