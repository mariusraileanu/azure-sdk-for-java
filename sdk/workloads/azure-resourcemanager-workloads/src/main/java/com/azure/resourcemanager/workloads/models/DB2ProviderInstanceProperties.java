// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Gets or sets the DB2 provider properties. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "providerType")
@JsonTypeName("Db2")
@Fluent
public final class DB2ProviderInstanceProperties extends ProviderSpecificProperties {
    /*
     * Gets or sets the target virtual machine name.
     */
    @JsonProperty(value = "hostname")
    private String hostname;

    /*
     * Gets or sets the db2 database name.
     */
    @JsonProperty(value = "dbName")
    private String dbName;

    /*
     * Gets or sets the db2 database sql port.
     */
    @JsonProperty(value = "dbPort")
    private String dbPort;

    /*
     * Gets or sets the db2 database user name.
     */
    @JsonProperty(value = "dbUsername")
    private String dbUsername;

    /*
     * Gets or sets the db2 database password.
     */
    @JsonProperty(value = "dbPassword")
    private String dbPassword;

    /*
     * Gets or sets the key vault URI to secret with the database password.
     */
    @JsonProperty(value = "dbPasswordUri")
    private String dbPasswordUri;

    /*
     * Gets or sets the SAP System Identifier
     */
    @JsonProperty(value = "sapSid")
    private String sapSid;

    /**
     * Get the hostname property: Gets or sets the target virtual machine name.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: Gets or sets the target virtual machine name.
     *
     * @param hostname the hostname value to set.
     * @return the DB2ProviderInstanceProperties object itself.
     */
    public DB2ProviderInstanceProperties withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the dbName property: Gets or sets the db2 database name.
     *
     * @return the dbName value.
     */
    public String dbName() {
        return this.dbName;
    }

    /**
     * Set the dbName property: Gets or sets the db2 database name.
     *
     * @param dbName the dbName value to set.
     * @return the DB2ProviderInstanceProperties object itself.
     */
    public DB2ProviderInstanceProperties withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * Get the dbPort property: Gets or sets the db2 database sql port.
     *
     * @return the dbPort value.
     */
    public String dbPort() {
        return this.dbPort;
    }

    /**
     * Set the dbPort property: Gets or sets the db2 database sql port.
     *
     * @param dbPort the dbPort value to set.
     * @return the DB2ProviderInstanceProperties object itself.
     */
    public DB2ProviderInstanceProperties withDbPort(String dbPort) {
        this.dbPort = dbPort;
        return this;
    }

    /**
     * Get the dbUsername property: Gets or sets the db2 database user name.
     *
     * @return the dbUsername value.
     */
    public String dbUsername() {
        return this.dbUsername;
    }

    /**
     * Set the dbUsername property: Gets or sets the db2 database user name.
     *
     * @param dbUsername the dbUsername value to set.
     * @return the DB2ProviderInstanceProperties object itself.
     */
    public DB2ProviderInstanceProperties withDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
        return this;
    }

    /**
     * Get the dbPassword property: Gets or sets the db2 database password.
     *
     * @return the dbPassword value.
     */
    public String dbPassword() {
        return this.dbPassword;
    }

    /**
     * Set the dbPassword property: Gets or sets the db2 database password.
     *
     * @param dbPassword the dbPassword value to set.
     * @return the DB2ProviderInstanceProperties object itself.
     */
    public DB2ProviderInstanceProperties withDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }

    /**
     * Get the dbPasswordUri property: Gets or sets the key vault URI to secret with the database password.
     *
     * @return the dbPasswordUri value.
     */
    public String dbPasswordUri() {
        return this.dbPasswordUri;
    }

    /**
     * Set the dbPasswordUri property: Gets or sets the key vault URI to secret with the database password.
     *
     * @param dbPasswordUri the dbPasswordUri value to set.
     * @return the DB2ProviderInstanceProperties object itself.
     */
    public DB2ProviderInstanceProperties withDbPasswordUri(String dbPasswordUri) {
        this.dbPasswordUri = dbPasswordUri;
        return this;
    }

    /**
     * Get the sapSid property: Gets or sets the SAP System Identifier.
     *
     * @return the sapSid value.
     */
    public String sapSid() {
        return this.sapSid;
    }

    /**
     * Set the sapSid property: Gets or sets the SAP System Identifier.
     *
     * @param sapSid the sapSid value to set.
     * @return the DB2ProviderInstanceProperties object itself.
     */
    public DB2ProviderInstanceProperties withSapSid(String sapSid) {
        this.sapSid = sapSid;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
