package ua.com.smiddle.remember.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author ksa on 27.12.16.
 * @project remember
 */
@JsonIgnoreProperties
public class Wrapper {
    private Long agentId;
    private String ANI;
    private Long scallId;
    private Byte firstQuestion;
    private Byte secondQuestion;
    private Byte thirdQuestion;

    //Constructors


    public Wrapper(Long agentId, String ANI, Long scallId) {
        this.agentId = agentId;
        this.ANI = ANI;
        this.scallId = scallId;
    }

    public Wrapper() {
    }


    //Getters and setters


    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public String getANI() {
        return ANI;
    }

    public void setANI(String ANI) {
        this.ANI = ANI;
    }

    public Long getScallId() {
        return scallId;
    }

    public void setScallId(Long scallId) {
        this.scallId = scallId;
    }

    //Methods
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wrapper{");
        sb.append("value='").append(agentId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
