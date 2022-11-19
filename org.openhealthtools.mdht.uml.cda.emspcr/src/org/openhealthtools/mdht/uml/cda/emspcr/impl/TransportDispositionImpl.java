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
import org.openhealthtools.mdht.uml.cda.emspcr.TransportDisposition;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.TransportDispositionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport Disposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TransportDispositionImpl extends ObservationImpl implements TransportDisposition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportDispositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.TRANSPORT_DISPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportDispositionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransportDispositionOperations.validateTransportDispositionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportDispositionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransportDispositionOperations.validateTransportDispositionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportDispositionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransportDispositionOperations.validateTransportDispositionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportDispositionValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransportDispositionOperations.validateTransportDispositionValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportDispositionValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransportDispositionOperations.validateTransportDispositionValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportDisposition init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TransportDisposition init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // TransportDispositionImpl
