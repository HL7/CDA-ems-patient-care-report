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
import org.openhealthtools.mdht.uml.cda.emspcr.TransportModeQualifier;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.TransportModeQualifierOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport Mode Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TransportModeQualifierImpl extends ObservationImpl implements TransportModeQualifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportModeQualifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.TRANSPORT_MODE_QUALIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportModeQualifierTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransportModeQualifierOperations.validateTransportModeQualifierTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportModeQualifierClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransportModeQualifierOperations.validateTransportModeQualifierClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportModeQualifierCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransportModeQualifierOperations.validateTransportModeQualifierCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportModeQualifierCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransportModeQualifierOperations.validateTransportModeQualifierCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportModeQualifierMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransportModeQualifierOperations.validateTransportModeQualifierMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportModeQualifierValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransportModeQualifierOperations.validateTransportModeQualifierValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportModeQualifierValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransportModeQualifierOperations.validateTransportModeQualifierValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportModeQualifier init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransportModeQualifier init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TransportModeQualifierImpl
