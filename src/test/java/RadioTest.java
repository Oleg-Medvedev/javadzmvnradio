import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testConstruktor() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesConst() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesConst2() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesConst3() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesConst4() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(19);

        int expected = 19;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesConst5() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(20);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesConst6() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(21);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invalidLeftConst() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(-10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invalidRightConst() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(45);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationConst() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStationMaxConst() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(19);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationLimitValuesConst() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(18);

        radio.next();

        int expected = 19;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationLimitValuesConst2() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationLimitValuesConst3() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationConst() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMinConst() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 19;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationLimitValuesConst() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationLimitValuesConst1() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(18);

        radio.prev();

        int expected = 17;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationLimitValuesConst2() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);

        radio.prev();

        int expected = 18;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValues1() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValues2() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValues3() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValues4() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValues5() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValues6() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invalidLeft() {
        Radio radio = new Radio();

        radio.setCurrentStation(-10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invalidRight() {
        Radio radio = new Radio();

        radio.setCurrentStation(15);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationLimitValues() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationLimitValues2() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationLimitValues3() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationLimitValues() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationLimitValues1() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationLimitValues2() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.getCurrentStation();

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);

        radio.increaseVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);

        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMoreMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(110);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeLesMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-10);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
