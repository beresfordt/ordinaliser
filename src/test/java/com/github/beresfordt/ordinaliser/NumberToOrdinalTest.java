package com.github.beresfordt.ordinaliser;

import org.junit.Test;

import static com.github.beresfordt.ordinaliser.NumberToOrdinal.convertToOrdinal;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class NumberToOrdinalTest {

    @Test
    public void convertFirst() {
        assertThat(convertToOrdinal(1L), equalTo("First"));
    }

    @Test
    public void convertSecond() {
        assertThat(convertToOrdinal(2L), equalTo("Second"));
    }

    @Test
    public void convertThird() {
        assertThat(convertToOrdinal(3L), equalTo("Third"));
    }

    @Test
    public void convertFourth() {
        assertThat(convertToOrdinal(4L), equalTo("Fourth"));
    }

    @Test
    public void convertFifth() {
        assertThat(convertToOrdinal(5L), equalTo("Fifth"));
    }

    @Test
    public void convertSixth() {
        assertThat(convertToOrdinal(6L), equalTo("Sixth"));
    }

    @Test
    public void convertSeventh() {
        assertThat(convertToOrdinal(7L), equalTo("Seventh"));
    }

    @Test
    public void convertEighth() {
        assertThat(convertToOrdinal(8L), equalTo("Eighth"));
    }

    @Test
    public void convertNinth() {
        assertThat(convertToOrdinal(9L), equalTo("Ninth"));
    }

    @Test
    public void convertTenth() {
        assertThat(convertToOrdinal(10L), equalTo("Tenth"));
    }

    @Test
    public void convertEleventh() {
        assertThat(convertToOrdinal(11L), equalTo("Eleventh"));
    }

    @Test
    public void convertTwelfth() {
        assertThat(convertToOrdinal(12L), equalTo("Twelfth"));
    }

    @Test
    public void convertThirteenth() {
        assertThat(convertToOrdinal(13L), equalTo("Thirteenth"));
    }

    @Test
    public void convertFourteenth() {
        assertThat(convertToOrdinal(14L), equalTo("Fourteenth"));
    }

    @Test
    public void convertFifteenth() {
        assertThat(convertToOrdinal(15L), equalTo("Fifteenth"));
    }

    @Test
    public void convertSixteenth() {
        assertThat(convertToOrdinal(16L), equalTo("Sixteenth"));
    }

    @Test
    public void convertSeventeenth() {
        assertThat(convertToOrdinal(17L), equalTo("Seventeenth"));
    }

    @Test
    public void convertEighteenth() {
        assertThat(convertToOrdinal(18L), equalTo("Eighteenth"));
    }

    @Test
    public void convertNineteenth() {
        assertThat(convertToOrdinal(19L), equalTo("Nineteenth"));
    }

    @Test
    public void convertTwentieth() {
        assertThat(convertToOrdinal(20L), equalTo("Twentieth"));
    }

    @Test
    public void convertTwentyFirst() {
        assertThat(convertToOrdinal(21L), equalTo("Twenty first"));
    }

    @Test
    public void convertTwentySecond() {
        assertThat(convertToOrdinal(22L), equalTo("Twenty second"));
    }

    @Test
    public void convertTwentyThird() {
        assertThat(convertToOrdinal(23L), equalTo("Twenty third"));
    }

    @Test
    public void convertTwentyFourth() {
        assertThat(convertToOrdinal(24L), equalTo("Twenty fourth"));
    }

    @Test
    public void convertTwentyFifth() {
        assertThat(convertToOrdinal(25L), equalTo("Twenty fifth"));
    }

    @Test
    public void convertTwentySixth() {
        assertThat(convertToOrdinal(26L), equalTo("Twenty sixth"));
    }

    @Test
    public void convertTwentySeventh() {
        assertThat(convertToOrdinal(27L), equalTo("Twenty seventh"));
    }

    @Test
    public void convertTwentyEighth() {
        assertThat(convertToOrdinal(28L), equalTo("Twenty eighth"));
    }

    @Test
    public void convertTwentyNinth() {
        assertThat(convertToOrdinal(29L), equalTo("Twenty ninth"));
    }

    @Test
    public void convertThirtieth() {
        assertThat(convertToOrdinal(30L), equalTo("Thirtieth"));
    }

    @Test
    public void convertFortieth() {
        assertThat(convertToOrdinal(40L), equalTo("Fortieth"));
    }

    @Test
    public void convertFiftieth() {
        assertThat(convertToOrdinal(50L), equalTo("Fiftieth"));
    }

    @Test
    public void convertSixtieth() {
        assertThat(convertToOrdinal(60L), equalTo("Sixtieth"));
    }

    @Test
    public void convertSeventieth() {
        assertThat(convertToOrdinal(70L), equalTo("Seventieth"));
    }

    @Test
    public void convertEightieth() {
        assertThat(convertToOrdinal(80L), equalTo("Eightieth"));
    }

    @Test
    public void convertNinetieth() {
        assertThat(convertToOrdinal(90L), equalTo("Ninetieth"));
    }

    @Test
    public void convertHundredth() {
        assertThat(convertToOrdinal(100L), equalTo("One hundredth"));
    }

    @Test
    public void convertHundredAndFirst() {
        assertThat(convertToOrdinal(101L), equalTo("One hundred and first"));
    }

    @Test
    public void convertThousandth() {
        assertThat(convertToOrdinal(1000L), equalTo("One thousandth"));
    }

    @Test
    public void convertTwoThousandth() {
        assertThat(convertToOrdinal(2000L), equalTo("Two thousandth"));
    }

    @Test
    public void convertMillionth() {
        assertThat(convertToOrdinal(1000000L), equalTo("One millionth"));
    }

    @Test
    public void convertTwoMillionth() {
        assertThat(convertToOrdinal(2000000L), equalTo("Two millionth"));
    }

    @Test
    public void convertBillionth() {
        assertThat(convertToOrdinal(1000000000L), equalTo("One billionth"));
    }

    @Test
    public void convertTwoBillionth() {
        assertThat(convertToOrdinal(2000000000L), equalTo("Two billionth"));
    }

    @Test
    public void convertOneBillionOneHundredElevenMillionOneHundredElevenThousandOneHundredEleventh() {
        assertThat(convertToOrdinal(1111111111L), equalTo("One billion one hundred eleven million one hundred eleven thousand one hundred and eleventh"));
    }

    @Test
    public void convertOneBillionOneMillionOneThousandAndFirst() {
        assertThat(convertToOrdinal(1001001001L), equalTo("One billion one million one thousand and first"));
    }
}
