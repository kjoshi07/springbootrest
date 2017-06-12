package com.kc.springbootrest.model;

/**
 * Created by User on 5/12/2017.
 */
public class ErrorResponse {
    private String status;
    private String errorMessage;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
