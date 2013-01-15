package com.sumologic.client;

/**
 * General sumo API web service errors.
 *
 * @author Sebastian Mies
 * @version 1.0
 */
public enum SumoServerErrors implements SumoServerError {
    INTERNAL_SERVER_ERROR("internal.error"),
    UNAUTHORIZED("unauthorized"),
    UNAVAILABLE("service.unavailable"),

    INVALID_LIMIT("limit.invalid"),
    INVALID_OFFSET("offset.invalid");

    private String id = "";

    SumoServerErrors(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
