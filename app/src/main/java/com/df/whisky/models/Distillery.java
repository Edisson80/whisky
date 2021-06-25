package com.df.whisky.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Distillery implements Serializable {
    @SerializedName("name")
    private String nombreDestileria;

    @SerializedName("slug")
    private String slugDestileria;

    @SerializedName("country")
    private String countryDestileria;

    @SerializedName("whiskybase_whiskies")
    private String whiskybase_whiskiesDestileria;

    @SerializedName("whiskybase_votes")
    private String whiskybase_votesDestileria;

    @SerializedName("whiskybase_rating")
    private String whiskybase_ratingDestileria;

    public Distillery(String nombreDestileria, String slugDestileria, String countryDestileria,
                      String whiskybase_whiskiesDestileria, String whiskybase_votesDestileria,
                      String whiskybase_ratingDestileria) {
        this.nombreDestileria = nombreDestileria;
        this.slugDestileria = slugDestileria;
        this.countryDestileria = countryDestileria;
        this.whiskybase_whiskiesDestileria = whiskybase_whiskiesDestileria;
        this.whiskybase_votesDestileria = whiskybase_votesDestileria;
        this.whiskybase_ratingDestileria = whiskybase_ratingDestileria;
    }

    public String getNombreDestileria() {
        return nombreDestileria;
    }

    public void setNombreDestileria(String nombreDestileria) {
        this.nombreDestileria = nombreDestileria;
    }

    public String getSlugDestileria() {
        return slugDestileria;
    }

    public void setSlugDestileria(String slugDestileria) {
        this.slugDestileria = slugDestileria;
    }

    public String getCountryDestileria() {
        return countryDestileria;
    }

    public void setCountryDestileria(String countryDestileria) {
        this.countryDestileria = countryDestileria;
    }

    public String getWhiskybase_whiskiesDestileria() {
        return whiskybase_whiskiesDestileria;
    }

    public void setWhiskybase_whiskiesDestileria(String whiskybase_whiskiesDestileria) {
        this.whiskybase_whiskiesDestileria = whiskybase_whiskiesDestileria;
    }

    public String getWhiskybase_votesDestileria() {
        return whiskybase_votesDestileria;
    }

    public void setWhiskybase_votesDestileria(String whiskybase_votesDestileria) {
        this.whiskybase_votesDestileria = whiskybase_votesDestileria;
    }

    public String getWhiskybase_ratingDestileria() {
        return whiskybase_ratingDestileria;
    }

    public void setWhiskybase_ratingDestileria(String whiskybase_ratingDestileria) {
        this.whiskybase_ratingDestileria = whiskybase_ratingDestileria;
    }
}
