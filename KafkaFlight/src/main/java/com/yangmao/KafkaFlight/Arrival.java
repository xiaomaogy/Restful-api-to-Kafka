
package com.yangmao.KafkaFlight;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "ident",
    "aircrafttype",
    "actualdeparturetime",
    "actualarrivaltime",
    "origin",
    "destination",
    "originName",
    "originCity",
    "destinationName",
    "destinationCity"
})
public class Arrival {

    @JsonProperty("ident")
    private String ident;
    @JsonProperty("aircrafttype")
    private String aircrafttype;
    @JsonProperty("actualdeparturetime")
    private Integer actualdeparturetime;
    @JsonProperty("actualarrivaltime")
    private Integer actualarrivaltime;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("originName")
    private String originName;
    @JsonProperty("originCity")
    private String originCity;
    @JsonProperty("destinationName")
    private String destinationName;
    @JsonProperty("destinationCity")
    private String destinationCity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The ident
     */
    @JsonProperty("ident")
    public String getIdent() {
        return ident;
    }

    /**
     * 
     * @param ident
     *     The ident
     */
    @JsonProperty("ident")
    public void setIdent(String ident) {
        this.ident = ident;
    }

    /**
     * 
     * @return
     *     The aircrafttype
     */
    @JsonProperty("aircrafttype")
    public String getAircrafttype() {
        return aircrafttype;
    }

    /**
     * 
     * @param aircrafttype
     *     The aircrafttype
     */
    @JsonProperty("aircrafttype")
    public void setAircrafttype(String aircrafttype) {
        this.aircrafttype = aircrafttype;
    }

    /**
     * 
     * @return
     *     The actualdeparturetime
     */
    @JsonProperty("actualdeparturetime")
    public Integer getActualdeparturetime() {
        return actualdeparturetime;
    }

    /**
     * 
     * @param actualdeparturetime
     *     The actualdeparturetime
     */
    @JsonProperty("actualdeparturetime")
    public void setActualdeparturetime(Integer actualdeparturetime) {
        this.actualdeparturetime = actualdeparturetime;
    }

    /**
     * 
     * @return
     *     The actualarrivaltime
     */
    @JsonProperty("actualarrivaltime")
    public Integer getActualarrivaltime() {
        return actualarrivaltime;
    }

    /**
     * 
     * @param actualarrivaltime
     *     The actualarrivaltime
     */
    @JsonProperty("actualarrivaltime")
    public void setActualarrivaltime(Integer actualarrivaltime) {
        this.actualarrivaltime = actualarrivaltime;
    }

    /**
     * 
     * @return
     *     The origin
     */
    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    /**
     * 
     * @param origin
     *     The origin
     */
    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * 
     * @return
     *     The destination
     */
    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    /**
     * 
     * @param destination
     *     The destination
     */
    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * 
     * @return
     *     The originName
     */
    @JsonProperty("originName")
    public String getOriginName() {
        return originName;
    }

    /**
     * 
     * @param originName
     *     The originName
     */
    @JsonProperty("originName")
    public void setOriginName(String originName) {
        this.originName = originName;
    }

    /**
     * 
     * @return
     *     The originCity
     */
    @JsonProperty("originCity")
    public String getOriginCity() {
        return originCity;
    }

    /**
     * 
     * @param originCity
     *     The originCity
     */
    @JsonProperty("originCity")
    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    /**
     * 
     * @return
     *     The destinationName
     */
    @JsonProperty("destinationName")
    public String getDestinationName() {
        return destinationName;
    }

    /**
     * 
     * @param destinationName
     *     The destinationName
     */
    @JsonProperty("destinationName")
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * 
     * @return
     *     The destinationCity
     */
    @JsonProperty("destinationCity")
    public String getDestinationCity() {
        return destinationCity;
    }

    /**
     * 
     * @param destinationCity
     *     The destinationCity
     */
    @JsonProperty("destinationCity")
    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
