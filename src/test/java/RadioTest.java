import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void moreThanMaxNumbers() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(20);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void withTheBordersNumbers() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(6);

        int expected = 6;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void belowLimitValueNumber() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValuNumber() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValutNumber() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingBoundaryNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(4);

        radio.next();

        int expected = 5;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchingMoreBoundaryNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchingMBoundaryNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchingMoPrevBoundaryNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingMPrevBoundaryNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(2);

        radio.prev();

        int expected = 3;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingPlusBoundaryVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.plus();

        int expected = 3;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingMinBoundaryVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);

        radio.minus();

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingMinGrBoundaryVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.minus();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingPlusGRBoundaryVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.plus();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowLimitVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowLimitMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test() {
        Radio radio = new Radio(20);

        radio.setCurrentStationNumber(15);

        int expected =15;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio radio = new Radio(20);

        radio.setCurrentStationNumber(25);

        int expected =0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}
