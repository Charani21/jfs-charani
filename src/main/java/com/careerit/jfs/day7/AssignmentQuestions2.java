package com.careerit.jfs.day7;


enum ReportType{
    HTML , PDF , EXCEL , CSV
}
public class AssignmentQuestions2 {
    public static void main(String[] args) {
        generateReport(ReportType.HTML);
        generateReport(ReportType.PDF);
        generateReport(ReportType.EXCEL);
        generateReport(ReportType.CSV);
    }
    public static void  generateReport(ReportType type){
    //Logic
        //If type is HTML then message should be "Generating HTML Report"
        //If type is PDF then message should be "Generating PDF Report"
        //If type is EXCEL then message should be "Generating EXCEL Report"
        //If type is CSV then message should be "Generating CSV File"
        //If type is none of the above messages then it is "Invalid report type"
    }
}
