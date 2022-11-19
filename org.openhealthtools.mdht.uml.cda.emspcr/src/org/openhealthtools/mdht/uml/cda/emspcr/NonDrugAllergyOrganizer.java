/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Drug Allergy Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getNonDrugAllergyOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='NonDrugAllergyOrganizerExistenceOfNonDrugAllergy NonDrugAllergyOrganizerTemplateId' constraints.validation.info='NonDrugAllergyOrganizerNonDrugAllergy' templateId.root='2.16.840.1.1133883.17.3.10.1.49' templateId.extension='2022-01-01'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrNonDrugAllergyOrganizerExistenceOFNonDrugAllergy constraints.validation.error='NonDrugAllergyOrganizerExistenceOFNonDrugAllergyObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrNonDrugAllergyOrganizerNonDrugAllergy constraints.validation.error='NonDrugAllergyOrganizerNonDrugAllergyObservation'"
 * @generated
 */
public interface NonDrugAllergyOrganizer extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::ExistenceOfKnownNonDrugAllergy))'"
	 * @generated
	 */
	boolean validateNonDrugAllergyOrganizerExistenceOfNonDrugAllergy(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::NonDrugAllergy))'"
	 * @generated
	 */
	boolean validateNonDrugAllergyOrganizerNonDrugAllergy(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.49\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validateNonDrugAllergyOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ExistenceOfKnownNonDrugAllergy))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::ExistenceOfKnownNonDrugAllergy)'"
	 * @generated
	 */
	ExistenceOfKnownNonDrugAllergy getExistenceOfNonDrugAllergy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::NonDrugAllergy)).oclAsType(emspcr::NonDrugAllergy)'"
	 * @generated
	 */
	EList<NonDrugAllergy> getNonDrugAllergies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonDrugAllergyOrganizer init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NonDrugAllergyOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // NonDrugAllergyOrganizer
