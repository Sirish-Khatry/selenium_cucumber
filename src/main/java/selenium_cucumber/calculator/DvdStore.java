package selenium_cucumber.calculator;

import java.util.ArrayList;
import java.util.List;

public class DvdStore {

	private List<Dvd> dvds = new ArrayList<>();

	public void addDvd(Dvd dvd) {
		dvds.add(dvd);
	}

	public List<Dvd> getAllDvds() {

		return dvds;

	}

	public void removeDvd(Dvd dvd) {
		dvds.remove(dvd);
	}

}
