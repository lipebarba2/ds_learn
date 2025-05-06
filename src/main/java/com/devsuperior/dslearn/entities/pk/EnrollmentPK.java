package com.devsuperior.dslearn.entities.pk;

import com.devsuperior.dslearn.entities.Offer;
import com.devsuperior.dslearn.entities.User;

public class EnrollmentPK {

    private User user;
    private Offer offer;

    public EnrollmentPK(User user, Offer offer){
        this.user = new User();
        this.offer = new Offer();
    }

}
