package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** Metadata about an Analysis Event. */
@Fluent
public final class AnalysisEventMetadata {
    /*
     * The analysis delay.
     */
    @JsonProperty(value = "Delay")
    private Duration delay;

    /*
     * The duration of analysis.
     */
    @JsonProperty(value = "Duration")
    private Duration duration;

    /**
     * Get the delay property: The analysis delay.
     *
     * @return the delay value.
     */
    public Duration getDelay() {
        return this.delay;
    }

    /**
     * Set the delay property: The analysis delay.
     *
     * @param delay the delay value to set.
     * @return the AnalysisEventMetadata object itself.
     */
    public AnalysisEventMetadata setDelay(Duration delay) {
        this.delay = delay;
        return this;
    }

    /**
     * Get the duration property: The duration of analysis.
     *
     * @return the duration value.
     */
    public Duration getDuration() {
        return this.duration;
    }

    /**
     * Set the duration property: The duration of analysis.
     *
     * @param duration the duration value to set.
     * @return the AnalysisEventMetadata object itself.
     */
    public AnalysisEventMetadata setDuration(Duration duration) {
        this.duration = duration;
        return this;
    }
}
