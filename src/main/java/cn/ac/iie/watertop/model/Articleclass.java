package cn.ac.iie.watertop.model;

import javax.persistence.*;

public class Articleclass {
    @Id
    private Integer classid;

    private String classname;

    private String classpath;

    private String showclass;

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
     * @return classname
     */
    public String getClassname() {
        return classname;
    }

    /**
     * @param classname
     */
    public void setClassname(String classname) {
        this.classname = classname;
    }

    /**
     * @return classpath
     */
    public String getClasspath() {
        return classpath;
    }

    /**
     * @param classpath
     */
    public void setClasspath(String classpath) {
        this.classpath = classpath;
    }

    /**
     * @return showclass
     */
    public String getShowclass() {
        return showclass;
    }

    /**
     * @param showclass
     */
    public void setShowclass(String showclass) {
        this.showclass = showclass;
    }
}
