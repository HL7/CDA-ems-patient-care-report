/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getProcedure()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.info='ProcedureAbandonedProcedureRelationship ProcedurePriorRelationship ProcedureNumberOfAttemptsRelationship ProcedureComplicationsRelationship ProcedureAirwayConfirmationRelationship ProcedureReasonProcedureNotAttemptedRelationship ProcedureNegationInd ProcedureStatusCode ProcedureApproachSiteCodeP ProcedureDeviceParticipation' constraints.validation.warning='ProcedureSuccessfulRelationship ProcedurePatientResponseRelationship ProcedurePerformer' constraints.validation.error='ProcedureTemplateId ProcedureCode ProcedureCodeP ProcedureEffectiveTime ProcedureApproachSiteCode' templateId.root='2.16.840.1.1133883.17.3.10.1.181' templateId.extension='2022-01-01' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMED CT' approachSiteCode.codeSystem='2.16.840.1.113883.6.1' approachSiteCode.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureAbandonedProcedureRelationship constraints.validation.error='ProcedureAbandonedProcedureRelationshipAbandonedProcedureReasonObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureProcedurePriorRelationship constraints.validation.error='ProcedureProcedurePriorRelationshipProcedurePriorIndicator'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureProcedureNumberOfAttemptsRelationship constraints.validation.error='ProcedureProcedureNumberOfAttemptsRelationshipProcedureNumberOfAttemptsObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureProcedureSuccessfulRelationship constraints.validation.error='ProcedureProcedureSuccessfulRelationshipProcedureSuccessfulObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureProcedureComplicationsRelationship constraints.validation.error='ProcedureProcedureComplicationsRelationshipProcedureComplicationsObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureProcedurePatientResponseRelationship constraints.validation.error='ProcedureProcedurePatientResponseRelationshipProcedurePatientResponseObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureProcedurePerformer constraints.validation.error='ProcedureProcedurePerformerProcedurePerformerEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureProcedurePerformerProcedurePerformerEntity constraints.validation.info='ProcedureProcedurePerformerProcedurePerformerEntityId' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='ProcedureProcedurePerformerProcedurePerformerEntityCode ProcedureProcedurePerformerProcedurePerformerEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureAirwayConfirmationRelationship constraints.validation.error='ProcedureAirwayConfirmationRelationshipAirwayConfirmationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureReasonProcedureNotAttemptedRelationship constraints.validation.error='ProcedureReasonProcedureNotAttemptedRelationshipReasonProcedureNotAttemptedObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureAirwayDeviceParticipant constraints.validation.error='ProcedureAirwayDeviceParticipantAirwayDeviceParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureAirwayDeviceParticipantAirwayDeviceParticipantRole constraints.validation.error='ProcedureAirwayDeviceParticipantAirwayDeviceParticipantRoleAirwayDeviceParticipantType'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureAirwayDeviceParticipantAirwayDeviceParticipantRoleAirwayDeviceParticipantType code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='ProcedureAirwayDeviceParticipantAirwayDeviceParticipantRoleAirwayDeviceParticipantTypeCode'"
 * @generated
 */
public interface Procedure extends org.eclipse.mdht.uml.cda.Procedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateProcedureAbandonedProcedureRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateProcedurePriorRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateProcedureNumberOfAttemptsRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateProcedureSuccessfulRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateProcedureComplicationsRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateProcedurePatientResponseRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))'"
	 * @generated
	 */
	boolean validateProcedurePerformer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateProcedureAirwayConfirmationRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateProcedureReasonProcedureNotAttemptedRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.181\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validateProcedureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\')'"
	 * @generated
	 */
	boolean validateProcedureCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.negationInd.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateProcedureNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProcedureStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProcedureEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.approachSiteCode-&gt;isEmpty() or self.approachSiteCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA18757-7\' or value.code = \'LA18758-5\' or value.code = \'LA18790-8\' or value.code = \'LA18791-6\' or value.code = \'LA18792-4\' or value.code = \'LA18793-2\' or value.code = \'LA18794-0\' or value.code = \'LA18795-7\' or value.code = \'LA18796-5\' or value.code = \'LA18797-3\' or value.code = \'LA18798-1\' or value.code = \'LA18799-9\' or value.code = \'LA18800-5\' or value.code = \'LA18801-3\' or value.code = \'LA18802-1\' or value.code = \'LA18803-9\' or value.code = \'LA18804-7\' or value.code = \'LA18805-4\' or value.code = \'LA18806-2\' or value.code = \'LA18807-0\' or value.code = \'LA18808-8\' or value.code = \'LA18809-6\' or value.code = \'LA18810-4\' or value.code = \'LA18811-2\' or value.code = \'LA18812-0\' or value.code = \'LA18813-8\' or value.code = \'LA18814-6\' or value.code = \'LA18815-3\' or value.code = \'LA18816-1\' or value.code = \'LA18817-9\' or value.code = \'LA18818-7\' or value.code = \'LA18112-5\' or value.code = \'LA18113-3\' or value.code = \'LA24415-4\' or value.code = \'LA24416-2\' or value.code = \'LA24417-0\' or value.code = \'LA24418-8\' or value.code = \'LA24419-6\' or value.code = \'LA24420-4\' or value.code = \'LA18765-0\' or value.code = \'LA18766-8\')))'"
	 * @generated
	 */
	boolean validateProcedureApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.approachSiteCode-&gt;isEmpty() or self.approachSiteCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not self.approachSiteCode-&gt;isEmpty()) )'"
	 * @generated
	 */
	boolean validateProcedureApproachSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
	 * @generated
	 */
	boolean validateProcedureDeviceParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Procedure init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // Procedure
