package cn.ac.iie.watertop.model;

import java.util.Date;
import javax.persistence.*;

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String crawler;

    private String title;

    private String keyword;

    private String befrom;

    private String editor;

    private String classifier;

    private String titleurl;

    @Column(name = "isTop")
    private Integer istop;

    @Column(name = "isCheck")
    private Integer ischeck;

    @Column(name = "publishTime")
    private Date publishtime;

    @Column(name = "insertTime")
    private Date inserttime;

    @Column(name = "updateTime")
    private Date updatetime;

    private Integer classid;

    private String datafrom;

    private String firsttitle;

    private String isgood;

    private Date newstime;

    private String nlist;

    private String onclick;

    private String playonlineurl;

    private Date playtime;

    private Integer plnum;

    private String ptitlepic;

    private Date time;

    private String titlepic;

    private String titlepic2;

    private String titlepic3;

    private String newstext;

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
     * @return crawler
     */
    public String getCrawler() {
        return crawler;
    }

    /**
     * @param crawler
     */
    public void setCrawler(String crawler) {
        this.crawler = crawler;
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
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * @param keyword
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
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
     * @return editor
     */
    public String getEditor() {
        return editor;
    }

    /**
     * @param editor
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * @return classifier
     */
    public String getClassifier() {
        return classifier;
    }

    /**
     * @param classifier
     */
    public void setClassifier(String classifier) {
        this.classifier = classifier;
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

    /**
     * @return isTop
     */
    public Integer getIstop() {
        return istop;
    }

    /**
     * @param istop
     */
    public void setIstop(Integer istop) {
        this.istop = istop;
    }

    /**
     * @return isCheck
     */
    public Integer getIscheck() {
        return ischeck;
    }

    /**
     * @param ischeck
     */
    public void setIscheck(Integer ischeck) {
        this.ischeck = ischeck;
    }

    /**
     * @return publishTime
     */
    public Date getPublishtime() {
        return publishtime;
    }

    /**
     * @param publishtime
     */
    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    /**
     * @return insertTime
     */
    public Date getInserttime() {
        return inserttime;
    }

    /**
     * @param inserttime
     */
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    /**
     * @return updateTime
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param updatetime
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
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
     * @return nlist
     */
    public String getNlist() {
        return nlist;
    }

    /**
     * @param nlist
     */
    public void setNlist(String nlist) {
        this.nlist = nlist;
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
     * @return plnum
     */
    public Integer getPlnum() {
        return plnum;
    }

    /**
     * @param plnum
     */
    public void setPlnum(Integer plnum) {
        this.plnum = plnum;
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
     * @return newstext
     */
    public String getNewstext() {
        return newstext;
    }

    /**
     * @param newstext
     */
    public void setNewstext(String newstext) {
        this.newstext = newstext;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", crawler='" + crawler + '\'' +
                ", title='" + title + '\'' +
                ", keyword='" + keyword + '\'' +
                ", befrom='" + befrom + '\'' +
                ", editor='" + editor + '\'' +
                ", classifier='" + classifier + '\'' +
                ", titleurl='" + titleurl + '\'' +
                ", istop=" + istop +
                ", ischeck=" + ischeck +
                ", publishtime=" + publishtime +
                ", inserttime=" + inserttime +
                ", updatetime=" + updatetime +
                ", classid=" + classid +
                ", datafrom='" + datafrom + '\'' +
                ", firsttitle='" + firsttitle + '\'' +
                ", isgood='" + isgood + '\'' +
                ", newstime=" + newstime +
                ", nlist='" + nlist + '\'' +
                ", onclick='" + onclick + '\'' +
                ", playonlineurl='" + playonlineurl + '\'' +
                ", playtime=" + playtime +
                ", plnum=" + plnum +
                ", ptitlepic='" + ptitlepic + '\'' +
                ", time=" + time +
                ", titlepic='" + titlepic + '\'' +
                ", titlepic2='" + titlepic2 + '\'' +
                ", titlepic3='" + titlepic3 + '\'' +
                ", newstext='" + newstext + '\'' +
                '}';
    }
}
