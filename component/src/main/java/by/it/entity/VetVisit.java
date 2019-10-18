package by.it.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * Created by Yauheni Krasko on 14.10.2017.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class VetVisit {

//    @CreationTimestamp
    @Column(insertable = false, updatable = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstVisit;

//    @UpdateTimestamp
    @Column(insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastVisit;
}
