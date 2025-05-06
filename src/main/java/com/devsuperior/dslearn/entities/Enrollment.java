package com.devsuperior.dslearn.entities;

import com.devsuperior.dslearn.entities.pk.EnrollmentPK;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_enrollment")
public class Enrollment {


    private EnrollmentPK id = new EnrollmentPK();
    private Instant enrollMoment;
    private Instant refundMoment;
    private boolean available;
    private boolean onlyUpdate;


}
