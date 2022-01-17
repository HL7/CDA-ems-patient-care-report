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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeQualifier;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ResponseModeQualifierOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Mode Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResponseModeQualifierImpl extends ObservationImpl implements ResponseModeQualifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseModeQualifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.RESPONSE_MODE_QUALIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseModeQualifierTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseModeQualifierOperations.validateResponseModeQualifierTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseModeQualifierClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseModeQualifierOperations.validateResponseModeQualifierClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseModeQualifierCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseModeQualifierOperations.validateResponseModeQualifierCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseModeQualifierCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseModeQualifierOperations.validateResponseModeQualifierCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseModeQualifierMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseModeQualifierOperations.validateResponseModeQualifierMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseModeQualifierValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseModeQualifierOperations.validateResponseModeQualifierValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseModeQualifierValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseModeQualifierOperations.validateResponseModeQualifierValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseModeQualifier init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResponseModeQualifier init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ResponseModeQualifierImpl
