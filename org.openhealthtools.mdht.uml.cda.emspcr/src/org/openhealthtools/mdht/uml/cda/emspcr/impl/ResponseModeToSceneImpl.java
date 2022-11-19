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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ResponseModeToSceneOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Mode To Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResponseModeToSceneImpl extends ObservationImpl implements ResponseModeToScene {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseModeToSceneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.RESPONSE_MODE_TO_SCENE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseModeToSceneTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseModeToSceneOperations.validateResponseModeToSceneTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseModeToSceneMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseModeToSceneOperations.validateResponseModeToSceneMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseModeToSceneCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseModeToSceneOperations.validateResponseModeToSceneCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseModeToSceneCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseModeToSceneOperations.validateResponseModeToSceneCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseModeToSceneValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseModeToSceneOperations.validateResponseModeToSceneValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseModeToSceneValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseModeToSceneOperations.validateResponseModeToSceneValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseModeToSceneResponseModeQualifier(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseModeToSceneOperations.validateResponseModeToSceneResponseModeQualifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseModeQualifier getResponseModeQualifier() {
		return ResponseModeToSceneOperations.getResponseModeQualifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseModeToScene init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResponseModeToScene init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ResponseModeToSceneImpl
