/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientConditionAtDestinationObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Condition At Destination Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PatientConditionAtDestinationObservationImpl extends ObservationImpl
		implements PatientConditionAtDestinationObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientConditionAtDestinationObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PATIENT_CONDITION_AT_DESTINATION_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionAtDestinationObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientConditionAtDestinationObservationOperations.validatePatientConditionAtDestinationObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionAtDestinationObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientConditionAtDestinationObservationOperations.validatePatientConditionAtDestinationObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionAtDestinationObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientConditionAtDestinationObservationOperations.validatePatientConditionAtDestinationObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionAtDestinationObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientConditionAtDestinationObservationOperations.validatePatientConditionAtDestinationObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionAtDestinationObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientConditionAtDestinationObservationOperations.validatePatientConditionAtDestinationObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionAtDestinationObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientConditionAtDestinationObservationOperations.validatePatientConditionAtDestinationObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientConditionAtDestinationObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PatientConditionAtDestinationObservation init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // PatientConditionAtDestinationObservationImpl
