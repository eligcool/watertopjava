package cn.ac.iie.watertop.model;

import java.util.Date;
import javax.persistence.*;

public class Imageinfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String infotags;

    private String title;

    private Date newstime;

    private String picsize;

    private String filesize;

    private Double width;

    private Double height;

    private String picurl;

    private String befrom;

    private String picsay;

    private Integer classid;

    private Integer state;

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
     * @return infotags
     */
    public String getInfotags() {
        return infotags;
    }

    /**
     * @param infotags
     */
    public void setInfotags(String infotags) {
        this.infotags = infotags;
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
     * @return picsize
     */
    public String getPicsize() {
        return picsize;
    }

    /**
     * @param picsize
     */
    public void setPicsize(String picsize) {
        this.picsize = picsize;
    }

    /**
     * @return filesize
     */
    public String getFilesize() {
        return filesize;
    }

    /**
     * @param filesize
     */
    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    /**
     * @return width
     */
    public Double getWidth() {
        return width;
    }

    /**
     * @param width
     */
    public void setWidth(Double width) {
        this.width = width;
    }

    /**
     * @return height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * @param height
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * @return picurl
     */
    public String getPicurl() {
        return picurl;
    }

    /**
     * @param picurl
     */
    public void setPicurl(String picurl) {
        this.picurl = picurl;
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
     * @return picsay
     */
    public String getPicsay() {
        return picsay;
    }

    /**
     * @param picsay
     */
    public void setPicsay(String picsay) {
        this.picsay = picsay;
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
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }
}
