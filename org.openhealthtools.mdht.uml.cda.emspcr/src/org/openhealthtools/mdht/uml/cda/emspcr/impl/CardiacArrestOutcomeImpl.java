/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcome;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.CardiacArrestOutcomeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardiac Arrest Outcome</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CardiacArrestOutcomeImpl extends ObservationImpl implements CardiacArrestOutcome {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardiacArrestOutcomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.CARDIAC_ARREST_OUTCOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestOutcomeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestOutcomeOperations.validateCardiacArrestOutcomeTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestOutcomeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestOutcomeOperations.validateCardiacArrestOutcomeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestOutcomeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestOutcomeOperations.validateCardiacArrestOutcomeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestOutcomeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestOutcomeOperations.validateCardiacArrestOutcomeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestOutcomeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestOutcomeOperations.validateCardiacArrestOutcomeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestOutcomeValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestOutcomeOperations.validateCardiacArrestOutcomeValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacArrestOutcome init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CardiacArrestOutcome init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //CardiacArrestOutcomeImpl
