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
 * A representation of the model object '<em><b>Physical Assessment Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getPhysicalAssessmentOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.info='PhysicalAssessmentOrganizerComponent3 PhysicalAssessmentOrganizerComponent412 PhysicalAssessmentOrganizerComponent5 PhysicalAssessmentOrganizerComponent6 PhysicalAssessmentOrganizerComponent8 PhysicalAssessmentOrganizerComponent9 PhysicalAssessmentOrganizerComponent10 PhysicalAssessmentOrganizerComponent11 PhysicalAssessmentOrganizerComponent12 PhysicalAssessmentOrganizerComponent13 PhysicalAssessmentOrganizerComponent14 PhysicalAssessmentOrganizerComponent15 PhysicalAssessmentOrganizerComponent42 PhysicalAssessmentOrganizerComponent413' constraints.validation.error='PhysicalAssessmentOrganizerTemplateId' templateId.root='2.16.840.1.1133883.17.3.10.1.78' templateId.extension='2022-01-01'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerBodyWeightComponent constraints.validation.error='PhysicalAssessmentOrganizerBodyWeightComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerLengthBasedPatientBodyWeightClassComponent constraints.validation.error='PhysicalAssessmentOrganizerLengthBasedPatientBodyWeightClassComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerSkinAssessmentComponent constraints.validation.error='PhysicalAssessmentOrganizerSkinAssessmentComponentSkinAssessment'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerHeadAssessmentComponent constraints.validation.error='PhysicalAssessmentOrganizerHeadAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerFaceAssessmentComponent constraints.validation.error='PhysicalAssessmentOrganizerFaceAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerNeckAssessmentComponent constraints.validation.error='PhysicalAssessmentOrganizerNeckAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerHeartAssessmentComponent constraints.validation.error='PhysicalAssessmentOrganizerHeartAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerAbdomenAssessmentComponent constraints.validation.error='PhysicalAssessmentOrganizerAbdomenAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerPelvicAndGenitourinaryAssessmentComponent constraints.validation.error='PhysicalAssessmentOrganizerPelvicAndGenitourinaryAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerBackAndSpineAssessmentComponent constraints.validation.error='PhysicalAssessmentOrganizerBackAndSpineAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerExtremitiesAssessmentComponent constraints.validation.error='PhysicalAssessmentOrganizerExtremitiesAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerEyeAssessmentComponent constraints.validation.error='PhysicalAssessmentOrganizerEyeAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerMentalStatusAssessmentComponent constraints.validation.error='PhysicalAssessmentOrganizerMentalStatusAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerNeurologicalAssessmentComponent constraints.validation.error='PhysicalAssessmentOrganizerNeurologicalAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerLungAssessmentComponent constraints.validation.error='PhysicalAssessmentOrganizerLungAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerChestAssessmentComponent constraints.validation.error='PhysicalAssessmentOrganizerChestAssessmentComponentObservation'"
 * @generated
 */
public interface PhysicalAssessmentOrganizer extends Organizer {
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
	boolean validatePhysicalAssessmentOrganizerComponent3(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicalAssessmentOrganizerComponent412(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicalAssessmentOrganizerComponent5(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicalAssessmentOrganizerComponent6(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicalAssessmentOrganizerComponent8(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicalAssessmentOrganizerComponent9(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicalAssessmentOrganizerComponent10(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicalAssessmentOrganizerComponent11(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicalAssessmentOrganizerComponent12(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicalAssessmentOrganizerComponent13(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicalAssessmentOrganizerComponent14(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.78\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validatePhysicalAssessmentOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicalAssessmentOrganizerComponent15(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicalAssessmentOrganizerComponent42(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicalAssessmentOrganizerComponent413(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalAssessmentOrganizer init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PhysicalAssessmentOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PhysicalAssessmentOrganizer
