// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure VM workload-specific workload item. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "workloadItemType",
    defaultImpl = AzureVmWorkloadItem.class)
@JsonTypeName("AzureVmWorkloadItem")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SAPAseDatabase", value = AzureVmWorkloadSapAseDatabaseWorkloadItem.class),
    @JsonSubTypes.Type(name = "SAPAseSystem", value = AzureVmWorkloadSapAseSystemWorkloadItem.class),
    @JsonSubTypes.Type(name = "SAPHanaDatabase", value = AzureVmWorkloadSapHanaDatabaseWorkloadItem.class),
    @JsonSubTypes.Type(name = "SAPHanaSystem", value = AzureVmWorkloadSapHanaSystemWorkloadItem.class),
    @JsonSubTypes.Type(name = "SQLDataBase", value = AzureVmWorkloadSqlDatabaseWorkloadItem.class),
    @JsonSubTypes.Type(name = "SQLInstance", value = AzureVmWorkloadSqlInstanceWorkloadItem.class)
})
@Fluent
public class AzureVmWorkloadItem extends WorkloadItem {
    /*
     * Name for instance or AG
     */
    @JsonProperty(value = "parentName")
    private String parentName;

    /*
     * Host/Cluster Name for instance or AG
     */
    @JsonProperty(value = "serverName")
    private String serverName;

    /*
     * Indicates if workload item is auto-protectable
     */
    @JsonProperty(value = "isAutoProtectable")
    private Boolean isAutoProtectable;

    /*
     * For instance or AG, indicates number of DB's present
     */
    @JsonProperty(value = "subinquireditemcount")
    private Integer subinquireditemcount;

    /*
     * For instance or AG, indicates number of DB's to be protected
     */
    @JsonProperty(value = "subWorkloadItemCount")
    private Integer subWorkloadItemCount;

    /** Creates an instance of AzureVmWorkloadItem class. */
    public AzureVmWorkloadItem() {
    }

    /**
     * Get the parentName property: Name for instance or AG.
     *
     * @return the parentName value.
     */
    public String parentName() {
        return this.parentName;
    }

    /**
     * Set the parentName property: Name for instance or AG.
     *
     * @param parentName the parentName value to set.
     * @return the AzureVmWorkloadItem object itself.
     */
    public AzureVmWorkloadItem withParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     * Get the serverName property: Host/Cluster Name for instance or AG.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Set the serverName property: Host/Cluster Name for instance or AG.
     *
     * @param serverName the serverName value to set.
     * @return the AzureVmWorkloadItem object itself.
     */
    public AzureVmWorkloadItem withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get the isAutoProtectable property: Indicates if workload item is auto-protectable.
     *
     * @return the isAutoProtectable value.
     */
    public Boolean isAutoProtectable() {
        return this.isAutoProtectable;
    }

    /**
     * Set the isAutoProtectable property: Indicates if workload item is auto-protectable.
     *
     * @param isAutoProtectable the isAutoProtectable value to set.
     * @return the AzureVmWorkloadItem object itself.
     */
    public AzureVmWorkloadItem withIsAutoProtectable(Boolean isAutoProtectable) {
        this.isAutoProtectable = isAutoProtectable;
        return this;
    }

    /**
     * Get the subinquireditemcount property: For instance or AG, indicates number of DB's present.
     *
     * @return the subinquireditemcount value.
     */
    public Integer subinquireditemcount() {
        return this.subinquireditemcount;
    }

    /**
     * Set the subinquireditemcount property: For instance or AG, indicates number of DB's present.
     *
     * @param subinquireditemcount the subinquireditemcount value to set.
     * @return the AzureVmWorkloadItem object itself.
     */
    public AzureVmWorkloadItem withSubinquireditemcount(Integer subinquireditemcount) {
        this.subinquireditemcount = subinquireditemcount;
        return this;
    }

    /**
     * Get the subWorkloadItemCount property: For instance or AG, indicates number of DB's to be protected.
     *
     * @return the subWorkloadItemCount value.
     */
    public Integer subWorkloadItemCount() {
        return this.subWorkloadItemCount;
    }

    /**
     * Set the subWorkloadItemCount property: For instance or AG, indicates number of DB's to be protected.
     *
     * @param subWorkloadItemCount the subWorkloadItemCount value to set.
     * @return the AzureVmWorkloadItem object itself.
     */
    public AzureVmWorkloadItem withSubWorkloadItemCount(Integer subWorkloadItemCount) {
        this.subWorkloadItemCount = subWorkloadItemCount;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadItem withBackupManagementType(String backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadItem withWorkloadType(String workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadItem withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadItem withProtectionState(ProtectionStatus protectionState) {
        super.withProtectionState(protectionState);
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
