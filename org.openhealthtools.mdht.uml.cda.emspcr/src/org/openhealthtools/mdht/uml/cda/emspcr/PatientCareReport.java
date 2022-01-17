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
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PatientCareReportTemplateId' templateId.root='2.16.840.1.1133883.17.3.10.2' templateId.extension='2022-01-01' code.code='67796-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS patient care report - version 3 Document NEMSIS' confidentialityCode.code='N' confidentialityCode.codeSystem='2.16.840.1.113883.5.25' confidentialityCode.codeSystemName='HL7 Confidentiality'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportRecordTargetPatientRolePatient constraints.validation.warning='PatientCareReportRecordTargetPatientRolePatientBirthTime PatientCareReportRecordTargetPatientRolePatientName' ethnicGroupCode.codeSystem='2.16.840.1.113883.6.238' ethnicGroupCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.error='PatientCareReportRecordTargetPatientRolePatientEthnicGroupCode PatientCareReportRecordTargetPatientRolePatientRaceCode PatientCareReportRecordTargetPatientRolePatientRaceCodeP PatientCareReportRecordTargetPatientRolePatientSdtc:RaceCode PatientCareReportRecordTargetPatientRolePatientAdministrativeGenderCode' constraints.validation.info='PatientCareReportRecordTargetPatientRolePatientEthnicGroupCodeP PatientCareReportRecordTargetPatientRolePatientSdtc:RaceCodeP' constraints.validation.dependOn.PatientCareReportRecordTargetPatientRolePatientEthnicGroupCode='PatientCareReportRecordTargetPatientRolePatientEthnicGroupCodeP' raceCode.codeSystem='2.16.840.1.113883.6.238' raceCode.codeSystemName='Race and Ethnicity - CDC' sdtc:RaceCode.codeSystem='2.16.840.1.113883.6.238' sdtc:RaceCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.dependOn.PatientCareReportRecordTargetPatientRolePatientSdtc:RaceCode='PatientCareReportRecordTargetPatientRolePatientSdtc:RaceCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationship typeCode='COMP' constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipTypeCode PatientCareReportEncompassingEncounterRelationshipEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounter constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterEffectiveTime PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterId PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocation' constraints.validation.info='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocation constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacility'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacility constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacilityId PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacilityCode PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacilityCodeP PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacilityPlace' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacilityPlace classCode='PLC' constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacilityPlaceClassCode' constraints.validation.info='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacilityPlaceName PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterLocationHealthCareFacilityPlaceAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipation typeCode='CON' constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipationTypeCode PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipationOtherAgencyAtSceneRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipationOtherAgencyAtSceneRole classCode='ASSIGNED' constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipationOtherAgencyAtSceneRoleClassCode PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipationOtherAgencyAtSceneRoleRepresentedOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipationOtherAgencyAtSceneRoleOtherAgencyAtScene constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEMSEncompassingEncounterOtherAgencyAtSceneParticipationOtherAgencyAtSceneRoleOtherAgencyAtSceneName'"
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
	boolean validatePatientCareReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
