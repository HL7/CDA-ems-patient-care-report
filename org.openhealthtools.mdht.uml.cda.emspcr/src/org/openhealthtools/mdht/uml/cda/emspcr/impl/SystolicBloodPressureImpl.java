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
import org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.SystolicBloodPressureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Systolic Blood Pressure</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SystolicBloodPressureImpl extends ObservationImpl implements SystolicBloodPressure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystolicBloodPressureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.SYSTOLIC_BLOOD_PRESSURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystolicBloodPressureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SystolicBloodPressureOperations.validateSystolicBloodPressureTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystolicBloodPressureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SystolicBloodPressureOperations.validateSystolicBloodPressureMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystolicBloodPressureCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SystolicBloodPressureOperations.validateSystolicBloodPressureCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystolicBloodPressureCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SystolicBloodPressureOperations.validateSystolicBloodPressureCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystolicBloodPressureEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SystolicBloodPressureOperations.validateSystolicBloodPressureEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystolicBloodPressureValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SystolicBloodPressureOperations.validateSystolicBloodPressureValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystolicBloodPressureMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SystolicBloodPressureOperations.validateSystolicBloodPressureMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystolicBloodPressureMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SystolicBloodPressureOperations.validateSystolicBloodPressureMethodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystolicBloodPressure init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SystolicBloodPressure init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //SystolicBloodPressureImpl
