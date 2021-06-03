package at.fhj.iit;
/**
 * One day of selling drinks
 */
public class SellingDay {
    private final String dayTitle;

    /**
     * Constructor
     * @param dayTitle one day of sales
     */
    public SellingDay(String dayTitle) {
        this.dayTitle = dayTitle;
    }

    /**
     * Getter for the Day title
     * @return the title of a Day
     */
    public String getDayTitle() {
        return dayTitle;
    }

}
