package br.com.patrick.infra;

import br.com.patrick.domain.service.CodinameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.patrick.domain.model.GroupType;
import org.springframework.stereotype.Component;

@Component
public class CodinameHandler {

    @Autowired
    private CodinameService service;

    public String findCodiname(GroupType groupType) {
        if(groupType == GroupType.AVENGERS){
            String firstMatch = service.getAvangersCodinameList().stream().findFirst().orElseThrow();
            this.service.getAvangersCodinameList().remove(firstMatch);
            return firstMatch;
        }
        String firstMatch = service.getJusticeLeagueList().stream().findFirst().orElseThrow();
        this.service.getJusticeLeagueList().remove(firstMatch);
        return firstMatch;
    }
}
