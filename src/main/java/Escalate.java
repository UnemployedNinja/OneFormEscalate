import td.api.CustomAttribute;
import td.api.TDException;
import td.api.TeamDynamix;
import td.api.Ticket;

import java.rmi.server.UID;
import java.util.ArrayList;

public class Escalate {

    /**
     * One Switch To Rule Them All,
     * One Switch to find them,
     * One Switch to bring them all and in the Darkness bind them.
     *
     * BSC Tag 1 link:
     * https://td.byui.edu/TDAdmin/fcb76cab-d63e-41d6-a1f0-34c67299d6bf/48/Attributes/AttributeEdit.aspx?CMPID=9&ATTID=10333
     *
     * Excel doc Link:
     * https://webmailbyui.sharepoint.com/:x:/r/sites/groupbyu-idahosupportcenter/_layouts/15/doc2.aspx?sourcedoc=%7B71299823-416F-45D8-A95A-BF7E0F8EB255%7D&file=General%20Level%202%20Emails%20From%20Tags.xlsx&action=default&mobileredirect=true&cid=a529ebdb-c1ce-4b52-b85e-6b411d2cf809
     */
    public static String oneSwitchToRuleThemAll(int tagValueID) {

        String email = null;

        switch (tagValueID) {
            // One From -> General
            case 31877: // Alumni Office
                email = "alumni@byui.edu";
            case 31878: // Bowling/Skating
                email = "roseh@byui.edu";
            case 31879: // BSC (about the Support Center)
                email = null;
            case 31881: // Catering
                email = "catering@byui.edu";
            case 31882: // Center Stage
                email = "centerstage@byui.edu";
            case 31880: // Continuing Endorsement
                email = "sho@byui.edu";
            case 34472: // Counseling Center
                email = "counselingsec@byui.edu";
            case 31883: // Covid-19 (Coronavirus) Concerns
                email = null;
            case 31884: // Devotional
                email = "uroffice@byui.edu";
            case 31885: // Direct to Employee
                email = null;
            case 31886: // Disability Services
                email = "disabilityservices@byui.edu";
            case 31887: // Donations
                email = "philanthropies@churchofjesuschrist.org";
            case 31888: // Event Services
                email = "eventcoordinator@byui.edu";
            case 31889: // Executive Offices
                email = null;
            case 31890: // Express Print & Copy (Small and Quick Jobs)
                email = "print@byui.edu";
            case 36079: // Faculty Technology Center
                email = "FTC@byui.edu";
            case 31919: // Fitness/Wellness Center
                email = "wellness@byui.edu";
            case 31891: // Food Services
                email = "catering@byui.edu";
            case 31892: // Gave Directions To Location
                email = null;
            case 34471: // Health Center
                email = "healthcenterbilling@byui.edu";
            case 31895: // Hours of operations
                email = null;
            case 31893: // Honor Office
                email = "sho@byui.edu";
            case 31894: // Housing Office
                email = "housing@byui.edu";
            case 33587: // HR: Employment Verification
                email = null;
            case 31896: // HR: Human Resources
                email = "humanresources@byui.edu";
            case 31902: // HR: Online Employment & Scheduling
                email = "onlinehr@byui.edu";
            case 33585: // HR: Student Employment
                email = "humanresources@byui.edu";
            case 33588: // Tuition Waiver
                email = "benefits@byui.edu";
            case 33586: // HR: Workday
                email = "workday@byui.edu";
            case 31897: // International Services
            case 31898: // International Study Program
            case 31900: // Lost and Found Questions (Not Transferred)
                email = "NULL";
            case 31901: // myBYUI Student Portal (New)
            case 31903: // ORC (Outdoor Resource Center)
            case 34757: // Pathway Connect Issues
            case 31805: // Planetarium
            case 31904: // Print & Copy Services
            case 31905: // Radio/KBYi
            case 31906: // ROTC
            case 31907: // Safety & Security
            case 31908: // Scheduling Office
                email = "scheduling@byui.edu";
            case 33593: // Scroll Office
            case 31909: // Sexual Misconduct
            case 31910: // Stores & Receiving
            case 31911: // Student Activities
            case 31912: // Student Support
            case 31913: // Surplus Sale
            case 31915: // Ticket Office
            case 31916: // Travel Office
            case 31917: // University Relations
            case 31918: // University Texting
            case 31920: // Zimride

            // One Form -> Academic
            case 31788: // Art Dept.
                email = "art_dept@byui.edu";
            case 31789: // Automotive Dept.
                email = "automotivedept@byui.edu";
            case 31797: // Career Services
                email = "careerservices@byui.edu";
            case 31790: // College of Agriculture and Life Sciences (NOT ADVISING)
                email = "stuartra@byui.edu";
            case 31791: // College of Business and Communications (NOT ADVISING)
                email = "buscom@byui.edu";
            case 31792: // College of Education and Human Development (NOT ADVISING)
                email = "chidesterk@byui.edu";
            case 31793: // College of Language & Letters (NOT ADVISING)
                email = "gohrm@byui.edu";
            case 31794: // College of Performing & Visual Arts (NOT ADVISING)
                email = "collegePVA@byui.edu";
            case 31795: // College of Physical Sciences & Engineering (NOT ADVISING)
                email = "belnapj@byui.edu";
            case 31808: // Dean of Students
                email = "dos@byui.edu";
            case 31798: // Field Services (Student Teaching Placement)
                email = "fieldservices@byui.edu";
            case 34726: // Instructor Complaint or Grievance
            case 31799: // Internship Questions
                email = "internships@byui.edu";
            case 31800: // Math Dept.
            case 31801: // Nursing-On Campus (pre-Licensre BSC)
            case 31802: // Nursing-Online (RN to BSN)
            case 31803: // Office of General Education (NOT ADVISING)
            case 31804: // Office of Interdisciplinary Studies (NOT ADVISING)
            case 36152: // Positive Instructor Feedback
            case 34768: // Proctorio
            case 31806: // Religion Dept.
            case 31914: // Testing Center
            case 31807: // Tutoring (Academic Support Center)

            // One Form -> Facilites
            case 31952: // Access Control/Locks & Keys
                email = "accesscontrol@byui.edu";
            case 31945: // Custodial
                email = "facilitiesserv@byui.edu";
            case 31946: // Facilities/Grounds
                email = "facilitiesserv@byui.edu";
            case 31947: // Fleet Services
                email = "hiltonk@byui.edu";
            case 33595: // Gardens
                email = null;
            case 31948: // Hart Equipment Room/ Pool/ Fitness Center
                email = "equipmentroom@byui.edu";
            case 31899: // Library
                email = "ill@byui.edu";
            case 33598: // Livestock Center
            case 31949: // Mail Services
            case 31950: // Maps
            case 33596: // Orchard
            case 31951: // Parking Services
            case 33597: // Plant Shop

            // Other
            default:
                email = null;
        }

        return email;
    }
}
