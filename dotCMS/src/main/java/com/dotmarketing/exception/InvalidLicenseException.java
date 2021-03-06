package com.dotmarketing.exception;

/**
 * @author Jonathan Gamba
 *         Date: 1/20/16
 */
public class InvalidLicenseException extends RuntimeException {

    public InvalidLicenseException() {
        this("Need an enterprise license to run this functionality.");
    }

    public InvalidLicenseException ( String message ) {
        super(message);
    }

}