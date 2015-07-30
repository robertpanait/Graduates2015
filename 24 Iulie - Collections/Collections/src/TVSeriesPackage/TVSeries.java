package TVSeriesPackage;


/**
 * Created by rpanait on 7/24/2015.
 */
public class TVSeries {
    private String name;
    private String hour;
    private String day;
    private int productionYear;
    private String type;

    public TVSeries(String name, String day, String hour, Integer productionYear, String type) {
        this.name=name;
        this.hour=hour;
        this.day=day;
        this.productionYear=productionYear;
        this.type=type;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name + "-" + hour + "-" + day + "-" + productionYear + "-"+ type;
    }
}
