package model;

public class Movie extends Object{
    public String mtitle;
    public String mname;
    public String mcompany;
    public Integer mprice;
    public Integer mlevel;

    public Movie(String mtitle, String mname, String mcompany,
                 Integer mprice, Integer mlevel){
        this.mtitle = mtitle;
        this.mname = mname;
        this.mcompany = mcompany;
        this.mprice = mprice;
        this.mlevel = mlevel;
    }


}
