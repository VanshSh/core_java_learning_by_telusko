package ExercismJavaTrack;

enum Rating {
    GREAT(5),
    GOOD(4),
    OK(3),
    BAD(2),
    TERRIBLE(1);

    private final int numberOfStars;

    Rating(int numberOfStars) {
        System.out.println(numberOfStars);
        this.numberOfStars = numberOfStars;
    }

    public int getNumberOfStars() {
        return this.numberOfStars;
    }
}

public class LogsLogsLogs {
    public static void main(String[] args) {
        System.out.println(Rating.GOOD.getNumberOfStars());
        // Output: 4
    }
}

/*
 * NOTES =>
 * Lesson link: https://exercism.org/tracks/java/exercises/logs-logs-logs
 * 
 * - Enum is a special data type that let variables to be the set of the
 * predefined values.
 * 
 * 
 * - Solution:
 * 
 * public enum LogLevel {
 * UNKNOWN(0),
 * TRACE(1),
 * DEBUG(2),
 * INFO(4),
 * WARNING(5),
 * ERROR(6),
 * FATAL(42);
 * 
 * private int logCode;
 * 
 * LogLevel(int numberOfStars) {
 * this.logCode = numberOfStars;
 * }
 * 
 * public int getLogCode() {
 * return this.logCode;
 * }
 * 
 * }
 * 
 * public class LogLine {
 * 
 * private String logLine;
 * 
 * public LogLine(String logLine) {
 * this.logLine = logLine;
 * }
 * 
 * public LogLevel getLogLevel() {
 * String line = this.logLine.substring(this.logLine.indexOf("[") + 1,
 * this.logLine.indexOf("]"));
 * return switch (line) {
 * case ("TRC") -> LogLevel.TRACE;
 * case ("DBG") -> LogLevel.DEBUG;
 * case ("INF") -> LogLevel.INFO;
 * case ("WRN") -> LogLevel.WARNING;
 * case ("ERR") -> LogLevel.ERROR;
 * case ("FTL") -> LogLevel.FATAL;
 * default -> LogLevel.UNKNOWN;
 * };
 * }
 * 
 * public String getOutputForShortLog() {
 * String sentence = this.logLine.substring(this.logLine.indexOf(":") + 2);
 * System.out.println(sentence);
 * return getLogLevel().getLogCode() + ":" + sentence;
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */