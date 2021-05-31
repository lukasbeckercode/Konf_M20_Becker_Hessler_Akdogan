package at.fhj.iit;

import java.util.Date;

/**
 * One day of selling drinks
 */
public class SellingDay {
    private String dayTitle;

    public SellingDay(String dayTitle) {
        this.dayTitle = dayTitle;
    }

    public String getDayTitle() {
        return dayTitle;
    }

    public void setDayTitle(String dayTitle) {
        this.dayTitle = dayTitle;
    }

}
