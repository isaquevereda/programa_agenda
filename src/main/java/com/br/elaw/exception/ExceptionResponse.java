package com.br.elaw.exception;


import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;

public class ExceptionResponse implements Serializable {


    private static final long serialVersionUID = 1L;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate timestamp;

    private String message;

    private String details;

    public ExceptionResponse() {}

    public ExceptionResponse(LocalDate timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }


    public LocalDate getTimestamp() {
        return timestamp;
    }


    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


    @Override
    public String toString() {
        return "ExceptionResponse [timestamp=" + timestamp + ", message=" + message + ", details=" + details + "]";
    }


}
