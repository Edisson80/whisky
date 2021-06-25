package com.df.whisky.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Whisky implements Serializable {
    @SerializedName("name")
    private String nombreWisky;

    @SerializedName("slug")
    private String slugWisky;

    @SerializedName("url")
    private String urlWisky;

    @SerializedName("buyers_fee")
    private String buyers_feeWisky;

    @SerializedName("sellers_fee")
    private String sellers_feeWisky;

    @SerializedName("reserve_fee")
    private String reserve_feeWisky;

    @SerializedName("listing_fee")
    private String listing_feeWisky;

    @SerializedName("base_currency")
    private String base_currencyWisky;

    public Whisky(String nombreWisky, String slugWisky, String urlWisky, String buyers_feeWisky,
                  String sellers_feeWisky, String reserve_feeWisky, String listing_feeWisky,
                  String base_currencyWisky) {
        this.nombreWisky = nombreWisky;
        this.slugWisky = slugWisky;
        this.urlWisky = urlWisky;
        this.buyers_feeWisky = buyers_feeWisky;
        this.sellers_feeWisky = sellers_feeWisky;
        this.reserve_feeWisky = reserve_feeWisky;
        this.listing_feeWisky = listing_feeWisky;
        this.base_currencyWisky = base_currencyWisky;

    }

    public String getNombreWisky() {
        return nombreWisky;
    }

    public void setNombreWisky(String nombreWisky) {
        this.nombreWisky = nombreWisky;
    }

    public String getSlugWisky() {
        return slugWisky;
    }

    public void setSlugWisky(String slugWisky) {
        this.slugWisky = slugWisky;
    }

    public String getUrlWisky() {
        return urlWisky;
    }

    public void setUrlWisky(String urlWisky) {
        this.urlWisky = urlWisky;
    }

    public String getBuyers_feeWisky() {
        return buyers_feeWisky;
    }

    public void setBuyers_feeWisky(String buyers_feeWisky) {
        this.buyers_feeWisky = buyers_feeWisky;
    }

    public String getSellers_feeWisky() {
        return sellers_feeWisky;
    }

    public void setSellers_feeWisky(String sellers_feeWisky) {
        this.sellers_feeWisky = sellers_feeWisky;
    }

    public String getReserve_feeWisky() {
        return reserve_feeWisky;
    }

    public void setReserve_feeWisky(String reserve_feeWisky) {
        this.reserve_feeWisky = reserve_feeWisky;
    }

    public String getListing_feeWisky() {
        return listing_feeWisky;
    }

    public void setListing_feeWisky(String listing_feeWisky) {
        this.listing_feeWisky = listing_feeWisky;
    }

    public String getBase_currencyWisky() {
        return base_currencyWisky;
    }

    public void setBase_currencyWisky(String base_currencyWisky) {
        this.base_currencyWisky = base_currencyWisky;
    }
}
