
package com.yangmao.KafkaFlight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "next_offset",
    "arrivals"
})
public class FleetArrivedResult {

    @JsonProperty("next_offset")
    private Integer nextOffset;
    @JsonProperty("arrivals")
    private List<Arrival> arrivals = new ArrayList<Arrival>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The nextOffset
     */
    @JsonProperty("next_offset")
    public Integer getNextOffset() {
        return nextOffset;
    }

    /**
     * 
     * @param nextOffset
     *     The next_offset
     */
    @JsonProperty("next_offset")
    public void setNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
    }

    /**
     * 
     * @return
     *     The arrivals
     */
    @JsonProperty("arrivals")
    public List<Arrival> getArrivals() {
        return arrivals;
    }

    /**
     * 
     * @param arrivals
     *     The arrivals
     */
    @JsonProperty("arrivals")
    public void setArrivals(List<Arrival> arrivals) {
        this.arrivals = arrivals;
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
