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
 * A representation of the model object '<em><b>Additional Vital Signs Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getAdditionalVitalSignsOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AdditionalVitalSignsOrganizerTemplateId AdditionalVitalSignsOrganizerMoodCode AdditionalVitalSignsOrganizerComponent4 AdditionalVitalSignsOrganizerComponent42' templateId.root='2.16.840.1.1133883.17.3.10.1.30' templateId.extension='2022-01-01' moodCode='EVN' constraints.validation.info='AdditionalVitalSignsOrganizerEffectiveTime AdditionalVitalSignsOrganizerComponent4' constraints.validation.warning='AdditionalVitalSignsOrganizerComponent4'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrAdditionalVitalSignsOrganizerStrokeScoreComponent constraints.validation.error='AdditionalVitalSignsOrganizerStrokeScoreComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrAdditionalVitalSignsOrganizerPainScoreComponent constraints.validation.error='AdditionalVitalSignsOrganizerPainScoreComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrAdditionalVitalSignsOrganizerLevelOfResponsiveness constraints.validation.error='AdditionalVitalSignsOrganizerLevelOfResponsivenessObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrAdditionalVitalSignsOrganizerBloodGlucoseComponent constraints.validation.error='AdditionalVitalSignsOrganizerBloodGlucoseComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrAdditionalVitalSignsOrganizerCarbonMonoxideComponent constraints.validation.error='AdditionalVitalSignsOrganizerCarbonMonoxideComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrAdditionalVitalSignsOrganizerCarbonDioxideComponent constraints.validation.error='AdditionalVitalSignsOrganizerCarbonDioxideComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrAdditionalVitalSignsOrganizerCardiacRythmComponent constraints.validation.error='AdditionalVitalSignsOrganizerCardiacRythmComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrAdditionalVitalSignsOrganizerGlasgowScoreOrganizer constraints.validation.error='AdditionalVitalSignsOrganizerGlasgowScoreOrganizerOrganizer'"
 *        annotation="duplicates"
 * @generated
 */
public interface AdditionalVitalSignsOrganizer extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.30\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validateAdditionalVitalSignsOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
	 * @generated
	 */
	boolean validateAdditionalVitalSignsOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAdditionalVitalSignsOrganizerEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAdditionalVitalSignsOrganizerComponent4(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAdditionalVitalSignsOrganizerComponent42(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalVitalSignsOrganizer init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdditionalVitalSignsOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AdditionalVitalSignsOrganizer
