/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.JUnit4TestAdapter;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>emspcr</b></em>' package.
 * <!-- end-user-doc -->
 * 		

 * @generated
 */
 @RunWith(Suite.class)
@Suite.SuiteClasses({
  	PatientCareReportTest.class
  	,EMSCurrentMedicationSectionTest.class
  	,CurrentlyOnMedicationTest.class
  	,CurrentMedicationTest.class
  	,EMSCardiacArrestEventSectionTest.class
  	,CardiacArrestTest.class
  	,EMSAdvanceDirectivesSectionTest.class
  	,AdvanceDirectiveObservationTest.class
  	,EMSAllergiesAndAdverseReactionsSectionTest.class
  	,NonDrugAllergyOrganizerTest.class
  	,ExistenceOfKnownNonDrugAllergyTest.class
  	,NonDrugAllergyTest.class
  	,DrugAllergyOrganizerTest.class
  	,EMSPastMedicalHistorySectionTest.class
  	,ExistenceOfHistoryOfConditionOrSurgeryTest.class
  	,MedicalSurgicalHistoryTest.class
  	,EMSSocialHistorySectionTest.class
  	,ExistenceOfDrugUseIndicationTest.class
  	,DrugUseIndicationTest.class
  	,EMSPhysicalAssessmentSectionTest.class
  	,PhysicalAssessmentOrganizerTest.class
  	,PatientPregnancyTest.class
  	,LastOralIntakeTest.class
  	,PatientAgeTest.class
  	,ThrombolyticContraindicationsTest.class
  	,BarriersToPatientCareTest.class
  	,EMSMedicationsAdministeredSectionTest.class
  	,MedicationAdministeredTest.class
  	,EMSProceduresPerformedSectionTest.class
  	,ProcedureTest.class
  	,EMSPatientCareNarrativeSectionTest.class
  	,EMSSceneSectionTest.class
  	,FirstUnitIndicatorTest.class
  	,ScenePatientCountTest.class
  	,MassCasualtyIndicatorTest.class
  	,LocationTypeObservationTest.class
  	,EMSDispatchSectionTest.class
  	,EmergencyMedicalDispatchObservationTest.class
  	,DispatchReasonTest.class
  	,EMSDispositionSectionTest.class
  	,NumberOfPatientsTransportedObservationTest.class
  	,TransportModeObservationTest.class
  	,TransportMethodObservationTest.class
  	,ReasonForChoosingDestinationObservationTest.class
  	,PrearrivalActivationObservationTest.class
  	,PatientConditionAtDestinationObservationTest.class
  	,DestinationHospitalCapabilityTest.class
  	,DestinationWardTest.class
  	,UnitDispositionTest.class
  	,PatientEngagementTest.class
  	,CrewDispositionTest.class
  	,TransportDispositionTest.class
  	,EMSPersonnelAdverseEventSectionTest.class
  	,AdverseEventIndicatorTest.class
  	,AdverseEventTypeObservationTest.class
  	,EMSProtocolSectionTest.class
  	,ProtocolObservationTest.class
  	,CandidatePatientRegistryTypeTest.class
  	,EMSResponseSectionTest.class
  	,DelayOrganizerTest.class
  	,DispatchLocationOrganizerTest.class
  	,ResponseOdometerReadingOrganizerTest.class
  	,ResponseModeToSceneTest.class
  	,ResponseModeQualifierTest.class
  	,EMSSituationSectionTest.class
  	,ComplaintTest.class
  	,PossibleInjuryTest.class
  	,ProviderPrimaryImpressionTest.class
  	,PrimarySymptomTest.class
  	,OtherSymptomsTest.class
  	,ProviderSecondaryImpressionsTest.class
  	,InitialPatientAcuityTest.class
  	,EMSTimesSectionTest.class
  	,CallTimeTest.class
  	,UnitNotifiedTimeTest.class
  	,UnitEnRouteTimeTest.class
  	,UnitOnSceneTimeTest.class
  	,UnitAtPatientTimeTest.class
  	,UnitLeftSceneTimeTest.class
  	,PatientArrivedAtDestinationTimeTest.class
  	,UnitBackInServiceTimeTest.class
  	,DispatchNotifiedTimeTest.class
  	,EMSVitalSignsSectionTest.class
  	,VitalSignsOrganizerTest.class
  	,EMSInjuryIncidentDescriptionSectionTest.class
  	,InjuryCauseCategoryTest.class
  	,InjuryMechanismTest.class
  	,TraumaTriageCriteriaSteps1and2Test.class
  	,TraumaTriageCriteriaSteps3and4Test.class
  	,VehicleImpactAreaTest.class
  	,PatientLocationInVehicleTest.class
  	,VehicleOccupantSafetyEquipmentTest.class
  	,AirbagDeploymentStatusTest.class
  	,HeightOfFallTest.class
  	,DisasterTypeTest.class
  	,EMSBillingSectionTest.class
  	,BillingConditionTest.class
  	,LevelOfServiceObservationTest.class
  	,ResponseEndingOdometerReadingTest.class
  	,SystolicBloodPressureTest.class
  	,PriorAidVitalsTest.class
  	,DrugAllergyTest.class
  	,ExistenceOfKnownDrugAllergyObservationTest.class
  	,MedicationNotAdministeredReasonObservationTest.class
  	,MedicationResponseObservationTest.class
  	,MedicationComplicationObservationTest.class
  	,MedicationPriorAdministrationObservationTest.class
  	,PatientBodyWeightTest.class
  	,LengthBasedPatientBodyWeightClassTest.class
  	,FaceAssessmentTest.class
  	,HeadAssessmentTest.class
  	,NeckAssessmentTest.class
  	,HeartAssessmentTest.class
  	,AbdomenAssessmentTest.class
  	,PelvicAndGenitourinaryAssessmentTest.class
  	,BackAndSpineAssessmentTest.class
  	,ExtremitiesAssessmentTest.class
  	,EyeAssessmentTest.class
  	,MentalStatusAssessmentTest.class
  	,CardiacArrestTimingTest.class
  	,CardiacArrestCauseTest.class
  	,ArrestRhythmTest.class
  	,ReturnOfSpontaneousCirculationTest.class
  	,DestinationRhythmTest.class
  	,AbandonedProcedureReasonObservationTest.class
  	,ProcedurePriorIndicatorTest.class
  	,ProcedureNumberOfAttemptsObservationTest.class
  	,ProcedureSuccessfulObservationTest.class
  	,ProcedureComplicationsObservationTest.class
  	,ProcedurePatientResponseObservationTest.class
  	,AirwayConfirmationObservationTest.class
  	,ReasonProcedureNotAttemptedObservationTest.class
  	,ComplaintTypeTest.class
  	,ComplaintDurationTest.class
  	,ComplaintOrganSystemTest.class
  	,NeurologicalAssessmentTest.class
  	,DiastolicBloodPressureTest.class
  	,HeartRateTest.class
  	,RespiratoryRateTest.class
  	,BodyTemperatureTest.class
  	,OxygenSaturationTest.class
  	,ProtocolAgeCategoryTest.class
  	,DispatchLocationNameTest.class
  	,DispatchLocationLatitudeTest.class
  	,DispatchLocationLongitudeTest.class
  	,DispatchDelayTest.class
  	,ResponseDelayTest.class
  	,SceneDelayTest.class
  	,TransportDelayTest.class
  	,TurnaroundDelayTest.class
  	,GlasgowTotalTest.class
  	,GlasgowQualifierTest.class
  	,GlasgowEyeTest.class
  	,GlasgowMotorTest.class
  	,GlasgowVerbalTest.class
  	,StrokeScoreTest.class
  	,PainScoreTest.class
  	,LevelOfResponsivenessTest.class
  	,BloodGlucoseTest.class
  	,CarbonMonoxideTest.class
  	,CarbonDioxideTest.class
  	,CardiacRhythmTest.class
  	,GlasgowComaScoreOrganizerTest.class
  	,ResponseBeginningOdometerReadingTest.class
  	,ResponseOnSceneOdometerReadingTest.class
  	,ResponseDestinationOdometerReadingTest.class
  	,CardiacArrestOutcomeTest.class
  	,TransportModeQualifierTest.class
  	,SkinAssessmentTest.class
  	,AdditionalVitalSignsOrganizerTest.class
  	,LungAssessmentTest.class
  	,ChestAssessmentTest.class
})
public class EmspcrTests {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter( EmspcrTests.class);
	}


} //EmspcrTests