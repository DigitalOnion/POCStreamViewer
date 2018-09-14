
package com.magicleap.pocstreamviewer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Location implements Serializable
{

    @SerializedName("street")
    @Expose
    public String street;
    @SerializedName("city")
    @Expose
    public String city;
    @SerializedName("state")
    @Expose
    public String state;
    @SerializedName("postcode")
    @Expose
    public long postcode;
    private final static long serialVersionUID = -6127487442374143837L;

}
