package com.github.beresfordt.ordinaliser;

public class NumberToOrdinal {

    private static final long MAX_VALUE = 999_999_999_999L;
    private static final long ONE_BILLION = 1_000_000_000L;
    private static final long ONE_MILLION = 1_000_000L;
    private static final long ONE_THOUSAND = 1_000L;
    private static final long ONE_HUNDRED = 100L;
    private static final String[] tens = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };
    private static final String[] unitsAndTeens = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };
    private static final String[] ordinalUnitsAndTeens = {
            "",
            " first",
            " second",
            " third",
            " fourth",
            " fifth",
            " sixth",
            " seventh",
            " eighth",
            " ninth",
            " tenth",
            " eleventh",
            " twelfth",
            " thirteenth",
            " fourteenth",
            " fifteenth",
            " sixteenth",
            " seventeenth",
            " eighteenth",
            " nineteenth"
    };

    public static String convertToOrdinal(long number) {
        if (number == 0) {
            return "zero";
        }

        if (number > MAX_VALUE) {
            return "lots";
        }

        String result = convertBillions(number);

        result += convertMillions(number % ONE_BILLION);

        result += convertThousands(number % ONE_MILLION);

        result += convertHundreds(number % ONE_THOUSAND);

        String units = convertUnitOrdinals((int) (number % ONE_HUNDRED));

        if (units.equals("")) {
            result += "th";
        } else if (!result.equals("")) {
            result += " and";
        }
        result += units;
        return upperFirstCharacter(removeLeadingSpace(result));
    }

    private static String removeLeadingSpace(String result) {
        return result.substring(1);
    }

    private static String upperFirstCharacter(String result) {
        return Character.toUpperCase(result.charAt(0)) + result.substring(1);
    }

    private static String convertBillions(long number) {
        if (number / ONE_BILLION == 0) return "";

        int billions = (int) (number / ONE_BILLION);

        return convertUnits(billions) + " billion";
    }

    private static String convertMillions(long number) {
        if (number / ONE_MILLION == 0) return "";

        int millions = (int) (number / ONE_MILLION);

        return convertUnits(millions) + " million";
    }

    private static String convertThousands(long number) {
        if (number / ONE_THOUSAND == 0) return "";

        int thousands = (int) (number / ONE_THOUSAND);

        return convertUnits(thousands) + " thousand";
    }

    private static String convertHundreds(long number) {
        if (number / ONE_HUNDRED == 0) return "";

        int hundreds = (int) (number / ONE_HUNDRED);

        return convertUnits(hundreds) + " hundred";
    }

    private static String convertUnits(int number) {
        return convertUnitsWithNaming(number, unitsAndTeens);
    }

    private static String convertUnitOrdinals(int number) {
        return convertUnitsWithNaming(number, ordinalUnitsAndTeens);
    }

    private static String convertUnitsWithNaming(int number, String[] namingArray) {
        String soFar;

        if (number % 100 < 20) {
            soFar = namingArray[number % 100];
            number /= 100;
        }
        else {
            soFar = namingArray[number % 10];
            number /= 10;

            String tensName = tens[number % 10];
            if (soFar.equals("")) {
                soFar = soFar + tensName.substring(0, tensName.length() - 1) + "ieth";
            }
            else {
                soFar = tensName + soFar;
            }

            number /= 10;
        }
        if (number == 0) return soFar;
        return unitsAndTeens[number] + " hundred" + (soFar.equals("") ? "th" : soFar);
    }
}