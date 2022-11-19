/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DispatchReasonOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dispatch Reason</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DispatchReasonImpl extends ObservationImpl implements DispatchReason {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DispatchReasonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.DISPATCH_REASON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchReasonTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchReasonOperations.validateDispatchReasonTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchReasonMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchReasonOperations.validateDispatchReasonMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchReasonCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchReasonOperations.validateDispatchReasonCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchReasonCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchReasonOperations.validateDispatchReasonCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchReasonValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchReasonOperations.validateDispatchReasonValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchReasonValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchReasonOperations.validateDispatchReasonValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchReason init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DispatchReason init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // DispatchReasonImpl
