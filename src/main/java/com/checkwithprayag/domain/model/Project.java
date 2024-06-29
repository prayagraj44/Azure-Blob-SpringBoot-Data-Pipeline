package com.checkwithprayag.domain.model;

import com.checkwithprayag.domain.entity.Bid;
import com.checkwithprayag.domain.entity.Gig;
import com.checkwithprayag.domain.entity.TimeLog;
import com.checkwithprayag.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Project {

    private User user;
    private Gig gig;
    private Bid bid;
    private TimeLog timeLog;

}
