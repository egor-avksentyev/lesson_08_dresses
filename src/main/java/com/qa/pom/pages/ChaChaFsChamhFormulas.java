package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class ChaChaFsChamhFormulas extends AbstractAssessmentPage {

    @FindBy(xpath = "//div[@varname='FS']")
    private WebElement waitForElemUpload;


    public ChaChaFsChamhFormulas(BaseTest testClass)  {
        super(testClass);
        testClass.waitTillElementIsVisible(loadingWrapper);
        testClass.waitTillElementNotVisible(wrapXpath);
        testClass.waitTillElementIsVisible(waitForElemUpload);
    }

    //-----------------------------------Scales---------------------------------------------------

    /**
    Method which includes all levels test of Communication Scale

     */
public void communicationScaleTest () {
    communicationScale_0_Intact ();
    communicationScale_1_BORDERLINE_INTACT ();
    communicationScale_2_MildImpairment ();
    communicationScale_3_MildOrModerateImpairment ();
    communicationScale_4_ModerateImpairment ();
    communicationScale_5_ModerateOrSevereImpairment ();
    communicationScale_6_SevereImpairment();
    communicationScale_7_SevereOrVerySevereImpairment ();
    communicationScale_8_VerySevereImpairment ();
    }

public void communicationScale_0_Intact () {
    goToNewSection("D. COMMUNICATION");
    fillInDropdown("iD1","0");
    fillInDropdown("iD2","0");
    checkScaleTrigger("Communication Scale (CS)","0 out of 8","Intact");
    }

    public void communicationScale_1_BORDERLINE_INTACT () {
        fillInDropdown("iD1","1");
        fillInDropdown("iD2","0");
        checkScaleTrigger("Communication Scale (CS)","1 out of 8","Borderline intact");
    }

    public void communicationScale_2_MildImpairment () {
        fillInDropdown("iD1","2");
        fillInDropdown("iD2","0");
        checkScaleTrigger("Communication Scale (CS)","2 out of 8","Mild impairment");
    }

    public void communicationScale_3_MildOrModerateImpairment () {
        fillInDropdown("iD1","3");
        fillInDropdown("iD2","0");
        checkScaleTrigger("Communication Scale (CS)","3 out of 8","Mild/moderate impairment");
    }

    public void communicationScale_4_ModerateImpairment () {
        fillInDropdown("iD1","4");
        fillInDropdown("iD2","0");
        checkScaleTrigger("Communication Scale (CS)","4 out of 8","Moderate impairment");
    }
    public void communicationScale_5_ModerateOrSevereImpairment () {
        fillInDropdown("iD1","4");
        fillInDropdown("iD2","1");
        checkScaleTrigger("Communication Scale (CS)","5 out of 8","Moderate/severe impairment");
    }
    public void communicationScale_6_SevereImpairment () {
        fillInDropdown("iD1","4");
        fillInDropdown("iD2","2");
        checkScaleTrigger("Communication Scale (CS)","6 out of 8","Severe impairment");
    }
    public void communicationScale_7_SevereOrVerySevereImpairment () {
        fillInDropdown("iD1","4");
        fillInDropdown("iD2","3");
        checkScaleTrigger("Communication Scale (CS)","7 out of 8","Severe/very severe impairment");
    }
    public void communicationScale_8_VerySevereImpairment () {
        fillInDropdown("iD1","4");
        fillInDropdown("iD2","4");
        checkScaleTrigger("Communication Scale (CS)","8 out of 8","Very severe impairment");
    }

public void ADLScale_ShortFormTest(){



}

public void ADLScale_ShortForm_0_Out_Of_16 (){

    goToNewSection("G. FUNCTIONAL");
    fillInDropdown("iG2b","0");
    fillInDropdown("iG2f","0");
    checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","0 out of 16","No ADL Impairment");
}
    public void ADLScale_ShortForm_1_Out_Of_16 (){

        fillInDropdown("iG2b","2");
        fillInDropdown("iG2f","0");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","1 out of 16","Higher values indicate greater difficulty in performing activities");
    }

    public void ADLScale_ShortForm_2_Out_Of_16 (){

        fillInDropdown("iG2b","2");
        fillInDropdown("iG2f","2");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","2 out of 16","Higher values indicate greater difficulty in performing activities");
    }

    public void ADLScale_ShortForm_3_Out_Of_16 () {

        fillInDropdown("iG2b","3");
        fillInDropdown("iG2f","2");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","3 out of 16","Higher values indicate greater difficulty in performing activities");
    }

    public void ADLScale_ShortForm_4_Out_Of_16 () {

        fillInDropdown("iG2b","4");
        fillInDropdown("iG2f","2");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","4 out of 16","Higher values indicate greater difficulty in performing activities");
    }

    public void ADLScale_ShortForm_5_Out_Of_16 () {

        fillInDropdown("iG2b","4");
        fillInDropdown("iG2f","2");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","4 out of 16","Higher values indicate greater difficulty in performing activities");
    }

    public void formulasTestScales () {

        communicationScaleTest ();

}

//-----------------------------------Caps---------------------------------------------------


    public void formulasTestCaps () {
        behaviorCapTest ();
    }

    public void behaviorCapTest () {
        behaviorCap_0 ();
        //behaviorCap_1 ();
       // behaviorCap_2 ();
    }

    public void behaviorCap_0 () {
        clickOnRadioButton("FS","1");
        goToSupplement("CHA-FS");
        goToNewSection("C. MOOD");
        fillInDropdown("iE3a","0");
        fillInDropdown("iE3b","0");
        fillInDropdown("iE3c","0");
        fillInDropdown("iE3d","0");
        fillInDropdown("iE3e","0");
        fillInDropdown("iE3f","0");
        checkCapTrigger("Behavior CAP","0","Not triggered");
    }


}