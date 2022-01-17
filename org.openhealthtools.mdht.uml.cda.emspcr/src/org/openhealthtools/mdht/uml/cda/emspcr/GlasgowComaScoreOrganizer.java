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
 * A representation of the model object '<em><b>Glasgow Coma Score Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getGlasgowComaScoreOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GlasgowComaScoreOrganizerTemplateId GlasgowComaScoreOrganizerComponent4' templateId.root='2.16.840.1.1133883.17.3.10.1.170' templateId.extension='2022-01-01' constraints.validation.info='GlasgowComaScoreOrganizerEffectiveTime GlasgowComaScoreOrganizerComponent4' constraints.validation.warning='GlasgowComaScoreOrganizerComponent4'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrGlasgowComaScoreOrganizerGlasgowEye constraints.validation.error='GlasgowComaScoreOrganizerGlasgowEyeObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrGlasgowComaScoreOrganizerGlasgowMotor constraints.validation.error='GlasgowComaScoreOrganizerGlasgowMotorObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrGlasgowComaScoreOrganizerGlasgowQualifier constraints.validation.error='GlasgowComaScoreOrganizerGlasgowQualifierObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrGlasgowComaScoreOrganizerGlasgowTotal constraints.validation.error='GlasgowComaScoreOrganizerGlasgowTotalObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrGlasgowComaScoreOrganizerGlasgowVerbal constraints.validation.error='GlasgowComaScoreOrganizerGlasgowVerbalObservation'"
 *        annotation="duplicates"
 * @generated
 */
public interface GlasgowComaScoreOrganizer extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.170\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validateGlasgowComaScoreOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateGlasgowComaScoreOrganizerEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateGlasgowComaScoreOrganizerComponent4(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowComaScoreOrganizer init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlasgowComaScoreOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // GlasgowComaScoreOrganizer
