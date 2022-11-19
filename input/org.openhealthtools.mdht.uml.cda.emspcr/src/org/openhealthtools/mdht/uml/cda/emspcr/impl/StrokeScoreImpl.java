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
import org.openhealthtools.mdht.uml.cda.emspcr.StrokeScore;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.StrokeScoreOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stroke Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StrokeScoreImpl extends ObservationImpl implements StrokeScore {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrokeScoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.STROKE_SCORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeScoreTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrokeScoreOperations.validateStrokeScoreTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeScoreMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrokeScoreOperations.validateStrokeScoreMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeScoreCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrokeScoreOperations.validateStrokeScoreCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeScoreCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrokeScoreOperations.validateStrokeScoreCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeScoreEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrokeScoreOperations.validateStrokeScoreEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeScoreValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrokeScoreOperations.validateStrokeScoreValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeScoreValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrokeScoreOperations.validateStrokeScoreValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeScoreMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrokeScoreOperations.validateStrokeScoreMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeScoreMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrokeScoreOperations.validateStrokeScoreMethodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeScore init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StrokeScore init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // StrokeScoreImpl
