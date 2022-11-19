/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Care Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getPatientCareReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId PatientCareReportClassCode PatientCareReportMoodCode GeneralHeaderConstraintsId PatientCareReportCode PatientCareReportCodeP GeneralHeaderConstraintsTitle PatientCareReportConfidentialityCode PatientCareReportRecordTarget PatientCareReportCurrentMedication PatientCareReportAllergiesAndAdverseReactionsSection PatientCareReportPastMedicalHistorySection PatientCareReportSocialHistorySection PatientCareReportPhysicalAssessmentSection PatientCareReportProceduresPerformedSection PatientCareReportPatientCareNarrativeSection PatientCareReportSceneSection GeneralHeaderConstraintsComponentOf PatientCareReportDispatchSection PatientCareReportPersonnelAdverseEventSection PatientCareReportProtocolSection PatientCareReportResponseSection PatientCareReportSituationSection PatientCareReportVitalSignsSection PatientCareReportAuthorParticipation GeneralHeaderConstraintsCustodian PatientCareReportDocumentationOf PatientCareReportParticipant PatientCareReportInjuryIncidentDescriptionSection' templateId.root='2.16.840.1.1133883.17.3.10.2' templateId.extension='2022-01-01' classCode='DOCCLIN' moodCode='EVN' code.code='67796-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS patient care report - version 3 Document NEMSIS' constraints.validation.dependOn.PatientCareReportCode='PatientCareReportCodeP' title.mixed='EMS Patient Care Report' confidentialityCode.code='N' confidentialityCode.codeSystemName='' constraints.validation.info='GeneralHeaderConstraintsVersionNumber PatientCareReportCardiacArrestEvent PatientCareReportMedicationsAdministeredSection PatientCareReportDispositionSection PatientCareReportTimesSection PatientCareReportRelatedDocument' constraints.validation.warning='PatientCareReportAdvanceDirectives PatientCareReportEMSBillingSection'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportRecordTarget constraints.validation.error='PatientCareReportRecordTargetPatientRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportRecordTargetPatientRole constraints.validation.error='PatientCareReportRecordTargetPatientRoleAddr PatientCareReportRecordTargetPatientRoleId PatientCareReportRecordTargetPatientRolePatient' constraints.validation.info='PatientCareReportRecordTargetPatientRoleTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportRecordTargetPatientRolePatient constraints.validation.warning='PatientCareReportRecordTargetPatientRolePatientBirthTime PatientCareReportRecordTargetPatientRolePatientName' ethnicGroupCode.codeSystem='2.16.840.1.113883.6.238' ethnicGroupCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.error='PatientCareReportRecordTargetPatientRolePatientEthnicGroupCode PatientCareReportRecordTargetPatientRolePatientRaceCode PatientCareReportRecordTargetPatientRolePatientRaceCodeP PatientCareReportRecordTargetPatientRolePatientSdtc:RaceCode PatientCareReportRecordTargetPatientRolePatientAdministrativeGenderCode PatientCareReportRecordTargetPatientRolePatientAdministrativeGenderCodeP' constraints.validation.info='PatientCareReportRecordTargetPatientRolePatientEthnicGroupCodeP PatientCareReportRecordTargetPatientRolePatientSdtc:RaceCodeP' constraints.validation.dependOn.PatientCareReportRecordTargetPatientRolePatientEthnicGroupCode='PatientCareReportRecordTargetPatientRolePatientEthnicGroupCodeP' raceCode.codeSystem='2.16.840.1.113883.6.238' raceCode.codeSystemName='Race and Ethnicity - CDC' sdtc:RaceCode.codeSystem='2.16.840.1.113883.6.238' sdtc:RaceCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.dependOn.PatientCareReportRecordTargetPatientRolePatientSdtc:RaceCode='PatientCareReportRecordTargetPatientRolePatientSdtc:RaceCodeP' administrativeGenderCode.codeSystemName=''"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthorParticipation constraints.validation.error='GeneralHeaderConstraintsAuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthorParticipationAuthorRole constraints.validation.error='PatientCareReportAuthorParticipationAuthorRoleId PatientCareReportAuthorParticipationAuthorRoleAddr PatientCareReportAuthorParticipationAuthorRoleTelecom' constraints.validation.info='PatientCareReportAuthorParticipationAuthorRoleHumanAuthor PatientCareReportAuthorParticipationAuthorRoleAuthoringDevice'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthorParticipationAuthorRoleHumanAuthor constraints.validation.error='PatientCareReportAuthorParticipationAuthorRoleHumanAuthorName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthorParticipationAuthorRoleAuthoringDevice constraints.validation.error='GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationship typeCode='COMP' constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipTypeCode PatientCareReportEncompassingEncounterRelationshipEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounter constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterEffectiveTime PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterId PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocation' constraints.validation.info='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocation constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacility'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacility constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacilityId PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacilityCode PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacilityCodeP PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacilityPlace' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacilityPlace classCode='PLC' constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacilityPlaceClassCode' constraints.validation.info='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacilityPlaceName PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacilityPlaceAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipation typeCode='CON' constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipationTypeCode PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipationOtherAgencyAtSceneRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipationOtherAgencyAtSceneRole classCode='ASSIGNED' constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipationOtherAgencyAtSceneRoleClassCode PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipationOtherAgencyAtSceneRoleRepresentedOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipationOtherAgencyAtSceneRoleOtherAgencyAtScene constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipationOtherAgencyAtSceneRoleOtherAgencyAtSceneName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportCustodianParticipation constraints.validation.error='PatientCareReportCustodianParticipationCustodianRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportCustodianParticipationCustodianRole constraints.validation.error='PatientCareReportCustodianParticipationCustodianRoleCustodian'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportCustodianParticipationCustodianRoleCustodian constraints.validation.error='PatientCareReportCustodianParticipationCustodianRoleCustodianAddr PatientCareReportCustodianParticipationCustodianRoleCustodianId PatientCareReportCustodianParticipationCustodianRoleCustodianName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportServiceEventParticipation constraints.validation.error='PatientCareReportServiceEventParticipationServiceEvent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportServiceEventParticipationServiceEvent code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='PatientCareReportServiceEventParticipationServiceEventCode PatientCareReportServiceEventParticipationServiceEventId PatientCareReportServiceEventParticipationServiceEventPerformerParticipation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportServiceEventParticipationServiceEventPerformerParticipation functionCode.codeSystem='2.16.840.1.113883.6.1' functionCode.codeSystemName='LOINC' constraints.validation.error='PatientCareReportServiceEventParticipationServiceEventPerformerParticipationFunctionCode PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRole code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRoleCode PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRoleCodeP PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRoleId' constraints.validation.dependOn.PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRoleCode='PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRoleCodeP' constraints.validation.info='PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRoleAddr PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRoleTelecom PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRolePerformer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRolePerformer constraints.validation.error='PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRolePerformerName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportParentDocumentRelationship typeCode='RPLC' constraints.validation.error='PatientCareReportParentDocumentRelationshipTypeCode' constraints.validation.info='PatientCareReportParentDocumentRelationshipParentDocument'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportParentDocumentRelationshipParentDocument constraints.validation.error='PatientCareReportParentDocumentRelationshipParentDocumentId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportDestinationParticipantParticipation typeCode='DST' constraints.validation.error='PatientCareReportDestinationParticipantParticipationTypeCode PatientCareReportDestinationParticipantParticipationTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportDestinationParticipantParticipationDestinationRole constraints.validation.error='PatientCareReportDestinationParticipantParticipationDestinationRoleAddr PatientCareReportDestinationParticipantParticipationDestinationRoleCode PatientCareReportDestinationParticipantParticipationDestinationRoleCodeP PatientCareReportDestinationParticipantParticipationDestinationRoleClassCode' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' classCode='SDLOC' constraints.validation.warning='PatientCareReportDestinationParticipantParticipationDestinationRoleId'"
 * @generated
 */
public interface PatientCareReport extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.2\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\') and self.classCode=vocab::ActClinicalDocument::DOCCLIN'"
	 * @generated
	 */
	boolean validatePatientCareReportClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\') and self.moodCode=vocab::ActMood::EVN'"
	 * @generated
	 */
	boolean validatePatientCareReportMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePatientCareReportCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'67796-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validatePatientCareReportCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = \'EMS Patient Care Report\')'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in \nvalue.code = \'N\')'"
	 * @generated
	 */
	boolean validatePatientCareReportConfidentialityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget-&gt;one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))'"
	 * @generated
	 */
	boolean validatePatientCareReportRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCurrentMedicationSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportCurrentMedication(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCardiacArrestEventSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportCardiacArrestEvent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAdvanceDirectivesSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportAdvanceDirectives(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportAllergiesAndAdverseReactionsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPastMedicalHistorySection))'"
	 * @generated
	 */
	boolean validatePatientCareReportPastMedicalHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSocialHistorySection))'"
	 * @generated
	 */
	boolean validatePatientCareReportSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportPhysicalAssessmentSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSMedicationsAdministeredSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportMedicationsAdministeredSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProceduresPerformedSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportProceduresPerformedSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPatientCareNarrativeSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportPatientCareNarrativeSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSceneSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportSceneSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSDispatchSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportDispatchSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSDispositionSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportDispositionSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPersonnelAdverseEventSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportPersonnelAdverseEventSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProtocolSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportProtocolSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSResponseSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportResponseSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSituationSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportSituationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSTimesSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportTimesSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSVitalSignsSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author-&gt;exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
	 * @generated
	 */
	boolean validatePatientCareReportAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian-&gt;one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsCustodian(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
	 * @generated
	 */
	boolean validatePatientCareReportDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedDocument-&gt;one(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))'"
	 * @generated
	 */
	boolean validatePatientCareReportRelatedDocument(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;one(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))'"
	 * @generated
	 */
	boolean validatePatientCareReportParticipant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportInjuryIncidentDescriptionSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSBillingSection))-&gt;size() &gt;= 1'"
	 * @generated
	 */
	boolean validatePatientCareReportEMSBillingSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCurrentMedicationSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSCurrentMedicationSection)'"
	 * @generated
	 */
	EMSCurrentMedicationSection getCurrentMedication();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCardiacArrestEventSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSCardiacArrestEventSection)'"
	 * @generated
	 */
	EMSCardiacArrestEventSection getCardiacArrestEvent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAdvanceDirectivesSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSAdvanceDirectivesSection)'"
	 * @generated
	 */
	EMSAdvanceDirectivesSection getAdvanceDirectives();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSAllergiesAndAdverseReactionsSection)'"
	 * @generated
	 */
	EMSAllergiesAndAdverseReactionsSection getAllergiesAndAdverseReactionsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPastMedicalHistorySection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSPastMedicalHistorySection)'"
	 * @generated
	 */
	EMSPastMedicalHistorySection getPastMedicalHistorySection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSocialHistorySection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSSocialHistorySection)'"
	 * @generated
	 */
	EMSSocialHistorySection getSocialHistorySection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSPhysicalAssessmentSection)'"
	 * @generated
	 */
	EMSPhysicalAssessmentSection getPhysicalAssessmentSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSMedicationsAdministeredSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSMedicationsAdministeredSection)'"
	 * @generated
	 */
	EMSMedicationsAdministeredSection getMedicationsAdministeredSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProceduresPerformedSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSProceduresPerformedSection)'"
	 * @generated
	 */
	EMSProceduresPerformedSection getProceduresPerformedSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPatientCareNarrativeSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSPatientCareNarrativeSection)'"
	 * @generated
	 */
	EMSPatientCareNarrativeSection getPatientCareNarrativeSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSceneSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSSceneSection)'"
	 * @generated
	 */
	EMSSceneSection getSceneSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSDispatchSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSDispatchSection)'"
	 * @generated
	 */
	EMSDispatchSection getDispatchSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSDispositionSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSDispositionSection)'"
	 * @generated
	 */
	EMSDispositionSection getDispositionSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPersonnelAdverseEventSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSPersonnelAdverseEventSection)'"
	 * @generated
	 */
	EMSPersonnelAdverseEventSection getPersonnelAdverseEventSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProtocolSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSProtocolSection)'"
	 * @generated
	 */
	EMSProtocolSection getProtocolSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSResponseSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSResponseSection)'"
	 * @generated
	 */
	EMSResponseSection getResponseSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSituationSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSSituationSection)'"
	 * @generated
	 */
	EMSSituationSection getSituationSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSTimesSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSTimesSection)'"
	 * @generated
	 */
	EMSTimesSection getTimesSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSVitalSignsSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSVitalSignsSection)'"
	 * @generated
	 */
	EMSVitalSignsSection getVitalSignsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::EMSInjuryIncidentDescriptionSection)'"
	 * @generated
	 */
	EMSInjuryIncidentDescriptionSection getInjuryIncidentDescriptionSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSBillingSection)).oclAsType(emspcr::EMSBillingSection)'"
	 * @generated
	 */
	EList<EMSBillingSection> getEMSBillingSections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientCareReport init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PatientCareReport init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PatientCareReport
