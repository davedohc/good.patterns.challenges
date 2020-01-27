import com.kodilla.good.patterns.challenges.flightSearch.DataBase;
import com.kodilla.good.patterns.challenges.flightSearch.FlightsDataBase;
import com.kodilla.good.patterns.challenges.flightSearch.FlightsSearchEngine;
import com.kodilla.good.patterns.challenges.flightSearch.SearchEngine;
import org.junit.Assert;
import org.junit.Test;

public class FlightsSearchTest {
    @Test
    public void testSearchFlightsFrom() {
        //Given
        DataBase flightsDataBase = new FlightsDataBase();
        SearchEngine flightsSearchEngine = new FlightsSearchEngine(flightsDataBase);

        //When
        DataBase flightsFromKrakow = flightsSearchEngine.getFlightsFrom("Krakow");

        //Then
        Assert.assertEquals("Searching flight Data Base for flights from Krakow", 2, flightsFromKrakow.getDataBase().size());
    }

    @Test
    public void testSearchFlightsTo() {
        //Given
        DataBase flightsDataBase = new FlightsDataBase();
        SearchEngine flightsSearchEngine = new FlightsSearchEngine(flightsDataBase);

        //When
        DataBase flightsToLodz = flightsSearchEngine.getFlightsTo("Lodz");

        //Then
        Assert.assertEquals("Searching flight Data Base for flights to Lodz", 1, flightsToLodz.getDataBase().size());
    }

    @Test
    public void testSearchFlightsBy() {
        //Given
        DataBase flightsDataBase = new FlightsDataBase();
        SearchEngine flightsSearchEngine = new FlightsSearchEngine(flightsDataBase);

        //When
        DataBase flightsByPoznan = flightsSearchEngine.getFlightsBy("Poznan");

        //Then
        Assert.assertEquals("Searching flight Data Base for flights by Poznan", 2, flightsByPoznan.getDataBase().size());
    }
}
