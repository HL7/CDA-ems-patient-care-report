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
import org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.TraumaTriageCriteriaSteps1and2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trauma Triage Criteria Steps1and2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TraumaTriageCriteriaSteps1and2Impl extends ObservationImpl implements TraumaTriageCriteriaSteps1and2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraumaTriageCriteriaSteps1and2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.TRAUMA_TRIAGE_CRITERIA_STEPS1AND2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraumaTriageCriteriaSteps1and2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TraumaTriageCriteriaSteps1and2Operations.validateTraumaTriageCriteriaSteps1and2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraumaTriageCriteriaSteps1and2MoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TraumaTriageCriteriaSteps1and2Operations.validateTraumaTriageCriteriaSteps1and2MoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraumaTriageCriteriaSteps1and2CodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TraumaTriageCriteriaSteps1and2Operations.validateTraumaTriageCriteriaSteps1and2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraumaTriageCriteriaSteps1and2Code(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TraumaTriageCriteriaSteps1and2Operations.validateTraumaTriageCriteriaSteps1and2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraumaTriageCriteriaSteps1and2Value(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TraumaTriageCriteriaSteps1and2Operations.validateTraumaTriageCriteriaSteps1and2Value(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraumaTriageCriteriaSteps1and2ValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TraumaTriageCriteriaSteps1and2Operations.validateTraumaTriageCriteriaSteps1and2ValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraumaTriageCriteriaSteps1and2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TraumaTriageCriteriaSteps1and2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // TraumaTriageCriteriaSteps1and2Impl
