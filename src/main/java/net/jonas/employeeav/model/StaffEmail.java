package net.jonas.employeeav.model;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@Table(name = "STAFF_EMAIL", schema = "PUBLIC", catalog = "EMPLOYEEAVDB")
public class StaffEmail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EMAIL_KEY")
    private Integer emailKey;
    @Basic
    @Column(name = "STAFF_ID")
    private Integer staffId;
    @Basic
    @Column(name = "EMAIL")
    private String email;
    @Basic
    @Column(name = "EMAIL_ACTIVE")
    private String emailActive;
    @Basic
    @Column(name = "DATE_REQUESTED")
    private LocalDateTime dateRequested;
    @Basic
    @Column(name = "DATE_LAST_MODIFIED")
    private LocalDateTime dateLastModified;
    @Basic
    @Column(name = "MODIFICATION_COUNT")
    private Integer modificationCount;

    public Integer getEmailKey() {
        return emailKey;
    }

    public void setEmailKey(Integer emailKey) {
        this.emailKey = emailKey;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailActive() {
        return emailActive;
    }

    public void setEmailActive(String emailActive) {
        this.emailActive = emailActive;
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
        StaffEmail that = (StaffEmail) o;
        return Objects.equals(emailKey, that.emailKey) && Objects.equals(staffId, that.staffId) && Objects.equals(email, that.email) && Objects.equals(emailActive, that.emailActive) && Objects.equals(dateRequested, that.dateRequested) && Objects.equals(dateLastModified, that.dateLastModified) && Objects.equals(modificationCount, that.modificationCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailKey, staffId, email, emailActive, dateRequested, dateLastModified, modificationCount);
    }
}
