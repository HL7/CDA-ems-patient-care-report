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
 * A representation of the model object '<em><b>Dispatch Location Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getDispatchLocationOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.info='DispatchLocationOrganizerDispatchLocationNameRelationship DispatchLocationOrganizerDispatchLocationLatitudeRelationship DispatchLocationOrganizerDispatchLocationLongtudeRelationship' constraints.validation.error='DispatchLocationOrganizerTemplateId' templateId.root='2.16.840.1.1133883.17.3.10.1.96' templateId.extension='2022-01-01'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrDispatchLocationOrganizerDispatchLocationNameRelationship constraints.validation.error='DispatchLocationOrganizerDispatchLocationNameRelationshipDispatchLocationName DispatchLocationOrganizerDispatchLocationNameRelationshipTemplateId' templateId.root='null'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrDispatchLocationOrganizerDispatchLocationLatitudeRelationship constraints.validation.error='DispatchLocationOrganizerDispatchLocationLatitudeRelationshipDispatchLocationLatitude DispatchLocationOrganizerDispatchLocationLatitudeRelationshipTemplateId' templateId.root='null'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrDispatchLocationOrganizerDispatchLocationLongitudeRelationship constraints.validation.error='DispatchLocationOrganizerDispatchLocationLongitudeRelationshipObservation DispatchLocationOrganizerDispatchLocationLongitudeRelationshipTemplateId' templateId.root='null'"
 * @generated
 */
public interface DispatchLocationOrganizer extends Organizer {
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
	boolean validateDispatchLocationOrganizerDispatchLocationNameRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateDispatchLocationOrganizerDispatchLocationLatitudeRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateDispatchLocationOrganizerDispatchLocationLongtudeRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.96\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validateDispatchLocationOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchLocationOrganizer init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DispatchLocationOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // DispatchLocationOrganizer
