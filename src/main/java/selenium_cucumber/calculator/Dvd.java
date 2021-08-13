package selenium_cucumber.calculator;

public class Dvd {

	private int id;
	private String title;
	private String year;
	private String actor;

	public Dvd() {
		super();
	}

	public Dvd(int id, String title, String year, String actor) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.actor = actor;
	}
	
	public Dvd( String title, String year, String actor) {
		super();
		this.title = title;
		this.year = year;
		this.actor = actor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return title + " - " + year + " - " + actor;
	}
	
}
