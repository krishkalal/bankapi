package com.boa.customerapi.queries;

import com.boa.customerapi.models.Individual;
import com.boa.customerapi.services.IndividualService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IndividualGLQuery implements GraphQLQueryResolver {
    @Autowired
    private IndividualService individualService;

    public List<Individual> findAllIndividual() {
        return individualService.getAllIndividuals();

    }

    public Individual findIndividualById(long accountNo) {
        return individualService.getIndividualById(accountNo);
    }

   public List<Individual> findIndividualByEmail(String email){
        return  individualService.getIndividualByEmail(email);
   }
}
