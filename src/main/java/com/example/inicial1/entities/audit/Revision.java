package com.example.inicial1.entities.audit;
import jakarta.persistence.*;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionTimestamp;
import org.hibernate.envers.RevisionNumber;

import lombok.Data;

@Entity
@Table(name = "REVISION_INFO")
@RevisionEntity(CustomRevisionListener.class)
@Data
public class CustomRevisionListener implements RevisionListener {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "revision_seq")
    @SequenceGenerator(
            name="revision_seq";
            sequenceName="rbac.seq.revission_Id";
    )
    @RevisionNumber
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @RevisionTimestamp
    private Date date;
}
