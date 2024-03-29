/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.ClinicalStatement;
import org.eclipse.mdht.uml.cda.Observation;
import org.eclipse.mdht.uml.cda.Organizer;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.SubstanceAdministration;

import org.eclipse.mdht.uml.hl7.rim.Act;
import org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot;

import org.openhealthtools.mdht.uml.cda.emspcr.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage
 * @generated
 */
public class EmspcrAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmspcrPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmspcrAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EmspcrPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmspcrSwitch<Adapter> modelSwitch = new EmspcrSwitch<Adapter>() {
			@Override
			public Adapter casePatientCareReport(PatientCareReport object) {
				return createPatientCareReportAdapter();
			}
			@Override
			public Adapter caseEMSCurrentMedicationSection(EMSCurrentMedicationSection object) {
				return createEMSCurrentMedicationSectionAdapter();
			}
			@Override
			public Adapter caseCurrentlyOnMedication(CurrentlyOnMedication object) {
				return createCurrentlyOnMedicationAdapter();
			}
			@Override
			public Adapter caseCurrentMedication(CurrentMedication object) {
				return createCurrentMedicationAdapter();
			}
			@Override
			public Adapter caseEMSCardiacArrestEventSection(EMSCardiacArrestEventSection object) {
				return createEMSCardiacArrestEventSectionAdapter();
			}
			@Override
			public Adapter caseCardiacArrest(CardiacArrest object) {
				return createCardiacArrestAdapter();
			}
			@Override
			public Adapter caseEMSAdvanceDirectivesSection(EMSAdvanceDirectivesSection object) {
				return createEMSAdvanceDirectivesSectionAdapter();
			}
			@Override
			public Adapter caseAdvanceDirectiveObservation(AdvanceDirectiveObservation object) {
				return createAdvanceDirectiveObservationAdapter();
			}
			@Override
			public Adapter caseEMSAllergiesAndAdverseReactionsSection(EMSAllergiesAndAdverseReactionsSection object) {
				return createEMSAllergiesAndAdverseReactionsSectionAdapter();
			}
			@Override
			public Adapter caseNonDrugAllergyOrganizer(NonDrugAllergyOrganizer object) {
				return createNonDrugAllergyOrganizerAdapter();
			}
			@Override
			public Adapter caseExistenceOfKnownNonDrugAllergy(ExistenceOfKnownNonDrugAllergy object) {
				return createExistenceOfKnownNonDrugAllergyAdapter();
			}
			@Override
			public Adapter caseNonDrugAllergy(NonDrugAllergy object) {
				return createNonDrugAllergyAdapter();
			}
			@Override
			public Adapter caseDrugAllergyOrganizer(DrugAllergyOrganizer object) {
				return createDrugAllergyOrganizerAdapter();
			}
			@Override
			public Adapter caseEMSPastMedicalHistorySection(EMSPastMedicalHistorySection object) {
				return createEMSPastMedicalHistorySectionAdapter();
			}
			@Override
			public Adapter caseExistenceOfHistoryOfConditionOrSurgery(ExistenceOfHistoryOfConditionOrSurgery object) {
				return createExistenceOfHistoryOfConditionOrSurgeryAdapter();
			}
			@Override
			public Adapter caseMedicalSurgicalHistory(MedicalSurgicalHistory object) {
				return createMedicalSurgicalHistoryAdapter();
			}
			@Override
			public Adapter caseEMSSocialHistorySection(EMSSocialHistorySection object) {
				return createEMSSocialHistorySectionAdapter();
			}
			@Override
			public Adapter caseExistenceOfDrugUseIndication(ExistenceOfDrugUseIndication object) {
				return createExistenceOfDrugUseIndicationAdapter();
			}
			@Override
			public Adapter caseDrugUseIndication(DrugUseIndication object) {
				return createDrugUseIndicationAdapter();
			}
			@Override
			public Adapter caseEMSPhysicalAssessmentSection(EMSPhysicalAssessmentSection object) {
				return createEMSPhysicalAssessmentSectionAdapter();
			}
			@Override
			public Adapter casePhysicalAssessmentOrganizer(PhysicalAssessmentOrganizer object) {
				return createPhysicalAssessmentOrganizerAdapter();
			}
			@Override
			public Adapter casePatientPregnancy(PatientPregnancy object) {
				return createPatientPregnancyAdapter();
			}
			@Override
			public Adapter caseLastOralIntake(LastOralIntake object) {
				return createLastOralIntakeAdapter();
			}
			@Override
			public Adapter casePatientAge(PatientAge object) {
				return createPatientAgeAdapter();
			}
			@Override
			public Adapter caseThrombolyticContraindications(ThrombolyticContraindications object) {
				return createThrombolyticContraindicationsAdapter();
			}
			@Override
			public Adapter caseBarriersToPatientCare(BarriersToPatientCare object) {
				return createBarriersToPatientCareAdapter();
			}
			@Override
			public Adapter caseEMSMedicationsAdministeredSection(EMSMedicationsAdministeredSection object) {
				return createEMSMedicationsAdministeredSectionAdapter();
			}
			@Override
			public Adapter caseMedicationAdministered(MedicationAdministered object) {
				return createMedicationAdministeredAdapter();
			}
			@Override
			public Adapter caseEMSProceduresPerformedSection(EMSProceduresPerformedSection object) {
				return createEMSProceduresPerformedSectionAdapter();
			}
			@Override
			public Adapter caseProcedure(Procedure object) {
				return createProcedureAdapter();
			}
			@Override
			public Adapter caseEMSPatientCareNarrativeSection(EMSPatientCareNarrativeSection object) {
				return createEMSPatientCareNarrativeSectionAdapter();
			}
			@Override
			public Adapter caseEMSSceneSection(EMSSceneSection object) {
				return createEMSSceneSectionAdapter();
			}
			@Override
			public Adapter caseFirstUnitIndicator(FirstUnitIndicator object) {
				return createFirstUnitIndicatorAdapter();
			}
			@Override
			public Adapter caseScenePatientCount(ScenePatientCount object) {
				return createScenePatientCountAdapter();
			}
			@Override
			public Adapter caseMassCasualtyIndicator(MassCasualtyIndicator object) {
				return createMassCasualtyIndicatorAdapter();
			}
			@Override
			public Adapter caseLocationTypeObservation(LocationTypeObservation object) {
				return createLocationTypeObservationAdapter();
			}
			@Override
			public Adapter caseEMSDispatchSection(EMSDispatchSection object) {
				return createEMSDispatchSectionAdapter();
			}
			@Override
			public Adapter caseEmergencyMedicalDispatchObservation(EmergencyMedicalDispatchObservation object) {
				return createEmergencyMedicalDispatchObservationAdapter();
			}
			@Override
			public Adapter caseDispatchReason(DispatchReason object) {
				return createDispatchReasonAdapter();
			}
			@Override
			public Adapter caseEMSDispositionSection(EMSDispositionSection object) {
				return createEMSDispositionSectionAdapter();
			}
			@Override
			public Adapter caseNumberOfPatientsTransportedObservation(NumberOfPatientsTransportedObservation object) {
				return createNumberOfPatientsTransportedObservationAdapter();
			}
			@Override
			public Adapter caseTransportModeObservation(TransportModeObservation object) {
				return createTransportModeObservationAdapter();
			}
			@Override
			public Adapter caseTransportMethodObservation(TransportMethodObservation object) {
				return createTransportMethodObservationAdapter();
			}
			@Override
			public Adapter caseReasonForChoosingDestinationObservation(ReasonForChoosingDestinationObservation object) {
				return createReasonForChoosingDestinationObservationAdapter();
			}
			@Override
			public Adapter casePrearrivalActivationObservation(PrearrivalActivationObservation object) {
				return createPrearrivalActivationObservationAdapter();
			}
			@Override
			public Adapter casePatientConditionAtDestinationObservation(PatientConditionAtDestinationObservation object) {
				return createPatientConditionAtDestinationObservationAdapter();
			}
			@Override
			public Adapter caseDestinationHospitalCapability(DestinationHospitalCapability object) {
				return createDestinationHospitalCapabilityAdapter();
			}
			@Override
			public Adapter caseDestinationWard(DestinationWard object) {
				return createDestinationWardAdapter();
			}
			@Override
			public Adapter caseUnitDisposition(UnitDisposition object) {
				return createUnitDispositionAdapter();
			}
			@Override
			public Adapter casePatientEngagement(PatientEngagement object) {
				return createPatientEngagementAdapter();
			}
			@Override
			public Adapter caseCrewDisposition(CrewDisposition object) {
				return createCrewDispositionAdapter();
			}
			@Override
			public Adapter caseTransportDisposition(TransportDisposition object) {
				return createTransportDispositionAdapter();
			}
			@Override
			public Adapter caseEMSPersonnelAdverseEventSection(EMSPersonnelAdverseEventSection object) {
				return createEMSPersonnelAdverseEventSectionAdapter();
			}
			@Override
			public Adapter caseAdverseEventIndicator(AdverseEventIndicator object) {
				return createAdverseEventIndicatorAdapter();
			}
			@Override
			public Adapter caseAdverseEventTypeObservation(AdverseEventTypeObservation object) {
				return createAdverseEventTypeObservationAdapter();
			}
			@Override
			public Adapter caseEMSProtocolSection(EMSProtocolSection object) {
				return createEMSProtocolSectionAdapter();
			}
			@Override
			public Adapter caseProtocolObservation(ProtocolObservation object) {
				return createProtocolObservationAdapter();
			}
			@Override
			public Adapter caseCandidatePatientRegistryType(CandidatePatientRegistryType object) {
				return createCandidatePatientRegistryTypeAdapter();
			}
			@Override
			public Adapter caseEMSResponseSection(EMSResponseSection object) {
				return createEMSResponseSectionAdapter();
			}
			@Override
			public Adapter caseDelayOrganizer(DelayOrganizer object) {
				return createDelayOrganizerAdapter();
			}
			@Override
			public Adapter caseDispatchLocationOrganizer(DispatchLocationOrganizer object) {
				return createDispatchLocationOrganizerAdapter();
			}
			@Override
			public Adapter caseResponseOdometerReadingOrganizer(ResponseOdometerReadingOrganizer object) {
				return createResponseOdometerReadingOrganizerAdapter();
			}
			@Override
			public Adapter caseResponseModeToScene(ResponseModeToScene object) {
				return createResponseModeToSceneAdapter();
			}
			@Override
			public Adapter caseResponseModeQualifier(ResponseModeQualifier object) {
				return createResponseModeQualifierAdapter();
			}
			@Override
			public Adapter caseEMSSituationSection(EMSSituationSection object) {
				return createEMSSituationSectionAdapter();
			}
			@Override
			public Adapter caseComplaint(Complaint object) {
				return createComplaintAdapter();
			}
			@Override
			public Adapter casePossibleInjury(PossibleInjury object) {
				return createPossibleInjuryAdapter();
			}
			@Override
			public Adapter caseProviderPrimaryImpression(ProviderPrimaryImpression object) {
				return createProviderPrimaryImpressionAdapter();
			}
			@Override
			public Adapter casePrimarySymptom(PrimarySymptom object) {
				return createPrimarySymptomAdapter();
			}
			@Override
			public Adapter caseOtherSymptoms(OtherSymptoms object) {
				return createOtherSymptomsAdapter();
			}
			@Override
			public Adapter caseProviderSecondaryImpressions(ProviderSecondaryImpressions object) {
				return createProviderSecondaryImpressionsAdapter();
			}
			@Override
			public Adapter caseInitialPatientAcuity(InitialPatientAcuity object) {
				return createInitialPatientAcuityAdapter();
			}
			@Override
			public Adapter caseEMSTimesSection(EMSTimesSection object) {
				return createEMSTimesSectionAdapter();
			}
			@Override
			public Adapter caseCallTime(CallTime object) {
				return createCallTimeAdapter();
			}
			@Override
			public Adapter caseUnitNotifiedTime(UnitNotifiedTime object) {
				return createUnitNotifiedTimeAdapter();
			}
			@Override
			public Adapter caseUnitEnRouteTime(UnitEnRouteTime object) {
				return createUnitEnRouteTimeAdapter();
			}
			@Override
			public Adapter caseUnitOnSceneTime(UnitOnSceneTime object) {
				return createUnitOnSceneTimeAdapter();
			}
			@Override
			public Adapter caseUnitAtPatientTime(UnitAtPatientTime object) {
				return createUnitAtPatientTimeAdapter();
			}
			@Override
			public Adapter caseUnitLeftSceneTime(UnitLeftSceneTime object) {
				return createUnitLeftSceneTimeAdapter();
			}
			@Override
			public Adapter casePatientArrivedAtDestinationTime(PatientArrivedAtDestinationTime object) {
				return createPatientArrivedAtDestinationTimeAdapter();
			}
			@Override
			public Adapter caseUnitBackInServiceTime(UnitBackInServiceTime object) {
				return createUnitBackInServiceTimeAdapter();
			}
			@Override
			public Adapter caseDispatchNotifiedTime(DispatchNotifiedTime object) {
				return createDispatchNotifiedTimeAdapter();
			}
			@Override
			public Adapter caseEMSVitalSignsSection(EMSVitalSignsSection object) {
				return createEMSVitalSignsSectionAdapter();
			}
			@Override
			public Adapter caseVitalSignsOrganizer(VitalSignsOrganizer object) {
				return createVitalSignsOrganizerAdapter();
			}
			@Override
			public Adapter caseEMSInjuryIncidentDescriptionSection(EMSInjuryIncidentDescriptionSection object) {
				return createEMSInjuryIncidentDescriptionSectionAdapter();
			}
			@Override
			public Adapter caseInjuryCauseCategory(InjuryCauseCategory object) {
				return createInjuryCauseCategoryAdapter();
			}
			@Override
			public Adapter caseInjuryMechanism(InjuryMechanism object) {
				return createInjuryMechanismAdapter();
			}
			@Override
			public Adapter caseTraumaTriageCriteriaSteps1and2(TraumaTriageCriteriaSteps1and2 object) {
				return createTraumaTriageCriteriaSteps1and2Adapter();
			}
			@Override
			public Adapter caseTraumaTriageCriteriaSteps3and4(TraumaTriageCriteriaSteps3and4 object) {
				return createTraumaTriageCriteriaSteps3and4Adapter();
			}
			@Override
			public Adapter caseVehicleImpactArea(VehicleImpactArea object) {
				return createVehicleImpactAreaAdapter();
			}
			@Override
			public Adapter casePatientLocationInVehicle(PatientLocationInVehicle object) {
				return createPatientLocationInVehicleAdapter();
			}
			@Override
			public Adapter caseVehicleOccupantSafetyEquipment(VehicleOccupantSafetyEquipment object) {
				return createVehicleOccupantSafetyEquipmentAdapter();
			}
			@Override
			public Adapter caseAirbagDeploymentStatus(AirbagDeploymentStatus object) {
				return createAirbagDeploymentStatusAdapter();
			}
			@Override
			public Adapter caseHeightOfFall(HeightOfFall object) {
				return createHeightOfFallAdapter();
			}
			@Override
			public Adapter caseDisasterType(DisasterType object) {
				return createDisasterTypeAdapter();
			}
			@Override
			public Adapter caseEMSBillingSection(EMSBillingSection object) {
				return createEMSBillingSectionAdapter();
			}
			@Override
			public Adapter caseBillingCondition(BillingCondition object) {
				return createBillingConditionAdapter();
			}
			@Override
			public Adapter caseLevelOfServiceObservation(LevelOfServiceObservation object) {
				return createLevelOfServiceObservationAdapter();
			}
			@Override
			public Adapter caseResponseEndingOdometerReading(ResponseEndingOdometerReading object) {
				return createResponseEndingOdometerReadingAdapter();
			}
			@Override
			public Adapter caseSystolicBloodPressure(SystolicBloodPressure object) {
				return createSystolicBloodPressureAdapter();
			}
			@Override
			public Adapter casePriorAidVitals(PriorAidVitals object) {
				return createPriorAidVitalsAdapter();
			}
			@Override
			public Adapter caseDrugAllergy(DrugAllergy object) {
				return createDrugAllergyAdapter();
			}
			@Override
			public Adapter caseExistenceOfKnownDrugAllergyObservation(ExistenceOfKnownDrugAllergyObservation object) {
				return createExistenceOfKnownDrugAllergyObservationAdapter();
			}
			@Override
			public Adapter caseMedicationNotAdministeredReasonObservation(MedicationNotAdministeredReasonObservation object) {
				return createMedicationNotAdministeredReasonObservationAdapter();
			}
			@Override
			public Adapter caseMedicationResponseObservation(MedicationResponseObservation object) {
				return createMedicationResponseObservationAdapter();
			}
			@Override
			public Adapter caseMedicationComplicationObservation(MedicationComplicationObservation object) {
				return createMedicationComplicationObservationAdapter();
			}
			@Override
			public Adapter caseMedicationPriorAdministrationObservation(MedicationPriorAdministrationObservation object) {
				return createMedicationPriorAdministrationObservationAdapter();
			}
			@Override
			public Adapter casePatientBodyWeight(PatientBodyWeight object) {
				return createPatientBodyWeightAdapter();
			}
			@Override
			public Adapter caseLengthBasedPatientBodyWeightClass(LengthBasedPatientBodyWeightClass object) {
				return createLengthBasedPatientBodyWeightClassAdapter();
			}
			@Override
			public Adapter caseFaceAssessment(FaceAssessment object) {
				return createFaceAssessmentAdapter();
			}
			@Override
			public Adapter caseHeadAssessment(HeadAssessment object) {
				return createHeadAssessmentAdapter();
			}
			@Override
			public Adapter caseNeckAssessment(NeckAssessment object) {
				return createNeckAssessmentAdapter();
			}
			@Override
			public Adapter caseHeartAssessment(HeartAssessment object) {
				return createHeartAssessmentAdapter();
			}
			@Override
			public Adapter caseAbdomenAssessment(AbdomenAssessment object) {
				return createAbdomenAssessmentAdapter();
			}
			@Override
			public Adapter casePelvicAndGenitourinaryAssessment(PelvicAndGenitourinaryAssessment object) {
				return createPelvicAndGenitourinaryAssessmentAdapter();
			}
			@Override
			public Adapter caseBackAndSpineAssessment(BackAndSpineAssessment object) {
				return createBackAndSpineAssessmentAdapter();
			}
			@Override
			public Adapter caseExtremitiesAssessment(ExtremitiesAssessment object) {
				return createExtremitiesAssessmentAdapter();
			}
			@Override
			public Adapter caseEyeAssessment(EyeAssessment object) {
				return createEyeAssessmentAdapter();
			}
			@Override
			public Adapter caseMentalStatusAssessment(MentalStatusAssessment object) {
				return createMentalStatusAssessmentAdapter();
			}
			@Override
			public Adapter caseCardiacArrestTiming(CardiacArrestTiming object) {
				return createCardiacArrestTimingAdapter();
			}
			@Override
			public Adapter caseCardiacArrestCause(CardiacArrestCause object) {
				return createCardiacArrestCauseAdapter();
			}
			@Override
			public Adapter caseArrestRhythm(ArrestRhythm object) {
				return createArrestRhythmAdapter();
			}
			@Override
			public Adapter caseReturnOfSpontaneousCirculation(ReturnOfSpontaneousCirculation object) {
				return createReturnOfSpontaneousCirculationAdapter();
			}
			@Override
			public Adapter caseDestinationRhythm(DestinationRhythm object) {
				return createDestinationRhythmAdapter();
			}
			@Override
			public Adapter caseAbandonedProcedureReasonObservation(AbandonedProcedureReasonObservation object) {
				return createAbandonedProcedureReasonObservationAdapter();
			}
			@Override
			public Adapter caseProcedurePriorIndicator(ProcedurePriorIndicator object) {
				return createProcedurePriorIndicatorAdapter();
			}
			@Override
			public Adapter caseProcedureNumberOfAttemptsObservation(ProcedureNumberOfAttemptsObservation object) {
				return createProcedureNumberOfAttemptsObservationAdapter();
			}
			@Override
			public Adapter caseProcedureSuccessfulObservation(ProcedureSuccessfulObservation object) {
				return createProcedureSuccessfulObservationAdapter();
			}
			@Override
			public Adapter caseProcedureComplicationsObservation(ProcedureComplicationsObservation object) {
				return createProcedureComplicationsObservationAdapter();
			}
			@Override
			public Adapter caseProcedurePatientResponseObservation(ProcedurePatientResponseObservation object) {
				return createProcedurePatientResponseObservationAdapter();
			}
			@Override
			public Adapter caseAirwayConfirmationObservation(AirwayConfirmationObservation object) {
				return createAirwayConfirmationObservationAdapter();
			}
			@Override
			public Adapter caseReasonProcedureNotAttemptedObservation(ReasonProcedureNotAttemptedObservation object) {
				return createReasonProcedureNotAttemptedObservationAdapter();
			}
			@Override
			public Adapter caseComplaintType(ComplaintType object) {
				return createComplaintTypeAdapter();
			}
			@Override
			public Adapter caseComplaintDuration(ComplaintDuration object) {
				return createComplaintDurationAdapter();
			}
			@Override
			public Adapter caseComplaintOrganSystem(ComplaintOrganSystem object) {
				return createComplaintOrganSystemAdapter();
			}
			@Override
			public Adapter caseNeurologicalAssessment(NeurologicalAssessment object) {
				return createNeurologicalAssessmentAdapter();
			}
			@Override
			public Adapter caseDiastolicBloodPressure(DiastolicBloodPressure object) {
				return createDiastolicBloodPressureAdapter();
			}
			@Override
			public Adapter caseHeartRate(HeartRate object) {
				return createHeartRateAdapter();
			}
			@Override
			public Adapter caseRespiratoryRate(RespiratoryRate object) {
				return createRespiratoryRateAdapter();
			}
			@Override
			public Adapter caseBodyTemperature(BodyTemperature object) {
				return createBodyTemperatureAdapter();
			}
			@Override
			public Adapter caseOxygenSaturation(OxygenSaturation object) {
				return createOxygenSaturationAdapter();
			}
			@Override
			public Adapter caseProtocolAgeCategory(ProtocolAgeCategory object) {
				return createProtocolAgeCategoryAdapter();
			}
			@Override
			public Adapter caseDispatchLocationName(DispatchLocationName object) {
				return createDispatchLocationNameAdapter();
			}
			@Override
			public Adapter caseDispatchLocationLatitude(DispatchLocationLatitude object) {
				return createDispatchLocationLatitudeAdapter();
			}
			@Override
			public Adapter caseDispatchLocationLongitude(DispatchLocationLongitude object) {
				return createDispatchLocationLongitudeAdapter();
			}
			@Override
			public Adapter caseDispatchDelay(DispatchDelay object) {
				return createDispatchDelayAdapter();
			}
			@Override
			public Adapter caseResponseDelay(ResponseDelay object) {
				return createResponseDelayAdapter();
			}
			@Override
			public Adapter caseSceneDelay(SceneDelay object) {
				return createSceneDelayAdapter();
			}
			@Override
			public Adapter caseTransportDelay(TransportDelay object) {
				return createTransportDelayAdapter();
			}
			@Override
			public Adapter caseTurnaroundDelay(TurnaroundDelay object) {
				return createTurnaroundDelayAdapter();
			}
			@Override
			public Adapter caseGlasgowTotal(GlasgowTotal object) {
				return createGlasgowTotalAdapter();
			}
			@Override
			public Adapter caseGlasgowQualifier(GlasgowQualifier object) {
				return createGlasgowQualifierAdapter();
			}
			@Override
			public Adapter caseGlasgowEye(GlasgowEye object) {
				return createGlasgowEyeAdapter();
			}
			@Override
			public Adapter caseGlasgowMotor(GlasgowMotor object) {
				return createGlasgowMotorAdapter();
			}
			@Override
			public Adapter caseGlasgowVerbal(GlasgowVerbal object) {
				return createGlasgowVerbalAdapter();
			}
			@Override
			public Adapter caseStrokeScore(StrokeScore object) {
				return createStrokeScoreAdapter();
			}
			@Override
			public Adapter casePainScore(PainScore object) {
				return createPainScoreAdapter();
			}
			@Override
			public Adapter caseLevelOfResponsiveness(LevelOfResponsiveness object) {
				return createLevelOfResponsivenessAdapter();
			}
			@Override
			public Adapter caseBloodGlucose(BloodGlucose object) {
				return createBloodGlucoseAdapter();
			}
			@Override
			public Adapter caseCarbonMonoxide(CarbonMonoxide object) {
				return createCarbonMonoxideAdapter();
			}
			@Override
			public Adapter caseCarbonDioxide(CarbonDioxide object) {
				return createCarbonDioxideAdapter();
			}
			@Override
			public Adapter caseCardiacRhythm(CardiacRhythm object) {
				return createCardiacRhythmAdapter();
			}
			@Override
			public Adapter caseGlasgowComaScoreOrganizer(GlasgowComaScoreOrganizer object) {
				return createGlasgowComaScoreOrganizerAdapter();
			}
			@Override
			public Adapter caseResponseBeginningOdometerReading(ResponseBeginningOdometerReading object) {
				return createResponseBeginningOdometerReadingAdapter();
			}
			@Override
			public Adapter caseResponseOnSceneOdometerReading(ResponseOnSceneOdometerReading object) {
				return createResponseOnSceneOdometerReadingAdapter();
			}
			@Override
			public Adapter caseResponseDestinationOdometerReading(ResponseDestinationOdometerReading object) {
				return createResponseDestinationOdometerReadingAdapter();
			}
			@Override
			public Adapter caseCardiacArrestOutcome(CardiacArrestOutcome object) {
				return createCardiacArrestOutcomeAdapter();
			}
			@Override
			public Adapter caseTransportModeQualifier(TransportModeQualifier object) {
				return createTransportModeQualifierAdapter();
			}
			@Override
			public Adapter caseSkinAssessment(SkinAssessment object) {
				return createSkinAssessmentAdapter();
			}
			@Override
			public Adapter caseAdditionalVitalSignsOrganizer(AdditionalVitalSignsOrganizer object) {
				return createAdditionalVitalSignsOrganizerAdapter();
			}
			@Override
			public Adapter caseLungAssessment(LungAssessment object) {
				return createLungAssessmentAdapter();
			}
			@Override
			public Adapter caseChestAssessment(ChestAssessment object) {
				return createChestAssessmentAdapter();
			}
			@Override
			public Adapter caseInfrastructureRoot(InfrastructureRoot object) {
				return createInfrastructureRootAdapter();
			}
			@Override
			public Adapter caseAct(Act object) {
				return createActAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseClinicalStatement(ClinicalStatement object) {
				return createClinicalStatementAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseSubstanceAdministration(SubstanceAdministration object) {
				return createSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseOrganizer(Organizer object) {
				return createOrganizerAdapter();
			}
			@Override
			public Adapter caseCDA_Procedure(org.eclipse.mdht.uml.cda.Procedure object) {
				return createCDA_ProcedureAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport <em>Patient Care Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport
	 * @generated
	 */
	public Adapter createPatientCareReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection <em>EMS Current Medication Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection
	 * @generated
	 */
	public Adapter createEMSCurrentMedicationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication <em>Currently On Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication
	 * @generated
	 */
	public Adapter createCurrentlyOnMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication <em>Current Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication
	 * @generated
	 */
	public Adapter createCurrentMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection <em>EMS Cardiac Arrest Event Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection
	 * @generated
	 */
	public Adapter createEMSCardiacArrestEventSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest <em>Cardiac Arrest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest
	 * @generated
	 */
	public Adapter createCardiacArrestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection <em>EMS Advance Directives Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection
	 * @generated
	 */
	public Adapter createEMSAdvanceDirectivesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AdvanceDirectiveObservation <em>Advance Directive Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AdvanceDirectiveObservation
	 * @generated
	 */
	public Adapter createAdvanceDirectiveObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection <em>EMS Allergies And Adverse Reactions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection
	 * @generated
	 */
	public Adapter createEMSAllergiesAndAdverseReactionsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizer <em>Non Drug Allergy Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizer
	 * @generated
	 */
	public Adapter createNonDrugAllergyOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergy <em>Existence Of Known Non Drug Allergy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergy
	 * @generated
	 */
	public Adapter createExistenceOfKnownNonDrugAllergyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergy <em>Non Drug Allergy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergy
	 * @generated
	 */
	public Adapter createNonDrugAllergyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyOrganizer <em>Drug Allergy Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyOrganizer
	 * @generated
	 */
	public Adapter createDrugAllergyOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection <em>EMS Past Medical History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection
	 * @generated
	 */
	public Adapter createEMSPastMedicalHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfConditionOrSurgery <em>Existence Of History Of Condition Or Surgery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfConditionOrSurgery
	 * @generated
	 */
	public Adapter createExistenceOfHistoryOfConditionOrSurgeryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory <em>Medical Surgical History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory
	 * @generated
	 */
	public Adapter createMedicalSurgicalHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection <em>EMS Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection
	 * @generated
	 */
	public Adapter createEMSSocialHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication <em>Existence Of Drug Use Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication
	 * @generated
	 */
	public Adapter createExistenceOfDrugUseIndicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication <em>Drug Use Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication
	 * @generated
	 */
	public Adapter createDrugUseIndicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection <em>EMS Physical Assessment Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection
	 * @generated
	 */
	public Adapter createEMSPhysicalAssessmentSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer <em>Physical Assessment Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer
	 * @generated
	 */
	public Adapter createPhysicalAssessmentOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientPregnancy <em>Patient Pregnancy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientPregnancy
	 * @generated
	 */
	public Adapter createPatientPregnancyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake <em>Last Oral Intake</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake
	 * @generated
	 */
	public Adapter createLastOralIntakeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientAge <em>Patient Age</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientAge
	 * @generated
	 */
	public Adapter createPatientAgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications <em>Thrombolytic Contraindications</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications
	 * @generated
	 */
	public Adapter createThrombolyticContraindicationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare <em>Barriers To Patient Care</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare
	 * @generated
	 */
	public Adapter createBarriersToPatientCareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection <em>EMS Medications Administered Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection
	 * @generated
	 */
	public Adapter createEMSMedicationsAdministeredSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered <em>Medication Administered</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered
	 * @generated
	 */
	public Adapter createMedicationAdministeredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection <em>EMS Procedures Performed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection
	 * @generated
	 */
	public Adapter createEMSProceduresPerformedSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.Procedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection <em>EMS Patient Care Narrative Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection
	 * @generated
	 */
	public Adapter createEMSPatientCareNarrativeSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection <em>EMS Scene Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection
	 * @generated
	 */
	public Adapter createEMSSceneSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator <em>First Unit Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator
	 * @generated
	 */
	public Adapter createFirstUnitIndicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount <em>Scene Patient Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount
	 * @generated
	 */
	public Adapter createScenePatientCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator <em>Mass Casualty Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator
	 * @generated
	 */
	public Adapter createMassCasualtyIndicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.LocationTypeObservation <em>Location Type Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.LocationTypeObservation
	 * @generated
	 */
	public Adapter createLocationTypeObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection <em>EMS Dispatch Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection
	 * @generated
	 */
	public Adapter createEMSDispatchSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation <em>Emergency Medical Dispatch Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation
	 * @generated
	 */
	public Adapter createEmergencyMedicalDispatchObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason <em>Dispatch Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason
	 * @generated
	 */
	public Adapter createDispatchReasonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection <em>EMS Disposition Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection
	 * @generated
	 */
	public Adapter createEMSDispositionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation <em>Number Of Patients Transported Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation
	 * @generated
	 */
	public Adapter createNumberOfPatientsTransportedObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportModeObservation <em>Transport Mode Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.TransportModeObservation
	 * @generated
	 */
	public Adapter createTransportModeObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation <em>Transport Method Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation
	 * @generated
	 */
	public Adapter createTransportMethodObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation <em>Reason For Choosing Destination Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation
	 * @generated
	 */
	public Adapter createReasonForChoosingDestinationObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation <em>Prearrival Activation Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation
	 * @generated
	 */
	public Adapter createPrearrivalActivationObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation <em>Patient Condition At Destination Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation
	 * @generated
	 */
	public Adapter createPatientConditionAtDestinationObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationHospitalCapability <em>Destination Hospital Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DestinationHospitalCapability
	 * @generated
	 */
	public Adapter createDestinationHospitalCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard <em>Destination Ward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard
	 * @generated
	 */
	public Adapter createDestinationWardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitDisposition <em>Unit Disposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.UnitDisposition
	 * @generated
	 */
	public Adapter createUnitDispositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientEngagement <em>Patient Engagement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientEngagement
	 * @generated
	 */
	public Adapter createPatientEngagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CrewDisposition <em>Crew Disposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CrewDisposition
	 * @generated
	 */
	public Adapter createCrewDispositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportDisposition <em>Transport Disposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.TransportDisposition
	 * @generated
	 */
	public Adapter createTransportDispositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection <em>EMS Personnel Adverse Event Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection
	 * @generated
	 */
	public Adapter createEMSPersonnelAdverseEventSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator <em>Adverse Event Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator
	 * @generated
	 */
	public Adapter createAdverseEventIndicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation <em>Adverse Event Type Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation
	 * @generated
	 */
	public Adapter createAdverseEventTypeObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection <em>EMS Protocol Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection
	 * @generated
	 */
	public Adapter createEMSProtocolSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation <em>Protocol Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation
	 * @generated
	 */
	public Adapter createProtocolObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType <em>Candidate Patient Registry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType
	 * @generated
	 */
	public Adapter createCandidatePatientRegistryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection <em>EMS Response Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection
	 * @generated
	 */
	public Adapter createEMSResponseSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer <em>Delay Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer
	 * @generated
	 */
	public Adapter createDelayOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer <em>Dispatch Location Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer
	 * @generated
	 */
	public Adapter createDispatchLocationOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer <em>Response Odometer Reading Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer
	 * @generated
	 */
	public Adapter createResponseOdometerReadingOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene <em>Response Mode To Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene
	 * @generated
	 */
	public Adapter createResponseModeToSceneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeQualifier <em>Response Mode Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeQualifier
	 * @generated
	 */
	public Adapter createResponseModeQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection <em>EMS Situation Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection
	 * @generated
	 */
	public Adapter createEMSSituationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint <em>Complaint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.Complaint
	 * @generated
	 */
	public Adapter createComplaintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury <em>Possible Injury</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury
	 * @generated
	 */
	public Adapter createPossibleInjuryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression <em>Provider Primary Impression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression
	 * @generated
	 */
	public Adapter createProviderPrimaryImpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom <em>Primary Symptom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom
	 * @generated
	 */
	public Adapter createPrimarySymptomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms <em>Other Symptoms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms
	 * @generated
	 */
	public Adapter createOtherSymptomsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions <em>Provider Secondary Impressions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions
	 * @generated
	 */
	public Adapter createProviderSecondaryImpressionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity <em>Initial Patient Acuity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity
	 * @generated
	 */
	public Adapter createInitialPatientAcuityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection <em>EMS Times Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection
	 * @generated
	 */
	public Adapter createEMSTimesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CallTime <em>Call Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CallTime
	 * @generated
	 */
	public Adapter createCallTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitNotifiedTime <em>Unit Notified Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.UnitNotifiedTime
	 * @generated
	 */
	public Adapter createUnitNotifiedTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitEnRouteTime <em>Unit En Route Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.UnitEnRouteTime
	 * @generated
	 */
	public Adapter createUnitEnRouteTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime <em>Unit On Scene Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime
	 * @generated
	 */
	public Adapter createUnitOnSceneTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime <em>Unit At Patient Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime
	 * @generated
	 */
	public Adapter createUnitAtPatientTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime <em>Unit Left Scene Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime
	 * @generated
	 */
	public Adapter createUnitLeftSceneTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime <em>Patient Arrived At Destination Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime
	 * @generated
	 */
	public Adapter createPatientArrivedAtDestinationTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime <em>Unit Back In Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime
	 * @generated
	 */
	public Adapter createUnitBackInServiceTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchNotifiedTime <em>Dispatch Notified Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DispatchNotifiedTime
	 * @generated
	 */
	public Adapter createDispatchNotifiedTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection <em>EMS Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection
	 * @generated
	 */
	public Adapter createEMSVitalSignsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer <em>Vital Signs Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer
	 * @generated
	 */
	public Adapter createVitalSignsOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection <em>EMS Injury Incident Description Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection
	 * @generated
	 */
	public Adapter createEMSInjuryIncidentDescriptionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory <em>Injury Cause Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory
	 * @generated
	 */
	public Adapter createInjuryCauseCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism <em>Injury Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism
	 * @generated
	 */
	public Adapter createInjuryMechanismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2 <em>Trauma Triage Criteria Steps1and2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2
	 * @generated
	 */
	public Adapter createTraumaTriageCriteriaSteps1and2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4 <em>Trauma Triage Criteria Steps3and4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4
	 * @generated
	 */
	public Adapter createTraumaTriageCriteriaSteps3and4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea <em>Vehicle Impact Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea
	 * @generated
	 */
	public Adapter createVehicleImpactAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle <em>Patient Location In Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle
	 * @generated
	 */
	public Adapter createPatientLocationInVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment <em>Vehicle Occupant Safety Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment
	 * @generated
	 */
	public Adapter createVehicleOccupantSafetyEquipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus <em>Airbag Deployment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus
	 * @generated
	 */
	public Adapter createAirbagDeploymentStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall <em>Height Of Fall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall
	 * @generated
	 */
	public Adapter createHeightOfFallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DisasterType <em>Disaster Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DisasterType
	 * @generated
	 */
	public Adapter createDisasterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection <em>EMS Billing Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection
	 * @generated
	 */
	public Adapter createEMSBillingSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition <em>Billing Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition
	 * @generated
	 */
	public Adapter createBillingConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation <em>Level Of Service Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation
	 * @generated
	 */
	public Adapter createLevelOfServiceObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReading <em>Response Ending Odometer Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReading
	 * @generated
	 */
	public Adapter createResponseEndingOdometerReadingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure <em>Systolic Blood Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure
	 * @generated
	 */
	public Adapter createSystolicBloodPressureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals <em>Prior Aid Vitals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals
	 * @generated
	 */
	public Adapter createPriorAidVitalsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergy <em>Drug Allergy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergy
	 * @generated
	 */
	public Adapter createDrugAllergyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservation <em>Existence Of Known Drug Allergy Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservation
	 * @generated
	 */
	public Adapter createExistenceOfKnownDrugAllergyObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationNotAdministeredReasonObservation <em>Medication Not Administered Reason Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.MedicationNotAdministeredReasonObservation
	 * @generated
	 */
	public Adapter createMedicationNotAdministeredReasonObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationResponseObservation <em>Medication Response Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.MedicationResponseObservation
	 * @generated
	 */
	public Adapter createMedicationResponseObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation <em>Medication Complication Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation
	 * @generated
	 */
	public Adapter createMedicationComplicationObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationPriorAdministrationObservation <em>Medication Prior Administration Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.MedicationPriorAdministrationObservation
	 * @generated
	 */
	public Adapter createMedicationPriorAdministrationObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeight <em>Patient Body Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeight
	 * @generated
	 */
	public Adapter createPatientBodyWeightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass <em>Length Based Patient Body Weight Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass
	 * @generated
	 */
	public Adapter createLengthBasedPatientBodyWeightClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.FaceAssessment <em>Face Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.FaceAssessment
	 * @generated
	 */
	public Adapter createFaceAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.HeadAssessment <em>Head Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.HeadAssessment
	 * @generated
	 */
	public Adapter createHeadAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.NeckAssessment <em>Neck Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.NeckAssessment
	 * @generated
	 */
	public Adapter createNeckAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment <em>Heart Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment
	 * @generated
	 */
	public Adapter createHeartAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment <em>Abdomen Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment
	 * @generated
	 */
	public Adapter createAbdomenAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment <em>Pelvic And Genitourinary Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment
	 * @generated
	 */
	public Adapter createPelvicAndGenitourinaryAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment <em>Back And Spine Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment
	 * @generated
	 */
	public Adapter createBackAndSpineAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment <em>Extremities Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment
	 * @generated
	 */
	public Adapter createExtremitiesAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EyeAssessment <em>Eye Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EyeAssessment
	 * @generated
	 */
	public Adapter createEyeAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessment <em>Mental Status Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessment
	 * @generated
	 */
	public Adapter createMentalStatusAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestTiming <em>Cardiac Arrest Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestTiming
	 * @generated
	 */
	public Adapter createCardiacArrestTimingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestCause <em>Cardiac Arrest Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestCause
	 * @generated
	 */
	public Adapter createCardiacArrestCauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ArrestRhythm <em>Arrest Rhythm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ArrestRhythm
	 * @generated
	 */
	public Adapter createArrestRhythmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ReturnOfSpontaneousCirculation <em>Return Of Spontaneous Circulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ReturnOfSpontaneousCirculation
	 * @generated
	 */
	public Adapter createReturnOfSpontaneousCirculationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationRhythm <em>Destination Rhythm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DestinationRhythm
	 * @generated
	 */
	public Adapter createDestinationRhythmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation <em>Abandoned Procedure Reason Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation
	 * @generated
	 */
	public Adapter createAbandonedProcedureReasonObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicator <em>Procedure Prior Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicator
	 * @generated
	 */
	public Adapter createProcedurePriorIndicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservation <em>Procedure Number Of Attempts Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservation
	 * @generated
	 */
	public Adapter createProcedureNumberOfAttemptsObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureSuccessfulObservation <em>Procedure Successful Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProcedureSuccessfulObservation
	 * @generated
	 */
	public Adapter createProcedureSuccessfulObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservation <em>Procedure Complications Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservation
	 * @generated
	 */
	public Adapter createProcedureComplicationsObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePatientResponseObservation <em>Procedure Patient Response Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePatientResponseObservation
	 * @generated
	 */
	public Adapter createProcedurePatientResponseObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation <em>Airway Confirmation Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation
	 * @generated
	 */
	public Adapter createAirwayConfirmationObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation <em>Reason Procedure Not Attempted Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation
	 * @generated
	 */
	public Adapter createReasonProcedureNotAttemptedObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType <em>Complaint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType
	 * @generated
	 */
	public Adapter createComplaintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDuration <em>Complaint Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDuration
	 * @generated
	 */
	public Adapter createComplaintDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem <em>Complaint Organ System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem
	 * @generated
	 */
	public Adapter createComplaintOrganSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment <em>Neurological Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment
	 * @generated
	 */
	public Adapter createNeurologicalAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure <em>Diastolic Blood Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure
	 * @generated
	 */
	public Adapter createDiastolicBloodPressureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartRate <em>Heart Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.HeartRate
	 * @generated
	 */
	public Adapter createHeartRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate <em>Respiratory Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate
	 * @generated
	 */
	public Adapter createRespiratoryRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.BodyTemperature <em>Body Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.BodyTemperature
	 * @generated
	 */
	public Adapter createBodyTemperatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturation <em>Oxygen Saturation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturation
	 * @generated
	 */
	public Adapter createOxygenSaturationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory <em>Protocol Age Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory
	 * @generated
	 */
	public Adapter createProtocolAgeCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationName <em>Dispatch Location Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationName
	 * @generated
	 */
	public Adapter createDispatchLocationNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLatitude <em>Dispatch Location Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLatitude
	 * @generated
	 */
	public Adapter createDispatchLocationLatitudeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLongitude <em>Dispatch Location Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLongitude
	 * @generated
	 */
	public Adapter createDispatchLocationLongitudeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay <em>Dispatch Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay
	 * @generated
	 */
	public Adapter createDispatchDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay <em>Response Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay
	 * @generated
	 */
	public Adapter createResponseDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneDelay <em>Scene Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.SceneDelay
	 * @generated
	 */
	public Adapter createSceneDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportDelay <em>Transport Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.TransportDelay
	 * @generated
	 */
	public Adapter createTransportDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay <em>Turnaround Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay
	 * @generated
	 */
	public Adapter createTurnaroundDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal <em>Glasgow Total</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal
	 * @generated
	 */
	public Adapter createGlasgowTotalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowQualifier <em>Glasgow Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.GlasgowQualifier
	 * @generated
	 */
	public Adapter createGlasgowQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye <em>Glasgow Eye</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye
	 * @generated
	 */
	public Adapter createGlasgowEyeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowMotor <em>Glasgow Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.GlasgowMotor
	 * @generated
	 */
	public Adapter createGlasgowMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal <em>Glasgow Verbal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal
	 * @generated
	 */
	public Adapter createGlasgowVerbalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.StrokeScore <em>Stroke Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.StrokeScore
	 * @generated
	 */
	public Adapter createStrokeScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PainScore <em>Pain Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PainScore
	 * @generated
	 */
	public Adapter createPainScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness <em>Level Of Responsiveness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness
	 * @generated
	 */
	public Adapter createLevelOfResponsivenessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose <em>Blood Glucose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose
	 * @generated
	 */
	public Adapter createBloodGlucoseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide <em>Carbon Monoxide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide
	 * @generated
	 */
	public Adapter createCarbonMonoxideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide <em>Carbon Dioxide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide
	 * @generated
	 */
	public Adapter createCarbonDioxideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm <em>Cardiac Rhythm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm
	 * @generated
	 */
	public Adapter createCardiacRhythmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer <em>Glasgow Coma Score Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer
	 * @generated
	 */
	public Adapter createGlasgowComaScoreOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReading <em>Response Beginning Odometer Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReading
	 * @generated
	 */
	public Adapter createResponseBeginningOdometerReadingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReading <em>Response On Scene Odometer Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReading
	 * @generated
	 */
	public Adapter createResponseOnSceneOdometerReadingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReading <em>Response Destination Odometer Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReading
	 * @generated
	 */
	public Adapter createResponseDestinationOdometerReadingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcome <em>Cardiac Arrest Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcome
	 * @generated
	 */
	public Adapter createCardiacArrestOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportModeQualifier <em>Transport Mode Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.TransportModeQualifier
	 * @generated
	 */
	public Adapter createTransportModeQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.SkinAssessment <em>Skin Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.SkinAssessment
	 * @generated
	 */
	public Adapter createSkinAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer <em>Additional Vital Signs Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer
	 * @generated
	 */
	public Adapter createAdditionalVitalSignsOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.LungAssessment <em>Lung Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.LungAssessment
	 * @generated
	 */
	public Adapter createLungAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAssessment <em>Chest Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ChestAssessment
	 * @generated
	 */
	public Adapter createChestAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot
	 * @generated
	 */
	public Adapter createInfrastructureRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.hl7.rim.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.hl7.rim.Act
	 * @generated
	 */
	public Adapter createActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.ClinicalStatement <em>Clinical Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.ClinicalStatement
	 * @generated
	 */
	public Adapter createClinicalStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.SubstanceAdministration <em>Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.SubstanceAdministration
	 * @generated
	 */
	public Adapter createSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Organizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Organizer
	 * @generated
	 */
	public Adapter createOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Procedure
	 * @generated
	 */
	public Adapter createCDA_ProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // EmspcrAdapterFactory
