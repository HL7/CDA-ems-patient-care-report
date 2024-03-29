/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.SubstanceAdministration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Administered</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getMedicationAdministered()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.info='MedicationAdministeredMedicationNotAdministeredEntryRelationship MedicationAdministeredMedicationComplicationRelationship MedicationAdministeredMedicationPerformerParticipation MedicationAdministeredMedicationAuthorizationRelationship MedicationAdministeredMedicationAdministrationDeviceParticipant MedicationAdministeredNegationInd MedicationAdministeredRouteCodeP MedicationAdministeredDoseQuantity MedicationAdministeredRateQuantity MedicationAdministeredApproachSiteCodeP' constraints.validation.error='MedicationAdministeredMedicationConsumable MedicationAdministeredMedicationAdministeredResponseRelationship MedicationAdministeredMedicationPriorAdministrationRelationship MedicationAdministeredTemplateId MedicationAdministeredClassCode MedicationAdministeredEffectiveTime MedicationAdministeredRouteCode MedicationAdministeredApproachSiteCode' templateId.root='2.16.840.1.1133883.17.3.10.1.72' templateId.extension='2022-01-01' classCode='SBADM' routeCode.codeSystem='2.16.840.1.113883.3.26.1.1.1' routeCode.codeSystemName='FDA Route of Administration' constraints.validation.dependOn.MedicationAdministeredRouteCode='MedicationAdministeredRouteCodeP' approachSiteCode.codeSystem='2.16.840.1.113883.6.96' approachSiteCode.codeSystemName='SNOMED CT'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrMedicationAdministeredMedicationNotAdministeredReasonEntryRelationship constraints.validation.error='MedicationAdministeredMedicationNotAdministeredReasonEntryRelationshipMedicationNotAdministeredReasonObservation MedicationAdministeredMedicationNotAdministeredReasonEntryRelationshipInversionInd MedicationAdministeredMedicationNotAdministeredReasonEntryRelationshipTypeCode MedicationAdministeredMedicationNotAdministeredReasonEntryRelationshipTypeCodeP' inversionInd='TRUE' typeCode='RSON' constraints.validation.dependOn.MedicationAdministeredMedicationNotAdministeredReasonEntryRelationshipTypeCode='MedicationAdministeredMedicationNotAdministeredReasonEntryRelationshipTypeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrMedicationAdministeredMedicationAdministeredConsumable constraints.validation.error='MedicationAdministeredMedicationAdministeredConsumableMedicationManfacturedProduct'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrMedicationAdministeredMedicationAdministeredConsumableMedicationManfacturedProduct constraints.validation.error='MedicationAdministeredMedicationAdministeredConsumableMedicationManfacturedProductMedicationLabeledDrug'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrMedicationAdministeredMedicationAdministeredConsumableMedicationManfacturedProductMedicationMaterial code.codeSystem='2.16.840.1.113883.6.88' code.codeSystemName='RxNorm' constraints.validation.warning='MedicationAdministeredMedicationAdministeredConsumableMedicationManfacturedProductMedicationMaterialCode' constraints.validation.error='MedicationAdministeredMedicationAdministeredConsumableMedicationManfacturedProductMedicationMaterialCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrMedicationAdministeredMedicationAdministeredResponseRelationship constraints.validation.error='MedicationAdministeredMedicationAdministeredResponseRelationshipMedicationResponseObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrMedicationAdministeredMedicationComplicationRelationship constraints.validation.error='MedicationAdministeredMedicationComplicationRelationshipMedicationComplicationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrMedicationAdministeredMedicationPriorAdministrationRelationship constraints.validation.error='MedicationAdministeredMedicationPriorAdministrationRelationshipMedicationPriorAdministrationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrMedicationAdministeredMedicationPerformerParticipation constraints.validation.error='MedicationAdministeredMedicationPerformerParticipationMedicationPerformerRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrMedicationAdministeredMedicationPerformerParticipationMedicationPerformerRole constraints.validation.error='MedicationAdministeredMedicationPerformerParticipationMedicationPerformerRoleId MedicationAdministeredMedicationPerformerParticipationMedicationPerformerRoleCode MedicationAdministeredMedicationPerformerParticipationMedicationPerformerRoleCodeP' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrMedicationAdministeredMedicationAuthorizationRelationship constraints.validation.error='MedicationAdministeredMedicationAuthorizationRelationshipMedicationAuthorization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrMedicationAdministeredMedicationAuthorizationRelationshipMedicationAuthorization classCode='INFRM' constraints.validation.error='MedicationAdministeredMedicationAuthorizationRelationshipMedicationAuthorizationClassCode MedicationAdministeredMedicationAuthorizationRelationshipMedicationAuthorizationClassCodeP MedicationAdministeredMedicationAuthorizationRelationshipMedicationAuthorizationCode' constraints.validation.dependOn.MedicationAdministeredMedicationAuthorizationRelationshipMedicationAuthorizationClassCode='MedicationAdministeredMedicationAuthorizationRelationshipMedicationAuthorizationClassCodeP' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrMedicationAdministeredMedicationAdministrationDeviceParticipant constraints.validation.error='MedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRole MedicationAdministeredMedicationAdministrationDeviceParticipantTypeCode' typeCode='DEV'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrMedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRole constraints.validation.error='MedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRoleMedicationAdministrationDevice MedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRoleClassCode' classCode='MANU'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrMedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRoleMedicationAdministrationDevice code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='MedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRoleMedicationAdministrationDeviceCode MedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRoleMedicationAdministrationDeviceCodeP'"
 * @generated
 */
public interface MedicationAdministered extends SubstanceAdministration {
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
	boolean validateMedicationAdministeredMedicationNotAdministeredEntryRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.consumable-&gt;one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))'"
	 * @generated
	 */
	boolean validateMedicationAdministeredMedicationConsumable(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateMedicationAdministeredMedicationAdministeredResponseRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateMedicationAdministeredMedicationComplicationRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateMedicationAdministeredMedicationPriorAdministrationRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))'"
	 * @generated
	 */
	boolean validateMedicationAdministeredMedicationPerformerParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateMedicationAdministeredMedicationAuthorizationRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
	 * @generated
	 */
	boolean validateMedicationAdministeredMedicationAdministrationDeviceParticipant(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.72\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validateMedicationAdministeredTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\')'"
	 * @generated
	 */
	boolean validateMedicationAdministeredClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationAdministeredNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime-&gt;isEmpty() or self.effectiveTime-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not self.effectiveTime-&gt;isEmpty()) )'"
	 * @generated
	 */
	boolean validateMedicationAdministeredEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateMedicationAdministeredRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1.1\' and (value.code = \'C38208\' or value.code = \'C38246\' or value.code = \'C38216\' or value.code = \'C38222\' or value.code = \'C38284\' or value.code = \'C28161\' or value.code = \'C38255\' or value.code = \'C38276\' or value.code = \'C38285\' or value.code = \'C38287\' or value.code = \'C38288\' or value.code = \'C38290\' or value.code = \'C38192\' or value.code = \'C38295\' or value.code = \'C38299\' or value.code = \'C38300\' or value.code = \'C38304\' or value.code = \'C38305\' or value.code = \'C38271\' or value.code = \'C38193\' or value.code = \'C38238\' or value.code = \'C64987\' or value.code = \'C38250\' or value.code = \'C38676\'))'"
	 * @generated
	 */
	boolean validateMedicationAdministeredRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateMedicationAdministeredDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.rateQuantity.oclIsUndefined() or self.rateQuantity.isNullFlavorUndefined()) implies (not self.rateQuantity.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateMedicationAdministeredRateQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationAdministeredApproachSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.approachSiteCode-&gt;isEmpty() or self.approachSiteCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'280361007\' or value.code = \'15562006\')))'"
	 * @generated
	 */
	boolean validateMedicationAdministeredApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministered init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MedicationAdministered init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MedicationAdministered
