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

public class ViewSuggestion {

    public static void campCommitteeViewSuggestion(CampCommitteeMember campCommitteeMember) {
        System.out.println("Your suggestions:");

        // Check for empty list

        // Get only the suggestions from the camp committee member
        int i = 1;
        for (Camp camp : CampsList.getCreatedCampsList()) {
            for (Suggestion suggestion : camp.getSuggestionList()) {
                if (suggestion.getStudentID().equals(campCommitteeMember.getUserID())) {
                    System.out.println(i + ". [Camp: " + suggestion.getCampName() + "] Suggestion: "
                            + suggestion.getSuggestionString());
                    i++;
                }
            }
        }

    }

    public static void staffViewSuggestion(Staff staff) {

        System.out.println("All suggestions:");
        int i = 1;
        for (Camp camp : CampsList.getCreatedCampsList()) {
            for (Suggestion suggestion : camp.getSuggestionList()) {
                if (camp.getStaffInCharge().equals(staff.getUserID())) {
                    System.out.println(i + ". [Camp: " + suggestion.getCampName() + "] Suggestion: "
                            + suggestion.getSuggestionString());
                    i++;
                }
            }

        }
    }

}