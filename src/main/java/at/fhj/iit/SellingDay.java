package at.fhj.iit;
/**
 * One day of selling drinks
 */
public class SellingDay {
    private String dayTitle;

    /**
     * Constructor
     * @param dayTitle one day of sales
     */
    public SellingDay(String dayTitle) {
        this.dayTitle = dayTitle;
    }

    /**
     * Getter for the Day title
     * @return
     */
    public String getDayTitle() {
        return dayTitle;
    }

    public void setDayTitle(String dayTitle) {
        this.dayTitle = dayTitle;
    }
}
