package com.green.g.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "sample_airbnb")
public class Post {
    private String listing_url;
    private String summary;
    private String neighborhood_overview;

    public Post() {
    }

	public String getListing_url() {
		return listing_url;
	}

	public void setListing_url(String listing_url) {
		this.listing_url = listing_url;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getNeighborhood_overview() {
		return neighborhood_overview;
	}

	public void setNeighborhood_overview(String neighborhood_overview) {
		this.neighborhood_overview = neighborhood_overview;
	}


    
}
