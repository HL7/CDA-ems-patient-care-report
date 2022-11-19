/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drug Allergy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getDrugAllergy()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='DrugAllergyParticipant1 DrugAllergyTemplateId DrugAllergyCode DrugAllergyValue DrugAllergyMoodCode' templateId.root='2.16.840.1.1133883.17.3.10.1.48' templateId.extension='2022-01-01' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='ActCode' code.displayName='ASSERTION' value.code='416098002' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMED CT' value.displayName='Drug allergy (disorder)' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrDrugAllergyDrugAllergyParticipation constraints.validation.error='DrugAllergyDrugAllergyParticipationDrugAllergyParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrDrugAllergyDrugAllergyParticipationDrugAllergyParticipantRole constraints.validation.error='DrugAllergyDrugAllergyParticipationDrugAllergyParticipantRoleDrugAllergyEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrDrugAllergyDrugAllergyParticipationDrugAllergyParticipantRoleDrugAllergyEntity code.codeSystem='2.16.840.1.113883.6.88' code.codeSystemName='RxNorm' constraints.validation.warning='DrugAllergyDrugAllergyParticipationDrugAllergyParticipantRoleDrugAllergyEntityCode' constraints.validation.error='DrugAllergyDrugAllergyParticipationDrugAllergyParticipantRoleDrugAllergyEntityCodeP'"
 * @generated
 */
public interface DrugAllergy extends Observation {
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
	boolean validateDrugAllergyParticipant1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.48\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validateDrugAllergyTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'ASSERTION\' and value.codeSystem = \'2.16.840.1.113883.5.4\')'"
	 * @generated
	 */
	boolean validateDrugAllergyCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value-&gt;isEmpty() or self.value-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.value-&gt;size() = 1 and self.value-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.code = \'416098002\' and value.codeSystem = \'2.16.840.1.113883.6.96\'))'"
	 * @generated
	 */
	boolean validateDrugAllergyValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean validateDrugAllergyMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugAllergy init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DrugAllergy init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // DrugAllergy
