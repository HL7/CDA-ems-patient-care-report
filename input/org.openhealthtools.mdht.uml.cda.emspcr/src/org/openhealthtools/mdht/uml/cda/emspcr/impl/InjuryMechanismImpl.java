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
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.InjuryMechanismOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Injury Mechanism</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InjuryMechanismImpl extends ObservationImpl implements InjuryMechanism {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InjuryMechanismImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.INJURY_MECHANISM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjuryMechanismTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InjuryMechanismOperations.validateInjuryMechanismTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjuryMechanismMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InjuryMechanismOperations.validateInjuryMechanismMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjuryMechanismCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InjuryMechanismOperations.validateInjuryMechanismCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjuryMechanismCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InjuryMechanismOperations.validateInjuryMechanismCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjuryMechanismValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InjuryMechanismOperations.validateInjuryMechanismValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjuryMechanismValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InjuryMechanismOperations.validateInjuryMechanismValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjuryMechanism init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public InjuryMechanism init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // InjuryMechanismImpl
