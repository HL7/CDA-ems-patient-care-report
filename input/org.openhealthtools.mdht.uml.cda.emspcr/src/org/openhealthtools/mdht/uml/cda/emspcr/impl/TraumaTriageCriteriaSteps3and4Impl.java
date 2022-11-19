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
import org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.TraumaTriageCriteriaSteps3and4Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trauma Triage Criteria Steps3and4</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TraumaTriageCriteriaSteps3and4Impl extends ObservationImpl implements TraumaTriageCriteriaSteps3and4 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraumaTriageCriteriaSteps3and4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.TRAUMA_TRIAGE_CRITERIA_STEPS3AND4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraumaTriageCriteriaSteps3and4TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TraumaTriageCriteriaSteps3and4Operations.validateTraumaTriageCriteriaSteps3and4TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraumaTriageCriteriaSteps3and4MoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TraumaTriageCriteriaSteps3and4Operations.validateTraumaTriageCriteriaSteps3and4MoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraumaTriageCriteriaSteps3and4CodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TraumaTriageCriteriaSteps3and4Operations.validateTraumaTriageCriteriaSteps3and4CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraumaTriageCriteriaSteps3and4Code(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TraumaTriageCriteriaSteps3and4Operations.validateTraumaTriageCriteriaSteps3and4Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraumaTriageCriteriaSteps3and4Value(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TraumaTriageCriteriaSteps3and4Operations.validateTraumaTriageCriteriaSteps3and4Value(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraumaTriageCriteriaSteps3and4ValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TraumaTriageCriteriaSteps3and4Operations.validateTraumaTriageCriteriaSteps3and4ValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraumaTriageCriteriaSteps3and4 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TraumaTriageCriteriaSteps3and4 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // TraumaTriageCriteriaSteps3and4Impl
