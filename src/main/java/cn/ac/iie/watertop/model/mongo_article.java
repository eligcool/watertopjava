package cn.ac.iie.watertop.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by eligcool on 2018/8/8.
 */
public class mongo_article  implements Serializable{
    private static final long serialVersionUID = -3258839839160856613L;
    private  String id;
    private  String title;
    private  String url;
    private  String text;
    private  Date dare;
    private  String source;
    private  String websitel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDare() {
        return dare;
    }

    public void setDare(Date dare) {
        this.dare = dare;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getWebsitel() {
        return websitel;
    }

    public void setWebsitel(String websitel) {
        this.websitel = websitel;
    }

    @Override
    public String toString() {
        return "mongo_article{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", text='" + text + '\'' +
                ", dare=" + dare +
                ", source='" + source + '\'' +
                ", websitel='" + websitel + '\'' +
                '}';
    }
}
