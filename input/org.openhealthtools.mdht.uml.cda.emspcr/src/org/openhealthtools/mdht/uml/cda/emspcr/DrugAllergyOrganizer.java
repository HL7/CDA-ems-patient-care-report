/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drug Allergy Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getDrugAllergyOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='DrugAllergyOrganizerTemplateId DrugAllergyOrganizerComponent42' templateId.root='2.16.840.1.1133883.17.3.10.1.183' templateId.extension='2022-01-01' constraints.validation.info='DrugAllergyOrganizerComponent415'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrDrugAllergyOrganizerEMSDrugAllergy constraints.validation.error='DrugAllergyOrganizerEMSDrugAllergyObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrDrugAllergyOrganizerExistenceOfKnownDrugAllergyComponent constraints.validation.error='DrugAllergyOrganizerExistenceOfKnownDrugAllergyComponentObservation'"
 * @generated
 */
public interface DrugAllergyOrganizer extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.183\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validateDrugAllergyOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;exists(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateDrugAllergyOrganizerComponent415(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateDrugAllergyOrganizerComponent42(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugAllergyOrganizer init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DrugAllergyOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // DrugAllergyOrganizer
