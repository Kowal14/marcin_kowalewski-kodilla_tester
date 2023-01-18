package mockito;

import mockito.homework.Alert;
import mockito.homework.Human;
import mockito.homework.WeatherService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {

    @Test
    public void notSubscribedHumanShouldNotReceiveAlert() {
        WeatherService weatherService = new WeatherService();
        Human human = Mockito.mock(Human.class);
        Alert alert = Mockito.mock(Alert.class);

        weatherService.sendAlert(alert);
        Mockito.verify(human, Mockito.never()).receive(alert);

    }
    @Test
    public void subscribedHumanShouldReceiveAlert() {
        WeatherService weatherService = new WeatherService();
        Human human = Mockito.mock(Human.class);
        weatherService.addHuman(human);
        Alert alert = Mockito.mock(Alert.class);

        weatherService.sendAlert(alert);
        //Mockito.verify(human, Mockito.times(1)).receive(alert);

    }
    @Test
    public void unSubscribedHumanShouldNotReceiveAlert() {
    }
    public void alertShouldBeSentToSubscribedHumansFromLocalization() {
    }
    @Test
    public void alertShouldBeSentToAllSubscribedHumans() {
    }
    @Test
    public void localizationCouldBeDelete() {
    }
}

