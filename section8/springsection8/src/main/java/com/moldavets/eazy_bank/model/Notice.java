package com.moldavets.eazy_bank.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "notice_details")
public class Notice {

    @Id
    @Column(name = "notice_id")
    private long noticeId;

    @Column(name = "notice_summary")
    private String noticeSummary;

    @Column(name = "notice_details")
    private String noticeDetails;

    @Column(name = "notic_beg_dt")
    private Date noticeBegDt;

    @Column(name = "notic_end_dt")
    private Date noticeEndDt;

    @JsonIgnore
    @Column(name = "create_dt")
    private Date createDt;

    @JsonIgnore
    @Column(name = "update_dt")
    private Date updateDt;

    public Notice() {
    }

    public Notice(long noticeId, String noticeSummary,
                  String noticeDetails, Date noticeBegDt, Date noticeEndDt,
                  Date createDt, Date updateDt) {
        this.noticeId = noticeId;
        this.noticeSummary = noticeSummary;
        this.noticeDetails = noticeDetails;
        this.noticeBegDt = noticeBegDt;
        this.noticeEndDt = noticeEndDt;
        this.createDt = createDt;
        this.updateDt = updateDt;
    }
}
