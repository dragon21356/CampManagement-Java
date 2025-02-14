package pkg_camp;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Suggestion {

    // Attributes
    // List<Suggestion> SuggestionList = new ArrayList<>();

    private String studentID;
    private String suggestionString;
    private String campName;
    private boolean approved;

    // Constructor to upload, have to pass in student ID, campName, suggestion
    public Suggestion(String studentID, String suggestionString, String campName) {
        this.studentID = studentID;
        this.suggestionString = suggestionString;
        this.campName = campName;
    }

    // Constructor to download from excel, pass in same things + whether it's
    // approved
    public Suggestion(String studentID, String suggestionString, String campName, boolean approved) {
        this.studentID = studentID;
        this.suggestionString = suggestionString;
        this.campName = campName;
        this.approved = approved;
    }

    // Getter Methods
    public String getStudentID() {
        return studentID;
    }

    public String getSuggestionString() {
        return suggestionString;
    }

    public String getCampName() {
        return campName;
    }

    public boolean getApproved() {
        return approved;
    }

    // Methods

    public boolean isApproved() {
        return approved;
    }

    public void approveSuggestion() {
        this.approved = true;
    }

    public void setSuggestionString(String newstr) {
        this.suggestionString = newstr;
    }
    // public Suggestion setSuggestionString(String newStr) {
    // this.suggestionString = newStr;
    // return this;
    // }
}

// Old implementation below
/*
 * public void addSuggestion(Suggestion suggestion) {
 * // get the list first, then append to the end of the list
 * suggestion.add(suggestion);
 * }
 * 
 * public List<Suggestion> getAllSuggestions() {
 * // getSuggestionList
 * }
 * 
 * public static class Suggestion {
 * private String campName;
 * private String suggestedDetails;
 * private boolean isAccepted;
 * 
 * public Suggestion(String campName, String suggestedDetails) {
 * this.campName = campName;
 * this.suggestedDetails = suggestedDetails;
 * this.isAccepted = false;
 * }
 * 
 * public String getCampName() {
 * return campName;
 * }
 * 
 * public String getSuggestedDetails() {
 * return suggestedDetails;
 * }
 * 
 * public boolean isAccepted() {
 * return isAccepted;
 * }
 * 
 * public void acceptSuggestion() {
 * isAccepted = true;
 * }
 * }
 */
