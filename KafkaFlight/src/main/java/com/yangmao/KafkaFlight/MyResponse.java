
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
    "FleetArrivedResult"
})
public class MyResponse {

    @JsonProperty("FleetArrivedResult")
    private com.yangmao.KafkaFlight.FleetArrivedResult FleetArrivedResult;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The FleetArrivedResult
     */
    @JsonProperty("FleetArrivedResult")
    public com.yangmao.KafkaFlight.FleetArrivedResult getFleetArrivedResult() {
        return FleetArrivedResult;
    }

    /**
     * 
     * @param FleetArrivedResult
     *     The FleetArrivedResult
     */
    @JsonProperty("FleetArrivedResult")
    public void setFleetArrivedResult(com.yangmao.KafkaFlight.FleetArrivedResult FleetArrivedResult) {
        this.FleetArrivedResult = FleetArrivedResult;
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
