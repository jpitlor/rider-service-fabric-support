package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifying this parameter adds support for reliable collections. */
@Fluent
public final class ReliableCollectionsRef {
    /*
     * Name of ReliableCollection resource. Right now it's not used and you can
     * use any string.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * False (the default) if ReliableCollections state is persisted to disk as
     * usual. True if you do not want to persist state, in which case
     * replication is still enabled and you can use ReliableCollections as
     * distributed cache.
     */
    @JsonProperty(value = "doNotPersistState")
    private Boolean doNotPersistState;

    /**
     * Get the name property: Name of ReliableCollection resource. Right now it's not used and you can use any string.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of ReliableCollection resource. Right now it's not used and you can use any string.
     *
     * @param name the name value to set.
     * @return the ReliableCollectionsRef object itself.
     */
    public ReliableCollectionsRef setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the doNotPersistState property: False (the default) if ReliableCollections state is persisted to disk as
     * usual. True if you do not want to persist state, in which case replication is still enabled and you can use
     * ReliableCollections as distributed cache.
     *
     * @return the doNotPersistState value.
     */
    public Boolean isDoNotPersistState() {
        return this.doNotPersistState;
    }

    /**
     * Set the doNotPersistState property: False (the default) if ReliableCollections state is persisted to disk as
     * usual. True if you do not want to persist state, in which case replication is still enabled and you can use
     * ReliableCollections as distributed cache.
     *
     * @param doNotPersistState the doNotPersistState value to set.
     * @return the ReliableCollectionsRef object itself.
     */
    public ReliableCollectionsRef setDoNotPersistState(Boolean doNotPersistState) {
        this.doNotPersistState = doNotPersistState;
        return this;
    }
}
