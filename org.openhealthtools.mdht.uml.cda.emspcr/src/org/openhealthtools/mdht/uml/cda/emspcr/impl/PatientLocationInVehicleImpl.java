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
import org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientLocationInVehicleOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Location In Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PatientLocationInVehicleImpl extends ObservationImpl implements PatientLocationInVehicle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientLocationInVehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PATIENT_LOCATION_IN_VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientLocationInVehicleTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientLocationInVehicleOperations.validatePatientLocationInVehicleTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientLocationInVehicleMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientLocationInVehicleOperations.validatePatientLocationInVehicleMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientLocationInVehicleCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientLocationInVehicleOperations.validatePatientLocationInVehicleCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientLocationInVehicleCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientLocationInVehicleOperations.validatePatientLocationInVehicleCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientLocationInVehicleValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientLocationInVehicleOperations.validatePatientLocationInVehicleValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientLocationInVehicleValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientLocationInVehicleOperations.validatePatientLocationInVehicleValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientLocationInVehicle init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatientLocationInVehicle init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //PatientLocationInVehicleImpl
