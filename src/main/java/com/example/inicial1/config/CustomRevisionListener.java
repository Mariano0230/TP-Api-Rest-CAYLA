package com.example.inicial1.config;

import com.example.persona.entities.audit.Revision;
import com.example.envers.RevisionListeners;
import org.hibernate.envers.RevisionEntity;

public class CustomRevisionListener implements RevisionListeners{
    public void newRevision(Object revisionEntity){
        final Revision revision = (Revision) RevisionEntity;
    }
}
