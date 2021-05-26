package milesahead.jackson;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.SortedMap;
import java.util.TreeMap;

public class Jackson {

    private static final String DATE_FORMATTER= "yyyy-MM-dd HH:mm:ss";

    SortedMap<LocalDateTime, Float> timeseries = new TreeMap<>();

    public SortedMap<LocalDateTime, Float> getTimeseries() {
        return timeseries;
    }

    public void setTimeseries(SortedMap<LocalDateTime, Float> timeseries) {
        this.timeseries = timeseries;
    }

    public Jackson() {

        var timestamp = LocalDateTime.of(LocalDate.now().minusDays(1), LocalTime.of(0, 0, 0));
        var now = LocalDateTime.now();
        var meterreading = 6100f;
        while (timestamp.compareTo(now) < 0) {
            timeseries.put(timestamp, meterreading);
            meterreading = meterreading + 5;
            timestamp = timestamp.plusMinutes(15);
        }

    }
}
