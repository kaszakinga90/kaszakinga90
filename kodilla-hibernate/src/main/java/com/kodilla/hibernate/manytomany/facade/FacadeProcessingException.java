package com.kodilla.hibernate.manytomany.facade;

public class FacadeProcessingException extends Exception {
    public static String ERR_EMPLOYEE_NOT_FOUND = "There is no such an employee";
    public static String ERR_COMPANY_NOT_FOUND = "There is no such a company";

    public FacadeProcessingException(String message){
        super(message);
    }
}