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
import org.openhealthtools.mdht.uml.cda.emspcr.HeartRate;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.HeartRateOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heart Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HeartRateImpl extends ObservationImpl implements HeartRate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeartRateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.HEART_RATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeartRateTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HeartRateOperations.validateHeartRateTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeartRateMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HeartRateOperations.validateHeartRateMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeartRateCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HeartRateOperations.validateHeartRateCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeartRateCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HeartRateOperations.validateHeartRateCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeartRateEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HeartRateOperations.validateHeartRateEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeartRateValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HeartRateOperations.validateHeartRateValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeartRate init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HeartRate init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // HeartRateImpl
