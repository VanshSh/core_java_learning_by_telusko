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
 * - Enum is a special data type that let variables to be the set of the
 * predefined values.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */