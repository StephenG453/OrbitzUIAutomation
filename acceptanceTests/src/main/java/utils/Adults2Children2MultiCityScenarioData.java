package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Adults2Children2MultiCityScenarioData {

    public static final String CITY_A = "DFW";
    public static final String CITY_B = "LAX";
    public static final String CITY_C = "CHI";

    private static final Calendar FLIGHT_DATE_CALENDAR = Calendar.getInstance();
    private static final DateFormat FORMATTER = new SimpleDateFormat("MM/dd/yyyy");
    private static Date flightDate = new Date();

    public static String getFlight1Date() {
        FLIGHT_DATE_CALENDAR.add(Calendar.DAY_OF_MONTH, 4);
        flightDate = FLIGHT_DATE_CALENDAR.getTime();

        return FORMATTER.format(flightDate);
    }

    public static String getFlight2Date() {
        FLIGHT_DATE_CALENDAR.add(Calendar.DAY_OF_MONTH, 7);
        flightDate = FLIGHT_DATE_CALENDAR.getTime();

        return FORMATTER.format(flightDate);
    }

    public static String getFlight3Date() {
        FLIGHT_DATE_CALENDAR.add(Calendar.DAY_OF_MONTH, 6);
        flightDate = FLIGHT_DATE_CALENDAR.getTime();

        return FORMATTER.format(flightDate);
    }
}
