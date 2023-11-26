package com.example.dswii_cl3_castillotaraenzo.exception;
public class MaxUploadSizeExceedException extends RuntimeException {
    public MaxUploadSizeExceedException (String message){
        super(message);
    }
}