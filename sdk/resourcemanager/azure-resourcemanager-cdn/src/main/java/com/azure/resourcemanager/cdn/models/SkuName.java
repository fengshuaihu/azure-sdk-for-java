// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Name of the pricing tier. */
public final class SkuName extends ExpandableStringEnum<SkuName> {
    /** Static value Standard_Verizon for SkuName. */
    public static final SkuName STANDARD_VERIZON = fromString("Standard_Verizon");

    /** Static value Premium_Verizon for SkuName. */
    public static final SkuName PREMIUM_VERIZON = fromString("Premium_Verizon");

    /** Static value Custom_Verizon for SkuName. */
    public static final SkuName CUSTOM_VERIZON = fromString("Custom_Verizon");

    /** Static value Standard_Akamai for SkuName. */
    public static final SkuName STANDARD_AKAMAI = fromString("Standard_Akamai");

    /** Static value Standard_ChinaCdn for SkuName. */
    public static final SkuName STANDARD_CHINA_CDN = fromString("Standard_ChinaCdn");

    /** Static value Standard_Microsoft for SkuName. */
    public static final SkuName STANDARD_MICROSOFT = fromString("Standard_Microsoft");

    /** Static value Standard_AzureFrontDoor for SkuName. */
    public static final SkuName STANDARD_AZURE_FRONT_DOOR = fromString("Standard_AzureFrontDoor");

    /** Static value Premium_AzureFrontDoor for SkuName. */
    public static final SkuName PREMIUM_AZURE_FRONT_DOOR = fromString("Premium_AzureFrontDoor");

    /** Static value Standard_955BandWidth_ChinaCdn for SkuName. */
    public static final SkuName STANDARD_955BAND_WIDTH_CHINA_CDN = fromString("Standard_955BandWidth_ChinaCdn");

    /** Static value Standard_AvgBandWidth_ChinaCdn for SkuName. */
    public static final SkuName STANDARD_AVG_BAND_WIDTH_CHINA_CDN = fromString("Standard_AvgBandWidth_ChinaCdn");

    /** Static value StandardPlus_ChinaCdn for SkuName. */
    public static final SkuName STANDARD_PLUS_CHINA_CDN = fromString("StandardPlus_ChinaCdn");

    /** Static value StandardPlus_955BandWidth_ChinaCdn for SkuName. */
    public static final SkuName STANDARD_PLUS_955BAND_WIDTH_CHINA_CDN =
        fromString("StandardPlus_955BandWidth_ChinaCdn");

    /** Static value StandardPlus_AvgBandWidth_ChinaCdn for SkuName. */
    public static final SkuName STANDARD_PLUS_AVG_BAND_WIDTH_CHINA_CDN =
        fromString("StandardPlus_AvgBandWidth_ChinaCdn");

    /**
     * Creates or finds a SkuName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SkuName.
     */
    @JsonCreator
    public static SkuName fromString(String name) {
        return fromString(name, SkuName.class);
    }

    /**
     * Gets known SkuName values.
     *
     * @return known SkuName values.
     */
    public static Collection<SkuName> values() {
        return values(SkuName.class);
    }
}
