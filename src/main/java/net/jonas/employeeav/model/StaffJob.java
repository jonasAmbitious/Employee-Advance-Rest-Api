package net.jonas.employeeav.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "STAFF_JOB", schema = "PUBLIC", catalog = "EMPLOYEEAVDB")
public class StaffJob {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "JOP_KEY")
    private Integer jopKey;
    @Basic
    @Column(name = "STAFF_ID")
    private Integer staffId;
    @Basic
    @Column(name = "JOB_NAME")
    private String jobName;
    @Basic
    @Column(name = "JOB_DEPARTMENT")
    private String jobDepartment;
    @Basic
    @Column(name = "JOB_LEVEL")
    private String jobLevel;
    @Basic
    @Column(name = "TEAM_NAME")
    private String teamName;
    @Basic
    @Column(name = "MANAGER_NO")
    private Integer managerNo;
    @Basic
    @Column(name = "DATE_REQUESTED")
    private LocalDateTime dateRequested;
    @Basic
    @Column(name = "DATE_LAST_MODIFIED")
    private LocalDateTime dateLastModified;
    @Basic
    @Column(name = "MODIFICATION_COUNT")
    private Integer modificationCount;

    public Integer getJopKey() {
        return jopKey;
    }

    public void setJopKey(Integer jopKey) {
        this.jopKey = jopKey;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobDepartment() {
        return jobDepartment;
    }

    public void setJobDepartment(String jobDepartment) {
        this.jobDepartment = jobDepartment;
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getManagerNo() {
        return managerNo;
    }

    public void setManagerNo(Integer managerNo) {
        this.managerNo = managerNo;
    }

    public LocalDateTime getDateRequested() {
        return dateRequested;
    }

    public void setDateRequested(LocalDateTime dateRequested) {
        this.dateRequested = dateRequested;
    }

    public LocalDateTime getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(LocalDateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public Integer getModificationCount() {
        return modificationCount;
    }

    public void setModificationCount(Integer modificationCount) {
        this.modificationCount = modificationCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StaffJob staffJob = (StaffJob) o;
        return Objects.equals(jopKey, staffJob.jopKey) && Objects.equals(staffId, staffJob.staffId) && Objects.equals(jobName, staffJob.jobName) && Objects.equals(jobDepartment, staffJob.jobDepartment) && Objects.equals(jobLevel, staffJob.jobLevel) && Objects.equals(teamName, staffJob.teamName) && Objects.equals(managerNo, staffJob.managerNo) && Objects.equals(dateRequested, staffJob.dateRequested) && Objects.equals(dateLastModified, staffJob.dateLastModified) && Objects.equals(modificationCount, staffJob.modificationCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jopKey, staffId, jobName, jobDepartment, jobLevel, teamName, managerNo, dateRequested, dateLastModified, modificationCount);
    }
}
