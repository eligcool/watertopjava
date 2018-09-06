package cn.ac.iie.watertop.model;

import java.util.Date;
import javax.persistence.*;

public class Reportpath {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String reportname;

    private String repoetpath;

    @Column(name = "createTime")
    private Date createtime;

    @Column(name = "updateTime")
    private Date updatetime;

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
     * @return reportname
     */
    public String getReportname() {
        return reportname;
    }

    /**
     * @param reportname
     */
    public void setReportname(String reportname) {
        this.reportname = reportname;
    }

    /**
     * @return repoetpath
     */
    public String getRepoetpath() {
        return repoetpath;
    }

    /**
     * @param repoetpath
     */
    public void setRepoetpath(String repoetpath) {
        this.repoetpath = repoetpath;
    }

    /**
     * @return createTime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
}
