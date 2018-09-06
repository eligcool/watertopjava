package cn.ac.iie.watertop.model;

import java.util.Date;
import javax.persistence.*;

public class Appvideo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String befrom;

    private Integer classid;

    private String datafrom;

    private String firsttitle;

    private String isgood;

    private Date newstime;

    private String onclick;

    private String playonlineurl;

    private Date playtime;

    private String ptitlepic;

    private Date time;

    private String title;

    private String titlepic;

    private String titlepic2;

    private String titlepic3;

    private String titleurl;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return befrom
     */
    public String getBefrom() {
        return befrom;
    }

    /**
     * @param befrom
     */
    public void setBefrom(String befrom) {
        this.befrom = befrom;
    }

    /**
     * @return classid
     */
    public Integer getClassid() {
        return classid;
    }

    /**
     * @param classid
     */
    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    /**
     * @return datafrom
     */
    public String getDatafrom() {
        return datafrom;
    }

    /**
     * @param datafrom
     */
    public void setDatafrom(String datafrom) {
        this.datafrom = datafrom;
    }

    /**
     * @return firsttitle
     */
    public String getFirsttitle() {
        return firsttitle;
    }

    /**
     * @param firsttitle
     */
    public void setFirsttitle(String firsttitle) {
        this.firsttitle = firsttitle;
    }

    /**
     * @return isgood
     */
    public String getIsgood() {
        return isgood;
    }

    /**
     * @param isgood
     */
    public void setIsgood(String isgood) {
        this.isgood = isgood;
    }

    /**
     * @return newstime
     */
    public Date getNewstime() {
        return newstime;
    }

    /**
     * @param newstime
     */
    public void setNewstime(Date newstime) {
        this.newstime = newstime;
    }

    /**
     * @return onclick
     */
    public String getOnclick() {
        return onclick;
    }

    /**
     * @param onclick
     */
    public void setOnclick(String onclick) {
        this.onclick = onclick;
    }

    /**
     * @return playonlineurl
     */
    public String getPlayonlineurl() {
        return playonlineurl;
    }

    /**
     * @param playonlineurl
     */
    public void setPlayonlineurl(String playonlineurl) {
        this.playonlineurl = playonlineurl;
    }

    /**
     * @return playtime
     */
    public Date getPlaytime() {
        return playtime;
    }

    /**
     * @param playtime
     */
    public void setPlaytime(Date playtime) {
        this.playtime = playtime;
    }

    /**
     * @return ptitlepic
     */
    public String getPtitlepic() {
        return ptitlepic;
    }

    /**
     * @param ptitlepic
     */
    public void setPtitlepic(String ptitlepic) {
        this.ptitlepic = ptitlepic;
    }

    /**
     * @return time
     */
    public Date getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return titlepic
     */
    public String getTitlepic() {
        return titlepic;
    }

    /**
     * @param titlepic
     */
    public void setTitlepic(String titlepic) {
        this.titlepic = titlepic;
    }

    /**
     * @return titlepic2
     */
    public String getTitlepic2() {
        return titlepic2;
    }

    /**
     * @param titlepic2
     */
    public void setTitlepic2(String titlepic2) {
        this.titlepic2 = titlepic2;
    }

    /**
     * @return titlepic3
     */
    public String getTitlepic3() {
        return titlepic3;
    }

    /**
     * @param titlepic3
     */
    public void setTitlepic3(String titlepic3) {
        this.titlepic3 = titlepic3;
    }

    /**
     * @return titleurl
     */
    public String getTitleurl() {
        return titleurl;
    }

    /**
     * @param titleurl
     */
    public void setTitleurl(String titleurl) {
        this.titleurl = titleurl;
    }
}
