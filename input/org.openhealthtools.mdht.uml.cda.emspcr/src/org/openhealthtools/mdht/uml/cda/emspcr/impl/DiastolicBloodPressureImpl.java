/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DiastolicBloodPressureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diastolic Blood Pressure</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DiastolicBloodPressureImpl extends ObservationImpl implements DiastolicBloodPressure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiastolicBloodPressureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.DIASTOLIC_BLOOD_PRESSURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiastolicBloodPressureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiastolicBloodPressureOperations.validateDiastolicBloodPressureTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiastolicBloodPressureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiastolicBloodPressureOperations.validateDiastolicBloodPressureMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiastolicBloodPressureCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiastolicBloodPressureOperations.validateDiastolicBloodPressureCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiastolicBloodPressureEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiastolicBloodPressureOperations.validateDiastolicBloodPressureEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiastolicBloodPressureValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiastolicBloodPressureOperations.validateDiastolicBloodPressureValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiastolicBloodPressureMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiastolicBloodPressureOperations.validateDiastolicBloodPressureMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiastolicBloodPressureMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiastolicBloodPressureOperations.validateDiastolicBloodPressureMethodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiastolicBloodPressure init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DiastolicBloodPressure init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // DiastolicBloodPressureImpl
