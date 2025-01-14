// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** The DataFeedDetail model. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "dataSourceType",
        defaultImpl = DataFeedDetail.class)
@JsonTypeName("DataFeedDetail")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureApplicationInsights", value = AzureApplicationInsightsDataFeed.class),
    @JsonSubTypes.Type(name = "AzureBlob", value = AzureBlobDataFeed.class),
    @JsonSubTypes.Type(name = "AzureCosmosDB", value = AzureCosmosDBDataFeed.class),
    @JsonSubTypes.Type(name = "AzureDataExplorer", value = AzureDataExplorerDataFeed.class),
    @JsonSubTypes.Type(name = "AzureDataLakeStorageGen2", value = AzureDataLakeStorageGen2DataFeed.class),
    @JsonSubTypes.Type(name = "AzureEventHubs", value = AzureEventHubsDataFeed.class),
    @JsonSubTypes.Type(name = "AzureLogAnalytics", value = AzureLogAnalyticsDataFeed.class),
    @JsonSubTypes.Type(name = "AzureTable", value = AzureTableDataFeed.class),
    @JsonSubTypes.Type(name = "InfluxDB", value = InfluxDBDataFeed.class),
    @JsonSubTypes.Type(name = "MySql", value = MySqlDataFeed.class),
    @JsonSubTypes.Type(name = "PostgreSql", value = PostgreSqlDataFeed.class),
    @JsonSubTypes.Type(name = "SqlServer", value = SQLServerDataFeed.class),
    @JsonSubTypes.Type(name = "MongoDB", value = MongoDBDataFeed.class)
})
@Fluent
public class DataFeedDetail {
    /*
     * data feed unique id
     */
    @JsonProperty(value = "dataFeedId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID dataFeedId;

    /*
     * data feed name
     */
    @JsonProperty(value = "dataFeedName", required = true)
    private String dataFeedName;

    /*
     * data feed description
     */
    @JsonProperty(value = "dataFeedDescription")
    private String dataFeedDescription;

    /*
     * granularity of the time series
     */
    @JsonProperty(value = "granularityName", required = true)
    private Granularity granularityName;

    /*
     * if granularity is custom,it is required.
     */
    @JsonProperty(value = "granularityAmount")
    private Integer granularityAmount;

    /*
     * measure list
     */
    @JsonProperty(value = "metrics", required = true)
    private List<DataFeedMetric> metrics;

    /*
     * dimension list
     */
    @JsonProperty(value = "dimension")
    private List<DataFeedDimension> dimension;

    /*
     * user-defined timestamp column. if timestampColumn is null, start time of every time slice will be used as
     * default value.
     */
    @JsonProperty(value = "timestampColumn")
    private String timestampColumn;

    /*
     * ingestion start time
     */
    @JsonProperty(value = "dataStartFrom", required = true)
    private OffsetDateTime dataStartFrom;

    /*
     * the time that the beginning of data ingestion task will delay for every data slice according to this offset.
     */
    @JsonProperty(value = "startOffsetInSeconds")
    private Long startOffsetInSeconds;

    /*
     * the max concurrency of data ingestion queries against user data source. 0 means no limitation.
     */
    @JsonProperty(value = "maxConcurrency")
    private Integer maxConcurrency;

    /*
     * the min retry interval for failed data ingestion tasks.
     */
    @JsonProperty(value = "minRetryIntervalInSeconds")
    private Long minRetryIntervalInSeconds;

    /*
     * stop retry data ingestion after the data slice first schedule time in seconds.
     */
    @JsonProperty(value = "stopRetryAfterInSeconds")
    private Long stopRetryAfterInSeconds;

    /*
     * mark if the data feed need rollup
     */
    @JsonProperty(value = "needRollup")
    private NeedRollupEnum needRollup;

    /*
     * roll up method
     */
    @JsonProperty(value = "rollUpMethod")
    private RollUpMethod rollUpMethod;

    /*
     * roll up columns
     */
    @JsonProperty(value = "rollUpColumns")
    private List<String> rollUpColumns;

    /*
     * the identification value for the row of calculated all-up value.
     */
    @JsonProperty(value = "allUpIdentification")
    private String allUpIdentification;

    /*
     * the type of fill missing point for anomaly detection
     */
    @JsonProperty(value = "fillMissingPointType")
    private FillMissingPointType fillMissingPointType;

    /*
     * the value of fill missing point for anomaly detection
     */
    @JsonProperty(value = "fillMissingPointValue")
    private Double fillMissingPointValue;

    /*
     * data feed access mode, default is Private
     */
    @JsonProperty(value = "viewMode")
    private ViewMode viewMode;

    /*
     * data feed administrator
     */
    @JsonProperty(value = "admins")
    private List<String> admins;

    /*
     * data feed viewer
     */
    @JsonProperty(value = "viewers")
    private List<String> viewers;

    /*
     * the query user is one of data feed administrator or not
     */
    @JsonProperty(value = "isAdmin", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isAdmin;

    /*
     * data feed creator
     */
    @JsonProperty(value = "creator", access = JsonProperty.Access.WRITE_ONLY)
    private String creator;

    /*
     * data feed status
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private EntityStatus status;

    /*
     * data feed created time
     */
    @JsonProperty(value = "createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTime;

    /*
     * action link for alert
     */
    @JsonProperty(value = "actionLinkTemplate")
    private String actionLinkTemplate;

    /*
     * authentication type for corresponding data source
     */
    @JsonProperty(value = "authenticationType")
    private AuthenticationTypeEnum authenticationType;

    /*
     * The credential entity id
     */
    @JsonProperty(value = "credentialId")
    private String credentialId;

    /** Creates an instance of DataFeedDetail class. */
    public DataFeedDetail() {}

    /**
     * Get the dataFeedId property: data feed unique id.
     *
     * @return the dataFeedId value.
     */
    public UUID getDataFeedId() {
        return this.dataFeedId;
    }

    /**
     * Get the dataFeedName property: data feed name.
     *
     * @return the dataFeedName value.
     */
    public String getDataFeedName() {
        return this.dataFeedName;
    }

    /**
     * Set the dataFeedName property: data feed name.
     *
     * @param dataFeedName the dataFeedName value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setDataFeedName(String dataFeedName) {
        this.dataFeedName = dataFeedName;
        return this;
    }

    /**
     * Get the dataFeedDescription property: data feed description.
     *
     * @return the dataFeedDescription value.
     */
    public String getDataFeedDescription() {
        return this.dataFeedDescription;
    }

    /**
     * Set the dataFeedDescription property: data feed description.
     *
     * @param dataFeedDescription the dataFeedDescription value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setDataFeedDescription(String dataFeedDescription) {
        this.dataFeedDescription = dataFeedDescription;
        return this;
    }

    /**
     * Get the granularityName property: granularity of the time series.
     *
     * @return the granularityName value.
     */
    public Granularity getGranularityName() {
        return this.granularityName;
    }

    /**
     * Set the granularityName property: granularity of the time series.
     *
     * @param granularityName the granularityName value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setGranularityName(Granularity granularityName) {
        this.granularityName = granularityName;
        return this;
    }

    /**
     * Get the granularityAmount property: if granularity is custom,it is required.
     *
     * @return the granularityAmount value.
     */
    public Integer getGranularityAmount() {
        return this.granularityAmount;
    }

    /**
     * Set the granularityAmount property: if granularity is custom,it is required.
     *
     * @param granularityAmount the granularityAmount value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setGranularityAmount(Integer granularityAmount) {
        this.granularityAmount = granularityAmount;
        return this;
    }

    /**
     * Get the metrics property: measure list.
     *
     * @return the metrics value.
     */
    public List<DataFeedMetric> getMetrics() {
        return this.metrics;
    }

    /**
     * Set the metrics property: measure list.
     *
     * @param metrics the metrics value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setMetrics(List<DataFeedMetric> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get the dimension property: dimension list.
     *
     * @return the dimension value.
     */
    public List<DataFeedDimension> getDimension() {
        return this.dimension;
    }

    /**
     * Set the dimension property: dimension list.
     *
     * @param dimension the dimension value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setDimension(List<DataFeedDimension> dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * Get the timestampColumn property: user-defined timestamp column. if timestampColumn is null, start time of every
     * time slice will be used as default value.
     *
     * @return the timestampColumn value.
     */
    public String getTimestampColumn() {
        return this.timestampColumn;
    }

    /**
     * Set the timestampColumn property: user-defined timestamp column. if timestampColumn is null, start time of every
     * time slice will be used as default value.
     *
     * @param timestampColumn the timestampColumn value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setTimestampColumn(String timestampColumn) {
        this.timestampColumn = timestampColumn;
        return this;
    }

    /**
     * Get the dataStartFrom property: ingestion start time.
     *
     * @return the dataStartFrom value.
     */
    public OffsetDateTime getDataStartFrom() {
        return this.dataStartFrom;
    }

    /**
     * Set the dataStartFrom property: ingestion start time.
     *
     * @param dataStartFrom the dataStartFrom value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setDataStartFrom(OffsetDateTime dataStartFrom) {
        this.dataStartFrom = dataStartFrom;
        return this;
    }

    /**
     * Get the startOffsetInSeconds property: the time that the beginning of data ingestion task will delay for every
     * data slice according to this offset.
     *
     * @return the startOffsetInSeconds value.
     */
    public Long getStartOffsetInSeconds() {
        return this.startOffsetInSeconds;
    }

    /**
     * Set the startOffsetInSeconds property: the time that the beginning of data ingestion task will delay for every
     * data slice according to this offset.
     *
     * @param startOffsetInSeconds the startOffsetInSeconds value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setStartOffsetInSeconds(Long startOffsetInSeconds) {
        this.startOffsetInSeconds = startOffsetInSeconds;
        return this;
    }

    /**
     * Get the maxConcurrency property: the max concurrency of data ingestion queries against user data source. 0 means
     * no limitation.
     *
     * @return the maxConcurrency value.
     */
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * Set the maxConcurrency property: the max concurrency of data ingestion queries against user data source. 0 means
     * no limitation.
     *
     * @param maxConcurrency the maxConcurrency value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * Get the minRetryIntervalInSeconds property: the min retry interval for failed data ingestion tasks.
     *
     * @return the minRetryIntervalInSeconds value.
     */
    public Long getMinRetryIntervalInSeconds() {
        return this.minRetryIntervalInSeconds;
    }

    /**
     * Set the minRetryIntervalInSeconds property: the min retry interval for failed data ingestion tasks.
     *
     * @param minRetryIntervalInSeconds the minRetryIntervalInSeconds value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setMinRetryIntervalInSeconds(Long minRetryIntervalInSeconds) {
        this.minRetryIntervalInSeconds = minRetryIntervalInSeconds;
        return this;
    }

    /**
     * Get the stopRetryAfterInSeconds property: stop retry data ingestion after the data slice first schedule time in
     * seconds.
     *
     * @return the stopRetryAfterInSeconds value.
     */
    public Long getStopRetryAfterInSeconds() {
        return this.stopRetryAfterInSeconds;
    }

    /**
     * Set the stopRetryAfterInSeconds property: stop retry data ingestion after the data slice first schedule time in
     * seconds.
     *
     * @param stopRetryAfterInSeconds the stopRetryAfterInSeconds value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setStopRetryAfterInSeconds(Long stopRetryAfterInSeconds) {
        this.stopRetryAfterInSeconds = stopRetryAfterInSeconds;
        return this;
    }

    /**
     * Get the needRollup property: mark if the data feed need rollup.
     *
     * @return the needRollup value.
     */
    public NeedRollupEnum getNeedRollup() {
        return this.needRollup;
    }

    /**
     * Set the needRollup property: mark if the data feed need rollup.
     *
     * @param needRollup the needRollup value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setNeedRollup(NeedRollupEnum needRollup) {
        this.needRollup = needRollup;
        return this;
    }

    /**
     * Get the rollUpMethod property: roll up method.
     *
     * @return the rollUpMethod value.
     */
    public RollUpMethod getRollUpMethod() {
        return this.rollUpMethod;
    }

    /**
     * Set the rollUpMethod property: roll up method.
     *
     * @param rollUpMethod the rollUpMethod value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setRollUpMethod(RollUpMethod rollUpMethod) {
        this.rollUpMethod = rollUpMethod;
        return this;
    }

    /**
     * Get the rollUpColumns property: roll up columns.
     *
     * @return the rollUpColumns value.
     */
    public List<String> getRollUpColumns() {
        return this.rollUpColumns;
    }

    /**
     * Set the rollUpColumns property: roll up columns.
     *
     * @param rollUpColumns the rollUpColumns value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setRollUpColumns(List<String> rollUpColumns) {
        this.rollUpColumns = rollUpColumns;
        return this;
    }

    /**
     * Get the allUpIdentification property: the identification value for the row of calculated all-up value.
     *
     * @return the allUpIdentification value.
     */
    public String getAllUpIdentification() {
        return this.allUpIdentification;
    }

    /**
     * Set the allUpIdentification property: the identification value for the row of calculated all-up value.
     *
     * @param allUpIdentification the allUpIdentification value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setAllUpIdentification(String allUpIdentification) {
        this.allUpIdentification = allUpIdentification;
        return this;
    }

    /**
     * Get the fillMissingPointType property: the type of fill missing point for anomaly detection.
     *
     * @return the fillMissingPointType value.
     */
    public FillMissingPointType getFillMissingPointType() {
        return this.fillMissingPointType;
    }

    /**
     * Set the fillMissingPointType property: the type of fill missing point for anomaly detection.
     *
     * @param fillMissingPointType the fillMissingPointType value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setFillMissingPointType(FillMissingPointType fillMissingPointType) {
        this.fillMissingPointType = fillMissingPointType;
        return this;
    }

    /**
     * Get the fillMissingPointValue property: the value of fill missing point for anomaly detection.
     *
     * @return the fillMissingPointValue value.
     */
    public Double getFillMissingPointValue() {
        return this.fillMissingPointValue;
    }

    /**
     * Set the fillMissingPointValue property: the value of fill missing point for anomaly detection.
     *
     * @param fillMissingPointValue the fillMissingPointValue value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setFillMissingPointValue(Double fillMissingPointValue) {
        this.fillMissingPointValue = fillMissingPointValue;
        return this;
    }

    /**
     * Get the viewMode property: data feed access mode, default is Private.
     *
     * @return the viewMode value.
     */
    public ViewMode getViewMode() {
        return this.viewMode;
    }

    /**
     * Set the viewMode property: data feed access mode, default is Private.
     *
     * @param viewMode the viewMode value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setViewMode(ViewMode viewMode) {
        this.viewMode = viewMode;
        return this;
    }

    /**
     * Get the admins property: data feed administrator.
     *
     * @return the admins value.
     */
    public List<String> getAdmins() {
        return this.admins;
    }

    /**
     * Set the admins property: data feed administrator.
     *
     * @param admins the admins value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setAdmins(List<String> admins) {
        this.admins = admins;
        return this;
    }

    /**
     * Get the viewers property: data feed viewer.
     *
     * @return the viewers value.
     */
    public List<String> getViewers() {
        return this.viewers;
    }

    /**
     * Set the viewers property: data feed viewer.
     *
     * @param viewers the viewers value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setViewers(List<String> viewers) {
        this.viewers = viewers;
        return this;
    }

    /**
     * Get the isAdmin property: the query user is one of data feed administrator or not.
     *
     * @return the isAdmin value.
     */
    public Boolean isAdmin() {
        return this.isAdmin;
    }

    /**
     * Get the creator property: data feed creator.
     *
     * @return the creator value.
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * Get the status property: data feed status.
     *
     * @return the status value.
     */
    public EntityStatus getStatus() {
        return this.status;
    }

    /**
     * Get the createdTime property: data feed created time.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Get the actionLinkTemplate property: action link for alert.
     *
     * @return the actionLinkTemplate value.
     */
    public String getActionLinkTemplate() {
        return this.actionLinkTemplate;
    }

    /**
     * Set the actionLinkTemplate property: action link for alert.
     *
     * @param actionLinkTemplate the actionLinkTemplate value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setActionLinkTemplate(String actionLinkTemplate) {
        this.actionLinkTemplate = actionLinkTemplate;
        return this;
    }

    /**
     * Get the authenticationType property: authentication type for corresponding data source.
     *
     * @return the authenticationType value.
     */
    public AuthenticationTypeEnum getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: authentication type for corresponding data source.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setAuthenticationType(AuthenticationTypeEnum authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the credentialId property: The credential entity id.
     *
     * @return the credentialId value.
     */
    public String getCredentialId() {
        return this.credentialId;
    }

    /**
     * Set the credentialId property: The credential entity id.
     *
     * @param credentialId the credentialId value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
}
